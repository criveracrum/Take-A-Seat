DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS prices;

CREATE TABLE reservations (
    id serial  PRIMARY KEY NOT NULL,
    reservation_num varchar(10),
    date_created timestamp default current_timestamp,
    res_date timestamp,
    creator_id INT NOT NULL,
    workspace_type varchar
);

CREATE TABLE spaces (
    id serial  PRIMARY KEY NOT NULL,
    workspace_type varchar
);

CREATE TABLE  building (
    building_id serial PRIMARY KEY NOT NULL,
    building_name varchar
);

CREATE TABLE prices (
    id serial PRIMARY KEY NOT NULL,
    price SMALLINT
)