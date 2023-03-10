BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
INSERT INTO users (username,password_hash,role) VALUES ('Andy','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Brian','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Ethan','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_DJ');
INSERT INTO users (username,password_hash,role) VALUES ('Karly','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('Walt','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');
INSERT INTO users (username,password_hash,role) VALUES ('Elijah','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_HOST');

INSERT INTO genre (genre_name, dj_id) VALUES ('90s', 1);

INSERT INTO artist (artist_name) VALUES ('Cher');
INSERT INTO artist (artist_name) VALUES ('Snoop Dog');
INSERT INTO artist (artist_name) VALUES ('Third Eye Blind');
INSERT INTO artist (artist_name) VALUES ('Ace of Base');
INSERT INTO artist (artist_name) VALUES ('blink-182');
INSERT INTO artist (artist_name) VALUES ('2Pac');
INSERT INTO artist (artist_name) VALUES ('Stone Temple Pilots');
INSERT INTO artist (artist_name) VALUES ('The Goo Goo Dolls');
INSERT INTO artist (artist_name) VALUES ('Marcy Playground');
INSERT INTO artist (artist_name) VALUES ('Lifehouse');
INSERT INTO artist (artist_name) VALUES ('311');
INSERT INTO artist (artist_name) VALUES ('TLC');
INSERT INTO artist (artist_name) VALUES ('Savage Garden');
INSERT INTO artist (artist_name) VALUES ('Semisonic');
INSERT INTO artist (artist_name) VALUES ('Train');
INSERT INTO artist (artist_name) VALUES ('Boyz II Men');
INSERT INTO artist (artist_name) VALUES ('Seal');
INSERT INTO artist (artist_name) VALUES ('Sir Mix-A-Lot');
INSERT INTO artist (artist_name) VALUES ('Cypress Hill');
INSERT INTO artist (artist_name) VALUES ('Tonic');
INSERT INTO artist (artist_name) VALUES ('Counting Crows');
INSERT INTO artist (artist_name) VALUES ('Oasis');
INSERT INTO artist (artist_name) VALUES ('The Offspring');
INSERT INTO artist (artist_name) VALUES ('Ace of Bases');
INSERT INTO artist (artist_name) VALUES ('Dido');
INSERT INTO artist (artist_name) VALUES ('Pearl Jam');
INSERT INTO artist (artist_name) VALUES ('Soundgarden');
INSERT INTO artist (artist_name) VALUES ('Jennifer Lopez');
INSERT INTO artist (artist_name) VALUES ('GreenDay');
INSERT INTO artist (artist_name) VALUES ('Shania Twain');
INSERT INTO artist (artist_name) VALUES ('The Cranberries');
INSERT INTO artist (artist_name) VALUES ('Rob Zombie');
INSERT INTO artist (artist_name) VALUES ('Will Smith');
INSERT INTO artist (artist_name) VALUES ('Wu-Tang Clan');
INSERT INTO artist (artist_name) VALUES ('Spice Girls');
INSERT INTO artist (artist_name) VALUES ('Miss Elliott');
INSERT INTO artist (artist_name) VALUES ('Whitney Houston');
INSERT INTO artist (artist_name) VALUES ('Nirvana');
INSERT INTO artist (artist_name) VALUES ('House of Pain');
INSERT INTO artist (artist_name) VALUES ('Lauryn Hill');
INSERT INTO artist (artist_name) VALUES ('Salt-N-Pepa');
INSERT INTO artist (artist_name) VALUES ('Fiona Apple');
INSERT INTO artist (artist_name) VALUES ('Korn');
INSERT INTO artist (artist_name) VALUES ('Diana King');
INSERT INTO artist (artist_name) VALUES ('Gorillaz');
INSERT INTO artist (artist_name) VALUES ('New Kids on The Block');
INSERT INTO artist (artist_name) VALUES ('Rage Against The Machine');
INSERT INTO artist (artist_name) VALUES ('Jimmy Ray');
INSERT INTO artist (artist_name) VALUES ('Gorillazs');
INSERT INTO artist (artist_name) VALUES ('New Kids on The Blocks');
INSERT INTO artist (artist_name) VALUES ('Rage Against The Machines');
INSERT INTO artist (artist_name) VALUES ('Jimmy Rays');


INSERT INTO event (dj_id, event_name, information, street_address, city, state, event_status)
VALUES (1, 'Graduation Celebration', 'CONGRATS TO COHORT 13!', '901 Pennsylvania Ave', 'Pittsburgh', 'PA', 'true');
INSERT INTO event (dj_id, event_name, information, street_address, city, state, event_status)
VALUES (1, 'Super Bowl Party', 'Go Steelers!', 'Heinz Field', 'Pittsburgh', 'PA', 'true');
INSERT INTO event (dj_id, event_name, information, street_address, city, state, event_status)
VALUES (1, 'Picklesburgh', 'I used to be a cucumber', 'Roberto Clemente Bridge' 'Pittsburgh', 'PA', 'true');
INSERT INTO event (dj_id, event_name, information, street_address, city, state, event_status)
VALUES (1, 'Holiday Market After Party', 'Celebrate the Holiday Season!', 'Market Square', 'Pittsburgh', 'PA', 'true');
INSERT INTO event (dj_id, event_name, information, street_address, city, state, event_status)
VALUES (1, 'Sunday Brunch', 'Starts at 11:00AM!', 'Pittsburgh', 'Grand Concourse', 'PA', 'true');


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


INSERT INTO event_genre(genre_id, event_id) VALUES (1, 1);
INSERT INTO event_genre(genre_id, event_id) VALUES (1, 2);
INSERT INTO event_genre(genre_id, event_id) VALUES (1, 3);
INSERT INTO event_genre(genre_id, event_id) VALUES (1, 4);
INSERT INTO event_genre(genre_id, event_id) VALUES (1, 5);


INSERT INTO song_genre(genre_id, song_id) VALUES (1, 1);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 2);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 3);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 4);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 5);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 6);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 7);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 8);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 9);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 10);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 11);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 12);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 13);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 14);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 15);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 16);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 17);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 18);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 19);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 20);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 21);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 22);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 23);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 24);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 25);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 26);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 27);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 28);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 29);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 30);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 31);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 32);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 33);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 34);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 35);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 36);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 37);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 38);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 39);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 40);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 41);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 42);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 43);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 44);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 45);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 46);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 47);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 48);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 49);
INSERT INTO song_genre(genre_id, song_id) VALUES (1, 50);


INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 1, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 2, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 3, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 4, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 5, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 6, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 7, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 8, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 9, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 10, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 11, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 12, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 13, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 14, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 15, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 16, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 17, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 18, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 19,true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 20, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 21, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 22, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 23, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 24, true);


INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 25, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 26, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 27, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 28, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 29, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 30, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 31,true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 32, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 33, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 34, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 35, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 36, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (2, 37, true);


INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 38, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 39, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 40, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 41, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 42, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (3, 43, true);

INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 44, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 45, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 46, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 47, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 48, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 49, true);
INSERT INTO event_song(event_id, song_id, isapproved) VALUES (1, 50, true);



COMMIT TRANSACTION;
