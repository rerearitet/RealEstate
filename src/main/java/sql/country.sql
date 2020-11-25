CREATE TABLE IF NOT EXISTS country
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO country (id, name)
VALUES (1, 'Ukraine'),
       (2, 'Russia'),
       (3, 'USA');