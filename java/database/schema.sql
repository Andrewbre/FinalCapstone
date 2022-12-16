BEGIN TRANSACTION;

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
	user_id SERIAL NOT NULL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,

	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE genre(
    genre_id SERIAL NOT NULL,
	genre_name varchar(60),
	dj_id int NOT NULL,

	CONSTRAINT PK_genre PRIMARY KEY (genre_id),
	CONSTRAINT FK_user FOREIGN KEY (dj_id) REFERENCES users (user_id)
);


CREATE TABLE artist (
    artist_id SERIAL NOT NULL,
	artist_name varchar(60),

	CONSTRAINT PK_artist_id PRIMARY KEY (artist_id)
);

CREATE TABLE event (
	event_id serial NOT NULL,
	dj_id int,
	event_name varchar(150),
	information varchar(512),
	street_address varchar(50),
	city varchar(50),
	state varchar(50),
	event_status bool,


	CONSTRAINT PK_event PRIMARY KEY (event_id),
	CONSTRAINT FK_event_dj_id FOREIGN KEY (dj_id) REFERENCES users(user_id)

);

CREATE TABLE song (
	song_id serial NOT NULL,
	artist_id int NOT NULL,
	song_name varchar(60),
	featured_artist varchar(60),
	spotify_id varchar(60),

	CONSTRAINT PK_song PRIMARY KEY (song_id),
	CONSTRAINT FK_song_artist_id FOREIGN KEY (artist_id) REFERENCES artist(artist_id)
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
	song_order int DEFAULT 0,
	isApproved bool DEFAULT FALSE,

	CONSTRAINT PK_event_song PRIMARY KEY (event_id, song_id),
	CONSTRAINT FK_event_song_event_id FOREIGN KEY (event_id) REFERENCES event(event_id),
	CONSTRAINT FK_event_song_id FOREIGN KEY (song_id) REFERENCES song(song_id)
);

CREATE TABLE event_host(
	event_id int NOT NULL,
	host_id int NOT NULL,
	CONSTRAINT PK_event_host PRIMARY KEY (event_id, host_id),
	CONSTRAINT FK_event FOREIGN KEY(event_id) REFERENCES event (event_id),
	CONSTRAINT FK_host FOREIGN KEY(host_id) REFERENCES users (user_id)
);


COMMIT TRANSACTION;