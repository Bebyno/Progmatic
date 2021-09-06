USE Task1;

SELECT Name FROM city WHERE CountryCode = 'NZL';
SELECT Name, Population FROM city WHERE CountryCode = 'AUS' ORDER BY Population ASC;
SELECT Name, Population FROM city WHERE CountryCode = 'AUS' AND Population > 1000000 ORDER BY Population DESC ;
SELECT Name, Continent FROM country WHERE Continent LIKE '%Africa%' ORDER BY Name;
SELECT Name, LifeExpectancy FROM country ORDER BY LifeExpectancy DESC LIMIT 10;
SELECT Name,Continent FROM country WHERE Continent LIKE '%America%' ORDER BY HeadOfState;
SELECT Name,Continent FROM country WHERE Continent= 'South America' AND GovernmentForm = 'Republic';
SELECT Name,IndepYear FROM country ORDER BY IndepYear DESC LIMIT 1;

SELECT Name,Population FROM (SELECT * from country AS Ten ORDER BY Population DESC LIMIT 10 ) AS theGoodOne ORDER BY Population ASC LIMIT 1;
-- this will be the same just with city task:
SELECT name, population FROM city ORDER BY population DESC LIMIT 1 OFFSET 9;
SELECT name, IndepYear FROM country WHERE IndepYear is NULL ORDER BY Population DESC;
SELECT Language FROM countrylanguage WHERE CountryCode = 'HUN' AND Language != 'Hungarian' ;

SELECT count(*) HeadOfState FROM country WHERE HeadOfState LIKE '%Hamad%' OR HeadOfState LIKE '%Ahmad%' OR HeadOfState LIKE '%Ahmed%';

SELECT name,Population FROM country WHERE Population BETWEEN 100000 AND 200000;
SELECT CountryCode FROM countrylanguage WHERE Language ='English' AND Percentage = 100;
SELECT name,Population FROM country WHERE Population = 0 AND Continent != 'Antarctica';
-- melyik ez az ország?
SELECT countrylanguage.countrycode, country.name FROM countrylanguage JOIN country ON country.code = countrylanguage.countrycode WHERE language = 'English' AND percentage = 100;

SELECT name FROM country WHERE Code LIKE 'y%' ;

SELECT name,min(LifeExpectancy) FROM country WHERE Continent = 'Europe';
SELECT name,LifeExpectancy FROM country WHERE continent = 'Europe' AND LifeExpectancy IS NOT NULL ORDER BY LifeExpectancy ASC LIMIT 1;

SELECT DISTINCT language FROM countrylanguage;

SELECT country.Name 
	FROM country JOIN countrylanguage ON country.Code = countrylanguage.CountryCode 
		WHERE NOT country.Code = 'HUN'  -- or: country.Code != 'HUN'
			AND countrylanguage.Language = 'hungarian';
            
SELECT name FROM country WHERE GNP > 200000 ORDER BY SurfaceArea ASC;















