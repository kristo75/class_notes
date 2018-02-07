DROP TABLE lightsabers;
DROP TABLE jedis;

-- CREATING
CREATE TABLE jedis (
  name VARCHAR (255),
  age INT,
  darkside BOOLEAN,
  id SERIAL PRIMARY KEY
);

CREATE TABLE lightsabers (
  id SERIAL PRIMARY KEY, --PRIMARY KEY ensures that the column is special,
  -- unique and not null.

  colour VARCHAR (255),
  hilt_metal  VARCHAR (255) NOT NULL, -- NOT NULL makes a mandatory field.
  owner_id INT REFERENCES jedis(id) -- tells the owner_id has to match the id in
  -- jedis  REFERENCES  means that it is a key from another table.
);


INSERT INTO jedis (
  name,
  age,
  darkside
) VALUES (
  'luke',
  22,
  false
);

INSERT INTO jedis (name, darkside)
VALUES ('yoda', false);

-- SELECT COUNT(*) FROM jedis;

-- SELECT name FROM jedis;
--READING
SELECT * FROM jedis;


UPDATE jedis SET darkside = true;

UPDATE jedis SET darkside = false
WHERE name = 'yoda' AND darkside = 'true';

INSERT INTO jedis (name, age, darkside)
VALUES ('anakin', 12, false);
--UPDATING
UPDATE jedis SET age = 22
WHERE name = 'anakin';

UPDATE jedis set darkside = true
WHERE name = 'anakin';

--DELETING
DELETE FROM jedis
WHERE name = 'luke';


-- SELECT * FROM jedis;


INSERT INTO lightsabers (
  colour,
  hilt_metal,
  owner
) VALUES (
  'green',
  'stainless steel',
  'yoda'
);
SELECT * FROM lightsabers;

-- INSERT INTO lightsabers (
--   colour,
--   owner,
--   hilt_metal
-- ) VALUES (
--   'blue', 'luke', 'gold'
-- );
INSERT INTO   lightsabers (
  colour,
  hilt_metal,
  owner_id
) VALUES
('green', 'gold', 2);
--Primary key preventss changing the set id to 50.
-- UPDATE lightsabers SET id = 50;

SELECT * FROM jedis;
SELECT * FROM lightsabers;
