INSERT INTO CLIENT (name)
VALUES ('Augustus'),
('Bonus'),
('Caelestis'),
('Invictus'),
('Minerva'),
('Diana'),
('Vesta'),
('Ceres'),
('Janus'),
('Vulcan');

INSERT INTO PLANET (id, name)
VALUES ('508', 'Ross'),
('357D', 'GJ'),
('40', 'Eridani'),
('B', 'Proxima '),
('219134', 'HD'),
('10C', 'Kepler');

INSERT INTO TICKET (client_id, from_planet_id, to_planet_id)
VALUES (1, '357D', '40'),
(2, '219134', '508'),
(3, '40', 'B'),
(4, '508', '219134'),
(5, '10C', '40'),
(6, '219134', '357D'),
(7, 'B', '10C'),
(8, '508', '40'),
(9, '40', '219134'),
(10, '219134', '10C');
