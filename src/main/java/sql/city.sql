CREATE TABLE IF NOT EXISTS city
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO city (id, name)
VALUES (1, 'Kiev'),
       (2, 'Odessa'),
       (3, 'Kharkiv');