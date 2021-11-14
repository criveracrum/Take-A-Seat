INSERT INTO spaces(space_name, workspace_type)
VALUES ('Coffee Machine', 'AMENITY'),
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
INSERT INTO amenities (space_id, amenity_name, workspace_type)
VALUES (1, 'Coffee Machine', 'AMENITY'),
    (2, 'Espresso Machine', 'AMENITY'),
    (3, 'Microwave', 'AMENITY'),
    (4, 'Projector', 'AMENITY'),
    (5, 'Toaster', 'AMENITY'),
    (6, 'TV', 'AMENITY'),
    (7, 'Radio', 'AMENITY'),
    (8, 'Speakers', 'AMENITY');
INSERT INTO workspace(
        space_id,
        workspacename,
        max_size,
        workspace_type
    )
VALUES (9, 'Desk', 1, 'WORKSPACE'),
    (10, 'Booth', 4, 'WORKSPACE'),
    (11, 'Cubicle', 1, 'WORKSPACE'),
    (12, 'Conference Room', 20, 'WORKSPACE'),
    (13, 'High Top', 4, 'WORKSPACE'),
    (14, 'Double Desk', 2, 'WORKSPACE'),
    (15, 'Meeting Room', 6, 'WORKSPACE');
INSERT INTO employees(emp_id, fullname, birthdate)
VALUES ('2', 'Tom Select', '1981-06-01'),
    ('4', 'Johnny Appleseed', '1972-07-30');
INSERT INTO team(id, teamname, employeecount)
VALUES ('404', 'Team not Found', '5'),
    ('007', 'The Bonds', '2'),
    ('452', 'Enterprise Computers', '15');
INSERT INTO reservations(
        reservation_num,
        res_date,
        creator_id,
        space_type,
        space_id
    )
VALUES ('11111', '2021-10-19 12:00:00', 1, 'AMENITY', 1),
    ('22222', '2021-10-31 13:30:00', 1, 'AMENITY', 2);