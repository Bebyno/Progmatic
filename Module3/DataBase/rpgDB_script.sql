DROP DATABASE IF EXISTS rpgDB;

CREATE DATABASE /* IF NOT EXISTS */ rpgDB;

USE rpgDB;

/* DROP TABLE IF EXISTS player */

CREATE TABLE /* IF NOT EXISTS */ player(
	username VARCHAR(50), -- szöveg nem lehet AUTO_INCREMENT!!!!!!!!!!!!!
	email_address VARCHAR(100) UNIQUE,
	reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (username)
);

/* DROP TABLE IF EXISTS playable_character */

CREATE TABLE /* IF NOT EXISTS */ playable_character (
	character_id INT UNSIGNED AUTO_INCREMENT,
    character_name VARCHAR(50),
	character_class ENUM(
		'mage',		-- 1
        'warrior',	-- 2
        'rogue',	-- 3
        'priest',	-- 4
        'shaman'	-- 5
    ),
	character_race ENUM(
		'human',
        'orc',
        'elf',
        'undead',
        'halfling'
    ),
	character_img BLOB,
	character_skill1 VARCHAR(50),
	character_skill2 VARCHAR(50),
	character_skill3 VARCHAR(50),
    PRIMARY KEY (character_id)
);

/* DROP TABLE IF EXISTS player_character */

CREATE TABLE /* IF NOT EXISTS */ player_character(
	id INT AUTO_INCREMENT,
	player_name VARCHAR(50),
	character_id INT UNSIGNED,
	PRIMARY KEY (id),
    FOREIGN KEY (player_name) REFERENCES player(username),
    FOREIGN KEY (character_id) REFERENCES playable_character(character_id)
);

/* DROP TABLE IF EXISTS game_session */

CREATE TABLE /* IF NOT EXISTS */ game_session(
	id INT AUTO_INCREMENT,
	game_end_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id)
);

/* DROP TABLE IF EXISTS game_session_and_character */

CREATE TABLE /* IF NOT EXISTS */ game_session_and_character(
	id INT AUTO_INCREMENT,
	game_session_id INT,
	player_char_id INT,
	character_lvl INT,
	character_xp INT,
	PRIMARY KEY (id),
    FOREIGN KEY (game_session_id) REFERENCES game_session(id),
    FOREIGN KEY (player_char_id) REFERENCES player_character(id)
);

SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO player(username, email_address) VALUES ('almáspite', 'almaspite@gmail.com');

INSERT INTO playable_character(character_name, character_class, character_race) VALUES('Don Quijote', 2, 1);

INSERT INTO player_character(id, player_name, character_id) VALUES(1, 'almáspite', 1);

INSERT INTO player VALUES
	('username', 'usermail.mail.u', '2021-03-03T09:46:41');