-- migrate:up

CREATE TABLE 'images' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'alt'	VARCHAR(45) NOT NULL,
	'url'	VARCHAR(54) NOT NULL
);

-- migrate:down

DROP TABLE IF EXISTS 'images';