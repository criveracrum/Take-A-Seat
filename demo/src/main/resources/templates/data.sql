INSERT INTO Employee (fullname, birthdate)
VALUES (
    'Johnny Walker',
    '1950-05-02',
  ),
  (
    'Parker',
    '1983-11-09',
  );
INSERT INTO Team (team_name, employeeCount)
VALUES ('Left', '2',),
  ('Right', '1',);

INSERT INTO TeamMembers(employeeID) SELECT id FROM Employee WHERE fullname LIKE "Parker";
 UPDATE TeamMembers SET teamID = (SELECT id FROM Team WHERE employeeCount LIKE '1');
