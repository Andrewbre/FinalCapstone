BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO users (username,password_hash,role) VALUES ('Andy','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Brian','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Ethan','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Karly','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('Walt','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('Elijah','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');

INSERT INTO genre (genre_name, dj_id) VALUES ('party', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('pop', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('rap', 1);
INSERT INTO genre (genre_name, dj_id) VALUES ('country', 2);
INSERT INTO genre (genre_name, dj_id) VALUES ('alternative', 2);
INSERT INTO genre (genre_name, dj_id) VALUES ('rock', 3);
INSERT INTO genre (genre_name, dj_id) VALUES ('metal', 3);
INSERT INTO genre (genre_name, dj_id) VALUES ('classical', 3);

INSERT INTO artist (artist_name) VALUES ('Outkast');
INSERT INTO artist (artist_name) VALUES ('Black Eyed Peas');
INSERT INTO artist (artist_name) VALUES ('Post Malone');
INSERT INTO artist (artist_name) VALUES ('Lizzo');
INSERT INTO artist (artist_name) VALUES ('Lady Gaga');
INSERT INTO artist (artist_name) VALUES ('The Beatles');
INSERT INTO artist (artist_name) VALUES ('Billy Joel');

INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'Yeet', 'not a cowboy party', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'HowdyDoody', 'cowboy party i guess', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (3, 'Roger Rabbit', 'I am bored', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (2, 'Swash Buckle', 'Bling Zing A Do', 'true');
INSERT INTO event (dj_id, event_name, information, event_status)
VALUES (1, 'Big Day Party', 'Circus Like Fun Zone', 'true');


INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (1, 'Abba Jabba', 'Cher');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (2,'Gin and Juice','Snoop Dog');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (3,'Apple Fritz','Jimmy Buffet');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (4, 'Semi-Charmed Life', 'Third Eye Blind');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (5,'The Sign','Ace of Base');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (6,'All The Small Things','blink-182');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (7, 'California Love', '2Pac');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (8,'Interstate Love Song','Stone Temple Pilots');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (9,'Slide','The Goo Goo Dolls');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (10, 'Sex & Candy', 'Marcy Playground');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (11,'Hanging By a Moment','Lifehouse');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (12,'Down','311');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (13, 'No Scrubs', 'TLC');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (14,'Truly Madly Deeply','Savage Garden');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (15,'Closing Time','Semisonic');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (16, 'Drops of Jupiter', 'Train');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (17,'Ill Make Love To You','Boyz II Men');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (18,'Kiss from a Rose','Seal');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (19, 'Baby Got Back', 'Sir Mix-A-Lot');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (20,'Insane in the Brain','Cypress Hill');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (21,'If You Could Only See','Tonic');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (22, 'Mr.Jones', 'Counting Crows');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (23,'WonderWall','Oasis');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (24,'Pretty Fly(For a White Guy)','The Offspring');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (25, 'Life Is a Flower', 'Ace of Base');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (26,'Here With Me','Dido');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (27,'Alive','Pearl Jam');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (28, 'Black Hole Sun', 'Soundgarden');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (29,'Waiting for Tonight','Jennifer Lopez');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (30,'When I Come Around','Green Day');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (31, 'Creep', 'TLC');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (32,'Youre Still The One','Shania Twain');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (33,'Zombie','The Cranberries');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (34, 'Dragula', 'Rob Zombie');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (35,'Miami','Will Smith');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (36,'Protect Ya Neck','Wu-Tang Clan');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (37, 'Wannabe', 'Spice Girls');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (38,'The Rain(Supa Dupa Fly)','Miss Elliott');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (39,'I will Always Love You','Whitney Houston');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (40, 'Lithium', 'Nirvana');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (41,'Jump Around','House of Pain');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (42,'Doo Wop (That Thing)','Lauryn Hill');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (43, 'Whatta Man', 'Salt-N-Pepa');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (44,'Criminal','Fiona Apple');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (45,'Falling Away From Me','Korn');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (46,'Shy Guy','Diana King');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (47,'Clint Eastwood','Gorillaz');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (48, 'Step by Step', 'New Kids on The Block');
INSERT INTO Song (artist_id, song_name, featured_artist)  VALUES (49,'Bombtrack','Rage Against The Machine');
INSERT INTO Song (artist_id, song_name, featured_artist) VALUES (50,'Are You Jimmy Ray?','Jimmy Ray');


INSERT INTO event_genre(genre_id, event_id) VALUES (1, 2);
INSERT INTO event_genre(genre_id, event_id) VALUES (2, 2);
INSERT INTO event_genre(genre_id, event_id) VALUES (3, 2);
INSERT INTO event_genre(genre_id, event_id) VALUES (4, 2);
INSERT INTO event_genre(genre_id, event_id) VALUES (5, 2);

INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 1, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 2, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 3, true);

INSERT INTO song_genre(genre_id, song_id) VALUES (1, 1);
INSERT INTO song_genre(genre_id, song_id) VALUES (2, 2);
INSERT INTO song_genre(genre_id, song_id) VALUES (3, 3);

INSERT INTO event_host(event_id, host_id) VALUES (2, 5);
INSERT INTO event_host(event_id, host_id) VALUES (3, 6);

COMMIT TRANSACTION;
