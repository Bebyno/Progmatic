CREATE DATABASE IF NOT EXISTS schoolMembers;

USE schoolMembers;

CREATE TABLE IF NOT EXISTS member_table(
id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
e_mail VARCHAR(50),
PRIMARY KEY (id)  
);

SELECT * FROM member_table;

ALTER TABLE member_table ADD phoneNumber LONG;
ALTER TABLE member_table ADD favoritColor VARCHAR(20) DEFAULT "nincs";
ALTER TABLE member_table ADD favoritSong VARCHAR(20) DEFAULT "nincs";
ALTER TABLE member_table MODIFY COLUMN e_mail VARCHAR(20) DEFAULT "@gmail";
ALTER TABLE member_table ADD favoritSong VARCHAR(20) DEFAULT "nincs";

ALTER TABLE member_table ADD married BOOLEAN DEFAULT 0;
INSERT INTO member_table(`married`) VALUES (1);
ALTER TABLE member_table ADD married2 BOOLEAN DEFAULT 0;
ALTER TABLE member_table DROP COLUMN married;
