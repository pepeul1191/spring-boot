-- migrate:up

CREATE VIEW vw_tyeps AS
	SELECT type_1 AS type FROM pokemons
	GROUP BY (type_1) ORDER BY type;

-- migrate:down

DROP VIEW vw_tyeps;