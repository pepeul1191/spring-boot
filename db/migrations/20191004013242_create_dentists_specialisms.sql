-- migrate:up

CREATE TABLE 'dentists_specialisms' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'dentist_id'	INTEGER,
  'specialism_id'	INTEGER,
  FOREIGN KEY(`dentist_id`) REFERENCES 'dentists' ( 'id' ) ON DELETE CASCADE,
  FOREIGN KEY(`specialism_id`) REFERENCES 'specialisms' ( 'id' ) ON DELETE CASCADE
);

-- migrate:down

DROP TABLE IF EXISTS 'dentists_specialisms';