-- migrate:up

CREATE VIEW vw_dentists_branches_specialisms AS
	SELECT branch_types_id, branch_id, branch_name, dentist_id, dentist_name, cop, rne, image, specialism_id, specialism_name FROM 
	(
		SELECT DB.id, T.id AS branch_types_id , B.id AS branch_id,  B.name AS branch_name, DB.dentist_id AS dentist_id, D.name AS dentist_name , D. cop, D.rne, D.image
		FROM branches B
		JOIN branch_types T ON T.id = B.branch_type_id 
		JOIN dentists_branches DB ON DB.branch_id = B.id  
		JOIN dentists D ON DB.dentist_id = D.id 
		LIMIT 2000
	) T
	LEFT JOIN (
		SELECT DS.dentist_id AS p_dentist_id, (D.name || ', ' || D.cop || ', ' || D.rne) AS p_dentist_name , SP.id AS specialism_id, SP.name AS specialism_name 
		FROM specialisms SP
		JOIN dentists_specialisms DS ON DS.specialism_id = SP.id  
		JOIN dentists D ON DS.dentist_id = D.id 
		LIMIT 2000
	) P 
	ON T.dentist_id = P.p_dentist_id

-- migrate:down


DROP VIEW IF EXISTS vw_dentists_branches_specialisms