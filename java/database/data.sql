
<<<<<<< HEAD
INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO users (username,password_hash,role) VALUES ('dj1','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('dj2','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('dj3','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('host1','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('host2','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('host3','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');


INSERT INTO genre (genre_name, dj_id) VALUES ('party', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('pop', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('rap', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('country', 2);
INSERT INTO genre (genre_name, dj_id) VALUES ('alternative', 2);
INSERT INTO genre (genre_name, dj_id) VALUES ('rock', 3);
INSERT INTO genre (genre_name, dj_id) VALUES ('metal', 3);
INSERT INTO genre (genre_name, dj_id) VALUES ('classical', 3);


INSERT INTO genre (genre_name, dj_id) VALUES ('party', '1');
INSERT INTO genre (genre_name, dj_id) VALUES ('pop', '1');
INSERT INTO genre (genre_name, dj_id) VALUES ('rap', '1');
INSERT INTO genre (genre_name, dj_id) VALUES ('country', '2');
INSERT INTO genre (genre_name, dj_id) VALUES ('alternative', '2');
INSERT INTO genre (genre_name, dj_id) VALUES ('rock', '3');
INSERT INTO genre (genre_name, dj_id) VALUES ('metal', '3');
INSERT INTO genre (genre_name, dj_id) VALUES ('classical', '3');


INSERT INTO artist (artist_name) VALUES ('Outkast');
INSERT INTO artist (artist_name) VALUES ('Black Eyed Peas');
INSERT INTO artist (artist_name) VALUES ('Post Malone');
INSERT INTO artist (artist_name) VALUES ('Lizzo');
INSERT INTO artist (artist_name) VALUES ('Lady Gaga');
INSERT INTO artist (artist_name) VALUES ('The Beatles');
INSERT INTO artist (artist_name) VALUES ('Billy Joel');


INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'Yeet', 'some party info', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'HowdyDoody', 'cowboy party i guess', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (3, 'Roger Rabbit', 'I am bored', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (2, 'Swash Buckle', 'whatever you want to do here', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'Big Day Party', 'blah blah lorem ipsum um', 'true');


INSERT INTO song (song_id, artist_id, song_name, featured_artist) VALUES ('1', '2','9', 'Cher');
INSERT INTO song (song_id, artist_id, song_name, featured_artist)  VALUES ('3','4','5','Snoop Dog');
INSERT INTO song (song_id, artist_id, song_name, featured_artist) VALUES ('5','6','11','Sting');
=======

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

DROP TABLE IF EXISTS event_song;
DROP TABLE IF EXISTS song_genre;
DROP TABLE IF EXISTS event_genre;
DROP TABLE IF EXISTS event_host;
DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS genre;
DROP TABLE IF EXISTS users;


CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE genre(
	genre_id serial,
	genre_name varchar(60),
	dj_id int NOT NULL,
    CONSTRAINT PK_genre PRIMARY KEY (genre_id),
	CONSTRAINT FK_user FOREIGN KEY (dj_id) REFERENCES users (user_id)
);


CREATE TABLE artist (
    artist_id SERIAL,
	artist_name varchar(60),

	CONSTRAINT PK_artist_id PRIMARY KEY (artist_id)
);

CREATE TABLE event (
	event_id serial NOT NULL,
	dj_id int NOT NULL,
	event_name varchar(150),
	information varchar(512),
	event_status bool,

	CONSTRAINT PK_event PRIMARY KEY (event_id),
	CONSTRAINT FK_event_dj_id FOREIGN KEY (dj_id) REFERENCES users(user_id)

);

CREATE TABLE song (
	song_id serial,
	artist_id int NOT NULL,
	song_name varchar(60),
	featured_artist varchar(60),

	CONSTRAINT PK_song PRIMARY KEY (song_id),
	CONSTRAINT FK_song_artist_id FOREIGN KEY (artist_id) REFERENCES artist(artist_id)
);

CREATE TABLE event_host (
	host_id int NOT NULL,
	event_id int NOT NULL,
	CONSTRAINT PK_event_host PRIMARY KEY (host_id, event_id),
	CONSTRAINT FK_event_host_user_id FOREIGN KEY (host_id) REFERENCES users(user_id),
	CONSTRAINT FK_event_host_event_id FOREIGN KEY (event_id) REFERENCES event(event_id)
);

CREATE TABLE event_genre(
	genre_id int NOT NULL,
	event_id int NOT NULL,

	CONSTRAINT PK_event_genre PRIMARY KEY (genre_id, event_id),
	CONSTRAINT FK_event_genre_genre_id FOREIGN KEY (genre_id) REFERENCES genre(genre_id),
	CONSTRAINT FK_event_genre_event_id FOREIGN KEY (event_id) REFERENCES event(event_id)
);
CREATE TABLE song_genre(
	genre_id int NOT NULL,
	song_id int NOT NULL,

	CONSTRAINT PK_song_genre PRIMARY KEY (genre_id, song_id),
	CONSTRAINT FK_song_genre_genre_id FOREIGN KEY (genre_id) REFERENCES genre(genre_id),
	CONSTRAINT FK_song_genre_song_id FOREIGN KEY (song_id) REFERENCES song(song_id)
);


CREATE TABLE event_song(
	event_id int NOT NULL,
	song_id int NOT NULL,
	song_order int,
	isApproved bool,

	CONSTRAINT PK_event_song PRIMARY KEY (event_id, song_id),
	CONSTRAINT FK_event_song_event_id FOREIGN KEY (event_id) REFERENCES event(event_id),
	CONSTRAINT FK_event_song_id FOREIGN KEY (song_id) REFERENCES song(song_id)
);

COMMIT TRANSACTION;
>>>>>>> 89d7509dab3559fcb5719ffce92e589fca97ff29
