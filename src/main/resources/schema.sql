DROP TABLE IF Exists Posts;

CREATE TABLE Posts (
    id varchar(255) NOT NULL,
    title varchar(255) NOT NULL,
    slug varchar(255) NOT NULL,
    date date NOT NULL,
    time_to_read INT NOT NULL,
    tags varchar(255),
    primary key (id)
);