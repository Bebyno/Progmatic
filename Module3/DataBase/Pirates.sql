DROP DATABASE IF EXISTS Pirates;

CREATE DATABASE /* IF NOT EXISTS */ Pirates;

USE Pirates;


CREATE TABLE /* IF NOT EXISTS */ pirate(
pirate_id INT UNSIGNED AUTO_INCREMENT,
pirate_name VARCHAR(50),
drunkLVL ENUM(
	'CLEARHEADED',
    'PICKLED',
    'DRUNK',
    'DRUNKASHELL'
),
canFight boolean DEFAULT true,
status ENUM(
	'WEAK',
    'NORMAL',
    'STRONG',
    'CAPTAIN'),
    PRIMARY KEY (pirate_id)
    );

CREATE TABLE /* IF NOT EXISTS */ ship(
ship_name VARCHAR(50),
state ENUM(
	'GOODCONDITION',
    'SHATTERED',
    'ALMOSTWRECKED'),
    captain_name VARCHAR(50),
PRIMARY KEY (ship_name)
/*FOREIGN KEY (captain_name) REFERENCES captain(captain_name)*/
);

CREATE TABLE /* IF NOT EXISTS */ captain(
/*captain_id INT UNSIGNED AUTO_INCREMENT,*/
captain_name VARCHAR(50),
rumOwned INT,
ship_name VARCHAR(50),
PRIMARY KEY (captain_name)
/*FOREIGN KEY (ship_name) REFERENCES ship(ship_name)*/
);

CREATE TABLE /* IF NOT EXISTS */ ship_captain(
id INT UNSIGNED AUTO_INCREMENT,
ship_name VARCHAR(50),
captain_name VARCHAR(50),
PRIMARY KEY (id),
FOREIGN KEY (ship_name) REFERENCES ship(ship_name),
FOREIGN KEY (captain_name) REFERENCES captain(captain_name)
);


/*
SELECT pirate_name FROM pirate WHERE pirate.status = 4 /  'CAPTAIN'

INSERT INTO `table2` (`field_name2`) SELECT `field_name` FROM `table1`
*/

INSERT INTO pirate(pirate_name,drunkLVL,status) VALUES
('James',1,2),
('Joe',3,1),
('Will',2,3),
('Jim',1,1),
('BlackBird',1,4);

INSERT INTO ship(ship_name,state) VALUES
('Black Pearl',1),
('White Pearl',1);



INSERT INTO captain(captain_name) SELECT pirate_name FROM pirate WHERE pirate.status= 4; 
/*INSERT INTO captain(rumOwned) VALUES
(3);*/


SELECT * FROM captain;
-- SELECT * FROM ship; --

