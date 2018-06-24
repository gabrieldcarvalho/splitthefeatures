CREATE TABLE coupon (
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    restaurant_id       BIGINT NOT NULL,
    discount_percentage DOUBLE NOT NULL,
    customer            VARCHAR(100),
    expiration_date     DATETIME NOT NULL,
    used_date           DATETIME NULL,

    CONSTRAINT pk_coupon PRIMARY KEY (id)
);

INSERT INTO coupon (id, restaurant_id, discount_percentage, customer, expiration_date, used_date) VALUES
(1, 1, 20, 'Gabriel', '2018-06-28', NULL),
(2, 2, 20, 'Daniel', '2018-06-28', '2018-05-29');