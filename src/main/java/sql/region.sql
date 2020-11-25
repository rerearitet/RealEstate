CREATE TABLE IF NOT EXISTS region
(
    id   int          not null,
    name varchar(100) not null
);

INSERT INTO region (id, name)
VALUES
(1, 'Europe'),
(2, 'Asia'),
(3, 'South America');