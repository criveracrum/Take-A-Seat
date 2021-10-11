DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Team;
CREATE TABLE Employee (
  id serial NOT NULL PRIMARY KEY,
  fullname VARCHAR(20),
  birthdate DATE,
  employeeID INT(4),
);
CREATE TABLE Team (
  id serial PRIMARY KEY,
  team_name VARCHAR(10),
  employeeCount INT(3),
);
CREATE TABLE TeamMembers (
  id serial PRIMARY KEY,
  teamID INT,
  employeeID INT
);