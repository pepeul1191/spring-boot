-- migrate:up

CREATE TABLE carrers (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	name VARCHAR(30) NOT NULL
) 

-- migrate:down

DROP TABLE carrers;