-- SELECT lightsabers.colour FROM lightsabers;

SELECT jedi *, lightsabers * FROM jedi
INNER JOIN lightsabers
ON jedi.id = lightsabers.owner_id;
