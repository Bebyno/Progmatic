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
canFight boolean DEFAULT TRUE,
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
PRIMARY KEY (ship_name)

);
CREATE TABLE /* IF NOT EXISTS */ captain(
captain_id INT UNSIGNED AUTO_INCREMENT,
rumOwned INT,
ship_name VARCHAR(50),
PRIMARY KEY (captain_id),

FOREIGN KEY (ship_name) REFERENCES ship(ship_name)
);
INSERT INTO pirate(pirate_name,drunkLVL,status) VALUES
('James',1,2),
('Joe',3,1),
('Will',2,3),
('Jim',1,1),
('BlackBird',1,4);

INSERT INTO ship(ship_name,state) VALUES
('Black Pearl',1),
('White Pearl',1);

-- SELECT * FROM pirate; --
-- SELECT * FROM ship; --

