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
    /*
    rumOwned INT DEFAULT -1,
ship_name VARCHAR(50),
    */
    
    );
    
    
    

CREATE TABLE /* IF NOT EXISTS */ ship(
ship_id INT UNSIGNED AUTO_INCREMENT,
ship_name VARCHAR(50),
state ENUM(
	'GOODCONDITION',
    'SHATTERED',
    'ALMOSTWRECKED'),
    captain_name VARCHAR(50),
PRIMARY KEY (ship_id)
/*FOREIGN KEY (ship_id) REFERENCES captain(ship_id)*/
);

CREATE TABLE /* IF NOT EXISTS */ captain(
pirate_id INT UNSIGNED,
/*captain_name VARCHAR(50)*/
rumOwned INT,
ship_id INT UNSIGNED,
PRIMARY KEY (pirate_id),
FOREIGN KEY (pirate_id) REFERENCES pirate(pirate_id),
FOREIGN KEY (ship_id) REFERENCES ship(ship_id)
);
/* JOIN !!*/


/*CREATE TABLE ship_captain(
id INT UNSIGNED AUTO_INCREMENT,
ship_id INT UNSIGNED AUTO_INCREMENT,
captain_ship_id INT UNSIGNED AUTO_INCREMENT,
PRIMARY KEY (id),
FOREIGN KEY (ship_id) REFERENCES ship(ship_id),
FOREIGN KEY (captain_ship_id) REFERENCES captain(ship_id)
);*/



/*
SELECT pirate_name FROM pirate WHERE pirate.status = 4 / 'CAPTAIN'

*/

INSERT INTO pirate(pirate_name,drunkLVL,status) VALUES
('James',1,2),
('Joe',3,1),
('Will',2,3),
('Jim',1,1),
('BlackBeard',1,4);

INSERT INTO ship(ship_id,ship_name,state) VALUES
(1,'Black Pearl',1),
(2,'White Pearl',1);

INSERT INTO captain(pirate_id,rumOwned,ship_id) VALUES 
(5,10,2),
(4,null,1);


SELECT pirate.*,captain.pirate_id AS is_captain,captain.rumOwned,captain.ship_id,ship.ship_name
FROM pirate
LEFT JOIN captain ON pirate.pirate_id = captain.pirate_id
LEFT JOIN ship ON captain.ship_id = ship.ship_id;

/*INSERT INTO captain(captain_name) SELECT pirate_name FROM pirate WHERE pirate.status= 4; */
/*INSERT INTO captain(rumOwned) VALUES
(3);*/


-- SELECT * FROM captain;
 SELECT * FROM ship;

