DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS prices;
DROP TABLE IF EXISTS amenities;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS team;
DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE reservations (
    id serial PRIMARY KEY NOT NULL,
    reservation_num varchar(10),
    date_created timestamp default current_timestamp,
    res_date timestamp,
    creator_id INT NOT NULL,
    space_type varchar,
    space_id INT NOT NULL
);
CREATE TABLE spaces (
    id serial PRIMARY KEY NOT NULL,
    workspace_type varchar
);
CREATE TABLE building (
    building_id serial PRIMARY KEY NOT NULL,
    building_name varchar
);
CREATE TABLE price (
    id serial PRIMARY KEY NOT NULL,
    workspace_size INT,
    price SMALLINT
);
CREATE TABLE amenities(
    id serial PRIMARY KEY,
    amenity_name VARCHAR(20)
);
CREATE TABLE workspace(
    id serial PRIMARY KEY,
    workspacename VARCHAR(20),
    max_size INT NOT NULL
);
CREATE TABLE employee(
    id serial PRIMARY KEY,
    fullname VARCHAR(255),
    birthdate DATE
);
CREATE TABLE team(
    id serial PRIMARY KEY,
    teamName VARCHAR(20),
    employeeCount INT
)