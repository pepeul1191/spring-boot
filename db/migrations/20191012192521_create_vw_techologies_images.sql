-- migrate:up

CREATE VIEW vw_technologies_images AS
  SELECT I.id, I.alt, I.url, TI.technology_id AS technology_id 
  FROM images I
  JOIN technologies_images TI ON TI.image_id = I.id
  LIMIT 2000

-- migrate:down

DROP VIEW IF EXISTS vw_technologies_images