CREATE TABLE coupon (
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    restaurant_id       BIGINT NOT NULL,
    discount_percentage DOUBLE NOT NULL,
    customer            VARCHAR(100),
    used                BOOLEAN NOT NULL,

    CONSTRAINT pk_coupon PRIMARY KEY (id)
);

INSERT INTO coupon (id, description) VALUES
(1, 1, 15, 'Gabriel', 'available'),
(2, 'Canadian'),
(3, 'Pizza'),
(4, 'Japanese'),
(5, 'Burger'),
(6, 'Unknown');
