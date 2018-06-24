CREATE TABLE cousine (
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    description         VARCHAR(100) NOT NULL,

    CONSTRAINT pk_cousine PRIMARY KEY (id)
);

INSERT INTO cousine (id, description) VALUES
(1, 'Brazilian'),
(2, 'Canadian'),
(3, 'Pizza'),
(4, 'Japanese'),
(5, 'Burger');
