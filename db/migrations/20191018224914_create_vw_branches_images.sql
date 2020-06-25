-- migrate:up

CREATE VIEW vw_branches_images AS
  SELECT I.id, I.alt, I.url, B.branch_id AS branch_id 
  FROM images I
  JOIN branches_images B ON B.image_id = I.id
  LIMIT 2000

-- migrate:down

DROP VIEW IF EXISTS vw_branches_images