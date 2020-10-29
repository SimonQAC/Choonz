INSERT INTO users (user_name,password) VALUES
('Dank Adam', '123456'),
('Simon P', '123456'),
('Sangiv D', '123456'),
('M Joni', '123456');

INSERT INTO playlist (name,artwork, description, users_user_id) VALUES
('Chill', 'img/test-playlist.png', 'My friend, it is good!', 1),
('Super Chill', 'img/test-playlist2.png', 'My friend, it is very good!', 2),
('Club Banger', 'img/test-playlist3.png', 'My friend, it is very very good!',3),
('UK Garage Mix', 'img/test-playlist4.png', 'My friend, it is extremely good!',4);

INSERT INTO artist (name) VALUES ('Chris Brown'),('The Weeknd'),('Post Malone'),('Lana Del Rey');

INSERT INTO genre (name,description) VALUES
('Pop', 'I like it always'),
('RnB', 'I like it when I am hyped'),
('Rock', 'I like it when I am at the gym'),
('Jazz', 'I like it when I am the bar'),
('Blues', 'I like it when I am in my zone');

INSERT INTO album (name,cover, artist_id, genre_id) VALUES
('Royalty', 'img/royalty.jpg',1,2),
('X', 'img/xchrisbrown.jpg',1,2),
('Starboy', 'img/starboy.jpg',2,1),
('AfterHours', 'img/afterhours.jpg',2,1),
('BeerBongs and Bentleys', 'img/beerbong.jpg',3,2),
('Lust for Life', 'img/lustforlife.jpg',4,5);

INSERT INTO track (name, duration, lyrics, album_id, artist_id, playlist_id) VALUES
('I feel it coming', 5, 'I feel it coming', 3, 2, 1),
('Rockstar', 5, 'I feel it coming', 5, 3, 1),
('When I see', 5, 'When I see you eyes', 6, 4, 1),
('Royalty', 5, 'Jude Jude Jud', 1, 1, 1),
('Grass aint greener', 5, 'Blah blah blah', 2, 1, 1);

