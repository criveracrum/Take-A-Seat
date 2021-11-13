DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS prices;
DROP TABLE IF EXISTS amenities;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS employees;
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
CREATE TABLE prices (
    id serial PRIMARY KEY NOT NULL,
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
CREATE TABLE employees(
    id serial PRIMARY KEY,
    emp_id VARCHAR(10),
    fullname VARCHAR(255),
    birthdate DATE
);
CREATE TABLE team(
    id serial PRIMARY KEY,
    teamname VARCHAR(20),
    employeecount VARCHAR(3)
)