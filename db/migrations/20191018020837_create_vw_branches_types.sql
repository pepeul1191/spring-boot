-- migrate:up

CREATE VIEW vw_branches_types AS
  SELECT B.id, (T.name || ', ' || B.name || ', ' || B.address) AS name 
  FROM branches B
  JOIN branch_types T ON T.id = B.branch_type_id
  LIMIT 2000

-- migrate:down

DROP VIEW IF EXISTS vw_branches_types