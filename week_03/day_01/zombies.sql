DROP TABLE bitings;
DROP TABLE zombies;
DROP TABLE victims;

CREATE TABLE zombies (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  type VARCHAR(255)
);

CREATE TABLE victims (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  run_speed INT2
);

CREATE TABLE bitings (
  id SERIAL8 PRIMARY KEY,
  victim_id INT8 REFERENCES victims (id),
  zombie_id INT8 REFERENCES zombies (id),
  infected_on DATE NOT NULL
);

INSERT INTO victims (name, run_speed) VALUES ('Tony', 12);
INSERT INTO victims (name, run_speed) VALUES ('Jarrod', 11);
INSERT INTO victims (name, run_speed) VALUES ('Darren', 15);
INSERT INTO victims (name, run_speed) VALUES ('Keith', 30);

INSERT INTO zombies (name, type) VALUES ('John', 'crawler');
INSERT INTO zombies (name, type) VALUES ('Alex', 'runner');
INSERT INTO zombies (name, type) VALUES ('Zsolt', 'witch');
INSERT INTO zombies (name, type) VALUES ('Craig', 'tank');

INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (1, 1, 'October 31 2017');
INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (2, 2, 'November 4 2017');
INSERT INTO bitings (zombie_id, victim_id, infected_on) VALUES (4, 3, 'November 14 2017');

insert into bitings (zombie_id, victim_id, infected_on) VALUES (1, 3, 'November 14 2017');

SELECT * FROM zombies WHERE name = 'John';

SELECT victim_id FROM bitings WHERE zombie_id = 1;

SELECT name FROM victims WHERE  id IN (1,3);


SELECT * FROM zombies;
SELECT * FROM victims;
