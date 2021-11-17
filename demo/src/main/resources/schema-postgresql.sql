DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS price;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS amenities;
DROP TABLE IF EXISTS workspace;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS team;
DROP TABLE IF EXISTS price;
DROP TABLE IF EXISTS authority;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS users_authority;

DROP SEQUENCE IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 20;
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
    buildingName varchar(30),
    desks int,
    booth int, 
    cubicle int, 
    hightop int, 
    conferenceRoom int,
    doubleDesk int,
    meetingRoom int
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
);

create table authority (
    id serial primary key,
    name varchar(15)
);

create table users (
    id serial primary key,
    username varchar(15),
    password varchar(80)
);

create table users_authority (
    authority_id int,
    user_id int
);