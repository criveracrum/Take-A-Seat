DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS prices;
DROP TABLE IF EXISTS amenities;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS team;
DROP SEQUENCE IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;
CREATE TABLE reservations (
    id serial PRIMARY KEY NOT NULL,
    reservation_num varchar(10),
    date_created timestamp default current_timestamp,
    res_date timestamp,
    creator_id INT NOT NULL,
    space_type varchar,
    space_id INT
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
CREATE TABLE spaces (
    space_id serial PRIMARY KEY NOT NULL,
    space_name VARCHAR(20),
    workspace_type varchar
);
CREATE TABLE amenities(
    id serial PRIMARY KEY,
    space_id integer,
    amenity_name VARCHAR(20),
    workspace_type varchar
);
CREATE TABLE workspace(
    id serial PRIMARY KEY,
    space_id integer,
    workspacename VARCHAR(20),
    max_size INT NOT NULL,
    workspace_type varchar
);
CREATE TABLE employees(
    id serial PRIMARY KEY,
    emp_id VARCHAR(10),
    fullname VARCHAR(255),
    birthdate DATE,
    team_id integer
);
CREATE TABLE team(
    team_id serial PRIMARY KEY,
    teamname VARCHAR(20)
)