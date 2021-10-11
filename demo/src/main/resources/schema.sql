DROP TABLE IF EXISTS Amenities;
DROP TABLE IF EXISTS Workspace;
DROP TABLE IF EXISTS Team;
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
    id serial PRIMARY KEY,
    fullname VARCHAR(255),
    birthdate DATE
);
CREATE TABLE Team(
    id serial PRIMARY KEY,
    teamName VARCHAR,
    employeeCount INT
);
CREATE TABLE Amenities(
    amenityID serial PRIMARY KEY,
    amenityName VARCHAR(10)
);
CREATE TABLE workspace(
    workspaceID serial PRIMARY KEY,
    workspacename VARCHAR(10),
    amenityID INT,
    maxSize INT NOT NULL
);