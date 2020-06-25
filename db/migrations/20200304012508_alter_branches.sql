-- migrate:up

ALTER TABLE branches 
ADD url VARCHAR(60);

-- migrate:down

ALTER TABLE branches 
DROP url VARCHAR(60);