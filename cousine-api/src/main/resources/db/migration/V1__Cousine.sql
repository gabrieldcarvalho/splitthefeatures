CREATE TABLE cousine (
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    description         VARCHAR(100) NOT NULL,

    CONSTRAINT pk_cousine PRIMARY KEY (id)
);

INSERT INTO cousine (id, description) VALUES
(1, 'Chinese'),
(2, 'Pizza'),
(3, 'Vietnamese'),
(4, 'Sushi');
