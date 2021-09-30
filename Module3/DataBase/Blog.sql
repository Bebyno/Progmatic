DROP DATABASE IF EXISTS Blog;

CREATE DATABASE Blog;

USE Blog;

CREATE TABLE registration(
RegID INT UNSIGNED AUTO_INCREMENT,
name VARCHAR(50),
password VARCHAR(50),
email VARCHAR(30) UNIQUE,
birth DATE,
PRIMARY KEY(RegID) 				-- email cím legyen--
);

CREATE TABLE permission(	-- is it necessary? heritage--
PerID INT UNSIGNED,
ranks ENUM(
'USER',
'MODERATOR',
'ADMIN'),
PRIMARY KEY(PerID)
);

CREATE TABLE blogSablon(
SablonID INT,
blogSablonName VARCHAR(50),
category VARCHAR(20),
color ENUM(
'GREEN',
'RED',
'BLUE'
),
backgroundPic BLOB,
PRIMARY KEY(SablonID)
);

CREATE TABLE userBlogs(		-- Több blog lehet --
BlogID INT UNSIGNED,
name VARCHAR(30),
PRIMARY KEY(BlogID)
);

CREATE TABLE userBlogWrites(	-- blogon belül --
WriteID INT UNSIGNED,
text VARCHAR(500),
picture BLOB,
PRIMARY KEY(WriteID)
);

CREATE TABLE comments(
CommentID INT UNSIGNED,
text VARCHAR(500),
PRIMARY KEY(CommentID)
);

CREATE TABLE registration_userBlogs(
ID INT UNSIGNED AUTO_INCREMENT,
RegID INT UNSIGNED,
BlogID INT UNSIGNED,
PRIMARY KEY (ID),
FOREIGN KEY (RegID) REFERENCES registration(RegID),
FOREIGN KEY (BlogID) REFERENCES userBlogs(BlogID)
);


CREATE TABLE registration_permission(
ID INT UNSIGNED AUTO_INCREMENT,
RegID INT UNSIGNED,
PerID INT UNSIGNED,
PRIMARY KEY (ID),
FOREIGN KEY (RegID) REFERENCES registration(RegID),
FOREIGN KEY (PerID) REFERENCES permission(PerID)
);

CREATE TABLE userBlogs_userBlogWrites(
ID INT UNSIGNED AUTO_INCREMENT,
BlogID INT UNSIGNED,
WriteID INT UNSIGNED,
PRIMARY KEY (ID),
FOREIGN KEY (BlogID) REFERENCES userBlogs(BlogID),
FOREIGN KEY (WriteID) REFERENCES userBlogWrites(WriteID)
);

CREATE TABLE userBlogWrites_comments(
ID INT UNSIGNED AUTO_INCREMENT,
WriteID INT UNSIGNED,
CommentID INT UNSIGNED,
PRIMARY KEY (ID),
FOREIGN KEY (WriteID) REFERENCES userBlogWrites(WriteID),
FOREIGN KEY (CommentID) REFERENCES comments(CommentID)
);


INSERT INTO registration(name,password,email,birth)VALUES
('Johan','admin','asd@aaaa','2011.04.27'),
('Will','12345','Will@freemail','1991.01.17'),
('Boldizsar','asdasd','troll@trollokEverywhere','1500.01.01');

INSERT INTO blogSablon(SablonID,blogSablonName,category,color) VALUES
(1,'Animals','dogs','RED'),
(4,'Hobby','music','GREEN'),
(3,'Histroy','II. World war','blue');

INSERT INTO userBlogs(BlogID,name) VALUES
('1','Animals'),
('2','Histroy');

SELECT registration.*, userBlogs.name FROM registration Left JOIN userBlogs ON registration.RegID = userBlogs.BlogID;

/*
SELECT pirate.*,captain.pirate_id AS is_captain,captain.rumOwned,captain.ship_id,ship.ship_name
FROM pirate
LEFT JOIN captain ON pirate.pirate_id = captain.pirate_id
LEFT JOIN ship ON captain.ship_id = ship.ship_id;*/


Select * from registration;
Select * from blogSablon;
Select * from userBlogs