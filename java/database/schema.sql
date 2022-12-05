BEGIN TRANSACTION;


DROP TABLE IF EXISTS event_song;
DROP TABLE IF EXISTS dj_playlist;
DROP TABLE IF EXISTS song_genre;
DROP TABLE IF EXISTS event_genre;
DROP TABLE IF EXISTS event_host;
DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS genre_dj;
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
    genre_id SERIAL,
	genre_name varchar(60),

	CONSTRAINT PK_genre PRIMARY KEY (genre_id)
);

CREATE TABLE genre_dj(
    genre_dj_id SERIAL,
    genre_id int NOT NULL,
    dj_id int NOT NULL,

    CONSTRAINT PK_genre_dj PRIMARY KEY (genre_dj_id),
    CONSTRAINT FK_genre FOREIGN KEY (genre_id) REFERENCES genre (genre_id),
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
	event_id int NOT NULL


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
CREATE TABLE dj_playlist(
	genre_dj_id SERIAL NOT NULL,
	song_id SERIAL NOT NULL,

	CONSTRAINT PK_dj_playlist PRIMARY KEY (genre_dj_id, song_id),
	CONSTRAINT FK_dj_playlist_user_id FOREIGN KEY (genre_dj_id) REFERENCES users(user_id),
	CONSTRAINT FK_dj_playlist_song_id FOREIGN KEY (song_id) REFERENCES song(song_id)
);
CREATE TABLE event_song(
	event_id int NOT NULL,
	song_id int NOT NULL,
	song_order int,

	CONSTRAINT PK_event_song PRIMARY KEY (event_id, song_id),
	CONSTRAINT FK_event_song_event_id FOREIGN KEY (event_id) REFERENCES event(event_id),
	CONSTRAINT FK_event_song_song_id FOREIGN KEY (song_id) REFERENCES song(song_id)
);


COMMIT TRANSACTION;
