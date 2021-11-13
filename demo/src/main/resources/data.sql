INSERT INTO amenities (amenity_name)
VALUES ('Coffee Machine'),
    ('Espresso Machine'),
    ('Microwave'),
    ('Projector'),
    ('Toaster'),
    ('TV'),
    ('Radio'),
    ('Speakers');
INSERT INTO workspace(workspacename, max_size)
VALUES ('Desk', 1),
    ('Desk', 1),
    ('Desk', 1),
    ('Desk', 1),
    ('Desk', 1),
    ('Booth', 4),
    ('Cubicle', 1),
    ('Conference Room', 20),
    ('High Top', 4),
    ('Double Desk', 2),
    ('Meeting Room', 6);
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
VALUES (
        '11111',
        '2021-10-19 12:00:00',
        1,
        'WORKSPACE',
        1
    ),
    ('22222', '2021-10-31 13:30:00', 1, 'AMENITY', 2);