-- migrate:up

CREATE VIEW vw_teachers_carrers AS
	SELECT T.id AS teacher_id, T.names, T.last_names, T.img, C.id AS carrer_id, C.name AS carrer_name 
  FROM teachers T
  INNER JOIN teachers_carrers TC ON TC.teacher_id = T.id
  INNER JOIN carrers C ON TC.carrer_id = C.id;

-- migrate:down

DROP VIEW vw_teachers_carrers;
