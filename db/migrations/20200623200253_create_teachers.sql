-- migrate:up

CREATE TABLE teachers (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	names VARCHAR(40) NOT NULL,
	last_names VARCHAR(40) NOT NULL,
	img VARCHAR(120) NOT NULL
) 

-- migrate:down

DROP TABLE teachers;