-- migrate:up

CREATE VIEW vw_branches_directors AS
  SELECT B.id,	B.name, B.address, B.phone, B.whatsapp, B.emergency, B.image, B.latitude, B.longitude, B.branch_type_id, B.director_id, (D.name || ', ' || D.cop || ', ' || D.rne) AS director_name 
  FROM branches B
  JOIN dentists D ON B.director_id = D.id
  LIMIT 2000
  
-- migrate:down

DROP VIEW IF EXISTS vw_branches_directors