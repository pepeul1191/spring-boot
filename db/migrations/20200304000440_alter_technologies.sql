-- migrate:up

ALTER TABLE technologies
ADD url VARCHAR(60);

-- migrate:down

ALTER TABLE technologies
DROP url VARCHAR(60);