-- migrate:up

CREATE TABLE 'branches' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'name'	VARCHAR(30) NOT NULL,
  'address'	VARCHAR(50) NOT NULL,
  'phone'	VARCHAR(25),
  'whatsapp'	VARCHAR(25),
  'emergency'	VARCHAR(25),
  'image'	VARCHAR(54) NOT NULL,
  'latitude' FLOAT,
  'longitude' FLOAT,
  'branch_type_id'	INTEGER,
  'director_id'	INTEGER,
  FOREIGN KEY(`branch_type_id`) REFERENCES 'branch_types' ( 'id' ) ON DELETE CASCADE
);

-- migrate:down

DROP TABLE IF EXISTS 'branches';