CREATE TABLE IF NOT EXISTS estateAgency
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO estateAgency (id, name)
VALUES (1, 'Your home'),
       (2, '4 people');