USE Task1;

SELECT SUM(Population) AS 'All ppopulation' FROM country;
SELECT COUNT(*) AS 'Free' FROM country WHERE IndepYear BETWEEN 1800 AND 1850;
SELECT COUNT(*) AS 'Brazil Disctric' FROM city WHERE CountryCode = 'BRA';
SELECT COUNT(*) AS '99% Speeking the languange' FROM countrylanguage WHERE IsOfficial = 'T' AND Percentage > 99;
-- 5ös feladat hiányos

-- Kata
SELECT Region, SUM(Population)  /(SELECT SUM(Population) FROM Country) AS "ratio" FROM country GROUP BY Region;
-- Krisztina
SELECT `Region`, `Population`/ SUM(`Population`) AS `AllPopulation` FROM `Country` GROUP BY `Region` ORDER BY `AllPopulation`;


-- 6os feladat
SELECT name, 
	CASE
		WHEN Population > 10000000 THEN 'sok'
        ELSE 'kevés'
	END AS 'lakosság',
Population FROM country; 

-- SELECT MAX(SurfaceArea) FROM country;		ez csak a legnagobb pop-ot írja ki de a nevét nem jól gűzi hozzá.

SELECT name, SurfaceArea FROM country ORDER BY SurfaceArea DESC LIMIT 1;

SELECT city.Name FROM city JOIN country ON country.Capital = city.ID ORDER BY SurfaceArea DESC LIMIT 1;

SELECT country.Name, city.Name FROM country JOIN city ON country.Capital = city.ID;


SELECT country.Name, countrylanguage.Language FROM country JOIN countrylanguage ON country.Code = countrylanguage.CountryCode WHERE Language ='Spanish' AND IsOfficial = 'T' ORDER BY name;


SELECT country.Name, countrylanguage.CountryCode, COUNT(*) FROM country JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
GROUP BY CountryCode ORDER BY COUNT(*) DESC LIMIT 1 ;

SELECT city.District, MAX(city.Population) FROM country JOIN city ON country.Capital = city.ID
WHERE country.Name = 'Netherlands';

SELECT COUNT(*) FROM country WHERE Capital IS NUll;

-- Hány országnál nem ugyanazzal a betűvel kezdődik a 3 betűs országkód, mint a 2 betűs?
SELECT COUNT(*), LEFT(code,3)FROM country WHERE Code = code2 ;




