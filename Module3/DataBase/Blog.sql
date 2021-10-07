DROP DATABASE IF EXISTS Blog;

CREATE DATABASE Blog;

USE Blog;

CREATE TABLE users(
RegID INT UNSIGNED AUTO_INCREMENT,
name VARCHAR(50),
password VARCHAR(50),
email VARCHAR(30) UNIQUE,
birth DATE,
roll ENUM(					
'USER',
'MODERATOR',
'ADMIN')
DEFAULT 'USER',
PRIMARY KEY(RegID) 				-- email cím legyen??--
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
whosBlogId INT,
PRIMARY KEY(SablonID)
);



CREATE TABLE userBlogWrites(	-- blogon belül --
WriteID INT UNSIGNED,
title VARCHAR(20),
picture BLOB,
BlogWriteID INT UNSIGNED,
PRIMARY KEY(WriteID),
FOREIGN KEY (BlogWriteID) REFERENCES users(RegID)
);
CREATE TABLE moreEntryInTheSameBlog(
entryID INT UNSIGNED,
text VARCHAR(500),
BlogWriteID INT UNSIGNED,
PRIMARY KEY(entryID),
FOREIGN KEY (BlogWriteID) REFERENCES userBlogWrites(WriteID)
);

CREATE TABLE comments(
CommentID INT UNSIGNED,
PplcommentID INT UNSIGNED,
commentText VARCHAR(500),
PRIMARY KEY(CommentID),
FOREIGN KEY (PplcommentID) REFERENCES moreEntryInTheSameBlog(entryID)
);
/*
CREATE TABLE users_userBlogs(
ID INT UNSIGNED AUTO_INCREMENT,
RegID INT UNSIGNED,
BlogID INT UNSIGNED,
PRIMARY KEY (ID),
FOREIGN KEY (RegID) REFERENCES users(RegID),
FOREIGN KEY (BlogID) REFERENCES userBlogs(BlogID)
);
*/
/*
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
*/

INSERT INTO users(name,password,email,birth)VALUES
('Johan','admin','asd@aaaa','2011.04.27'),
('Will','12345','Will@freemail','1991.01.17'),
('Boldizsar','asdasd','troll@trollokEverywhere','1500.01.01');

INSERT INTO blogSablon(SablonID,blogSablonName,category,color,whosBlogId) VALUES
(1,'Animals','dogs','RED',1),
(2,'Hobby','music','GREEN',1),				
(3,'Histroy','II. World war','blue',2),
(4,'Cooking','Spageti','red',3);



INSERT INTO userBlogWrites(WriteID,title,BlogWriteID) VALUES
('1',"dogs",1),
('2',"cats",2),
('3',"natives",2);

INSERT INTO moreEntryInTheSameBlog(entryID,text,BlogWriteID) VALUES
(1,"Lie!",2),
(2,"cats are funny ",2),
(3,"cats are asdasdavevd!",2),
(4,"meow",3);

INSERT INTO comments(CommentID,commentText,PplcommentID) VALUES
('1',"vau",1),
('2',"vausss",1),
('3',"meow",3);


SELECT users.name AS Blogger,userBlogWrites.title AS BloggTitle,userBlogWrites.BlogWriteID AS BloggersID,
moreEntryInTheSameBlog.text AS Blog_text,comments.commentText,comments.PplcommentID AS CommentID 
FROM users
LEFT JOIN userBlogWrites ON users.RegID = userBlogWrites.BlogWriteID
LEFT JOIN moreEntryInTheSameBlog ON userBlogWrites.WriteID = moreEntryInTheSameBlog.BlogWriteID
LEFT JOIN comments ON moreEntryInTheSameBlog.entryID = comments.PplcommentID;
