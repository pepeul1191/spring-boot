-- migrate:up

INSERT INTO carrers (id, name) VALUES 
	(1, "Administración"), 
	(2, "Marketing"), 
	(3, "Negocios Internacionales"), 
	(4, "Contabilidad"), 
	(5, "Ingeniería Industrial"), 
	(6, "Programa De Estudios Generales"), 
	(7, "Economía"), 
	(8, "Derecho"), 
	(9, "Ingeniería De Sistemas"), 
	(10, "Comunicación"), 
	(11, "Arquitectura"), 
	(12, "Ingeniería Civil"), 
	(13, "Psicología");

-- migrate:down

TRUNCATE carrers;