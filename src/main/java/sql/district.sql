CREATE TABLE IF NOT EXISTS district
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO district (id, name)
VALUES (1, 'Primorsky'),
       (2, 'Suvorovsky'),
       (3, 'Malinovsky');