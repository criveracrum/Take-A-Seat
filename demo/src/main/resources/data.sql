INSERT INTO amenities (amenity_name) VALUES
    ('Coffee Machine'),
    ('Espresso Machine'),
    ('Microwave'),
    ('Projector'),
    ('Toaster'),
    ('TV'),
    ('Radio'),
    ('Speakers');

INSERT INTO workspace(workspacename, max_size) VALUES
    ('Desk', 1 ),
    ('Desk', 1 ),
    ('Desk', 1 ),
    ('Desk', 1 ),
    ('Desk', 1 ),
    ('Booth', 4 ),
    ('Cubicle', 1 ),
    ('Conference Room', 20 ),
    ('High Top', 4 ),
    ('Double Desk', 2 ),
    ('Meeting Room', 6 );


INSERT INTO spaces(space_name, workspace_type) VALUES
    ('Coffee Machine', 'AMENITY'),
    ('Espresso Machine', 'AMENITY'),
    ('Microwave', 'AMENITY'),
    ('Projector', 'AMENITY'),
    ('Toaster', 'AMENITY'),
    ('TV', 'AMENITY'),
    ('Radio', 'AMENITY'),
    ('Speakers', 'AMENITY'),
    ('Desk', 'WORKSPACE'),
    ('Booth', 'WORKSPACE'),
    ('Cubicle', 'WORKSPACE'),
    ('Conference Room', 'WORKSPACE'),
    ('High Top', 'WORKSPACE'),
    ('Double Desk', 'WORKSPACE'),
    ('Meeting Room', 'WORKSPACE');


INSERT INTO amenities (space_id, amenity_name, workspace_type) VALUES
    (1, 'Coffee Machine', 'AMENITY'),
    (2, 'Espresso Machine', 'AMENITY'),
    (3, 'Microwave', 'AMENITY'),
    (4, 'Projector', 'AMENITY'),
    (5, 'Toaster', 'AMENITY'),
    (6, 'TV', 'AMENITY'),
    (7, 'Radio', 'AMENITY'),
    (8, 'Speakers', 'AMENITY');

    

INSERT INTO workspace(space_id, workspacename, max_size, workspace_type) VALUES
 (9, 'Desk', 1, 'WORKSPACE'),
 (10, 'Booth', 4, 'WORKSPACE' ),
 (11, 'Cubicle', 1, 'WORKSPACE' ),
 (12, 'Conference Room', 20, 'WORKSPACE' ),
 (13, 'High Top', 4, 'WORKSPACE' ),
 (14, 'Double Desk', 2, 'WORKSPACE' ),
 (15, 'Meeting Room', 6 , 'WORKSPACE');
 
INSERT INTO employees(fullname, birthdate) VALUES
    ('Tom Select', '1981-06-01'),
    ('Johnny Appleseed', '1972-07-30');

INSERT INTO reservations(reservation_num, res_date, creator_id, space_type, space_id) VALUES
    ('11111', '2021-10-19 12:00:00', 1, 'WORKSPACE', 1),
    ('22222', '2021-10-31 13:30:00', 1, 'AMENITY', 2);

INSERT INTO price(workspace_size, price) VALUES
    (1, 20),
    (2, 35),
    (4, 50),
    (6, 70),
    (20, 150);

INSERT INTO building(buildingName, desks, booth, cubicle, hightop, conferenceRoom, doubleDesk, meetingRoom) VALUES
    ('25 E Jackson', 5, 2, 1, 1, 2, 8, 1),
    ('243 S Wabash', 2, 6, 10, 4, 1, 8, 4),
    ('14 E Jackson', 1, 5, 3, 7, 2, 8, 1);