DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS prices;
DROP TABLE IF EXISTS Amenities;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Team;
CREATE TABLE reservations (
    id serial PRIMARY KEY NOT NULL,
    reservation_num varchar(10),
    date_created timestamp default current_timestamp,
    res_date timestamp,
    creator_id INT NOT NULL,
    workspace_type varchar
);
CREATE TABLE spaces (
    id serial PRIMARY KEY NOT NULL,
    workspace_type varchar
);
CREATE TABLE building (
    building_id serial PRIMARY KEY NOT NULL,
    building_name varchar
);
CREATE TABLE prices (
    id serial PRIMARY KEY NOT NULL,
    price SMALLINT
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
CREATE TABLE Employee(
    id serial PRIMARY KEY,
    fullname VARCHAR(255),
    birthdate DATE
);
CREATE TABLE Team(
    id serial PRIMARY KEY,
    teamName VARCHAR(20),
    employeeCount INT
)