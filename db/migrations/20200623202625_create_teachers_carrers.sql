-- migrate:up

CREATE TABLE teachers_carrers (
	id INT AUTO_INCREMENT PRIMARY KEY,
	teacher_id INT NOT NULL,
	carrer_id INT NOT NULL,
    FOREIGN KEY(`teacher_id`) REFERENCES 'teachers' ( 'id' ) ON DELETE CASCADE
    FOREIGN KEY(`carrer_id`) REFERENCES 'carrers' ( 'id' ) ON DELETE CASCADE
) 

-- migrate:down

DROP TABLE teachers_carrers;