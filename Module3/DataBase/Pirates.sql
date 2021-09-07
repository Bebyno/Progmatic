DROP DATABASE IF EXISTS Pirates;

CREATE DATABASE /* IF NOT EXISTS */ Pirates;

USE Pirates;


CREATE TABLE /* IF NOT EXISTS */ pirate(
id INT UNSIGNED AUTO_INCREMENT,
pirate_name VARCHAR(50),
drunkLVL ENUM(
	'CLEARHEADED',
    'PICKLED',
    'DRUNK',
    'DRUNKASHELL'
),
canFight boolean,
status ENUM(
	'WEAK',
    'NORMAL',
    'STRONG',
    'CAPTAIN'
    ),
    PRIMARY KEY (id)
    );


CREATE TABLE /* IF NOT EXISTS */ ship(
ship_name VARCHAR(50),
state ENUM(
	'GOODCONDITION',
    'SHATTERED',
    'ALMOSTWRECKED'
),
PRIMARY KEY (ship_name)

);

INSERT INTO pirate(pirate_name,drunkLVL,canFight,status) VALUES
('James',1,true,2),
('Joe',3,true,1),
('Will',2,true,3),
('Jim',1,true,1),
('BlackBird',1,true,4);

INSERT INTO ship(ship_name,state) VALUES
('Black Pearl',1),
('White Pearl',1);

SELECT * FROM pirate;
