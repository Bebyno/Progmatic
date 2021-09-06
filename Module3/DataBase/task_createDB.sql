-- 1. rész: adatbázis készítése (20 pont)

/*
Készíts adatbázist az alábbi leírás alapján!

Az általad létrehozott adatbázist egy üzenetküldő alkalmazáshoz szeretnénk használni.
Az alkalmazásban a felhasználók regisztrálás után tudnak üzenetet küldeni szintén regisztrált felhasználóknak, 
valamint a kapott üzenetekre válaszolhatnak. 
Nincs lehetőség több címzett megadására - azaz egy üzenetet csak egy felhasználó részére lehet küldeni.

Az adatbázisnak képesnek kell lennie a következő adatok tárolására:
    1. regisztrált felhasználók adatai
        - kötelező adatok: név, email-cím, jelszó, profilkép és regisztrálás időpontja
    2. a regisztrált felhasználók által egymásnak küldött üzenetek adatai
        - kötelező adatok: küldő, címzett, üzenet szövege, az üzenet küldésének időpontja, 
          továbbá ha az üzenet egy korábban kapottra válasz, akkor a megválaszolt üzenet

Kritériumok az adatbázissal kapcsolatban:
    - legalább kettő, legfeljebb négy táblát tartalmazzon
    - legyen legalább egy kapcsolat a létrehozott táblák között
      (egy tábla saját magával is kapcsolódhat)
    - a fent leírt adatokon kívül más adatokat is tárolhat, de egy táblán legfeljebb 8 mező lehet
    - az adatbázis, a táblák és a mezők elnevezése rajtad áll, azonban használj angol,
      az adatbázisoknál elfogadott konvencióknak megfelelő neveket

Amit meg kell írnod:
    - adatbázis létrehozásának (és használatának) MySQL utasítása
    - a táblák létrehozásának MySQL utasítása
    - a táblák mezőinek létrehozásához és beállításához szükséges MySQL utasítások

BÓNUSZ (nem kötelezően megírandó):
    - tesztadatok adatbázisba rögzítésének MySQL utasítása (tesztadatokkal együtt)
    
Az elvárt utasításokat ebbe a fájlba írd! Jelen leírás törölhető.
*/
DROP DATABASE IF EXISTS messanger;
CREATE DATABASE IF NOT EXISTS messanger;
USE messanger;

DROP TABLE IF EXISTS reg_info;
CREATE TABLE IF NOT EXISTS reg_info (
id INT NOT NULL UNIQUE AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
e_mail VARCHAR(50) NOT NULL UNIQUE,
reg_password VARCHAR(12) NOT NULL UNIQUE,
avatar LONGBLOB,
reg_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY(id)

);

DROP TABLE IF EXISTS private_message;
CREATE TABLE IF NOT EXISTS private_message (
id INT NOT NULL UNIQUE AUTO_INCREMENT,
sender INT NOT NULL,
to_whom  INT NOT NULL,
message VARCHAR(500),
when_sendid TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
answer INT,
PRIMARY KEY(id),
FOREIGN KEY (sender) REFERENCES reg_info(id),
FOREIGN KEY (to_whom) REFERENCES reg_info(id),
FOREIGN KEY (answer) REFERENCES private_message(id)
);

INSERT INTO reg_info (name, e_mail,reg_password) VALUES 
('Csaba','Csabika@gmail.com','CsabaAzÁsz'),
('Lili','Lilike@gmail.com','Lilipopó'),
('ASD','asd@gmail.com','dsa');

INSERT INTO private_message(sender,to_whom,message,answer) VALUES
(1, 2,'AHOY',NULL),
(2,1,'AHOY back :)',1),
(1,2,'ASDASD',NULL),
(2,1,'ASDASVVVD',3);
