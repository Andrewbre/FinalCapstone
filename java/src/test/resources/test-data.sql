BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO users (username,password_hash,role) VALUES ('dj1','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('dj2','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('dj3','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('host1','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('host2','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('host3','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');


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


INSERT INTO users (username,password_hash,role) VALUES ('user1','user1','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('user2','user2','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('user3','user3','ROLE_USER');


INSERT INTO Song (song_id, artist_id, song_name, featured_artist) VALUES ('1', '2','9', 'Cher');
INSERT INTO Song (song_id, artist_id, song_name, featured_artist)  VALUES ('3','4','5','Snoop Dog');
INSERT INTO Song (song_id, artist_id, song_name, featured_artist) VALUES ('5','6','11','Sting');


COMMIT TRANSACTION;
