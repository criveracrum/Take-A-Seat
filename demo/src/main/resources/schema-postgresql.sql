DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS spaces;

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