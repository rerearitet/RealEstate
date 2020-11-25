CREATE TABLE IF NOT EXISTS estate
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO estate (id, name)
VALUES (1, '13'),
       (2, '27'),
       (3, '65');