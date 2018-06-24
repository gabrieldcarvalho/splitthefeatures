CREATE TABLE restaurant (
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    name                VARCHAR(200) NOT NULL,
    address             VARCHAR(200) NOT NULL,
    cousine_id          BIGINT NOT NULL,

    CONSTRAINT pk_restaurant PRIMARY KEY (id)
);

INSERT INTO restaurant (id, name, address, cousine_id) VALUES
(1, 'PF Mineiro', '12 Garry St, Winnipeg, MB R3C 0R3, Canadá', 1),
(2, 'Churrascão', '191 Main St, Winnipeg, MB R3C 1A7, Canada', 1),
(3, 'Feijoada', '179 Bannatyne Ave, Winnipeg, MB R3B 0R5, Canada', 1),
(4, 'Churrascão', '30 Provencher Blvd, Winnipeg, MB R2H 2B9, Canadá', 1),
(5, 'Poutine''s', '32 Academy Rd, Winnipeg, MB R3N 0B9, Canadá', 2),
(6, 'Winnipeg King', '45 Grant Ave, Winnipeg, MB R3M 2A6, Canadá', 2),
(7, 'Giant Pizzas', '55 Garry St, Winnipeg, MB R3C 0R3, Canadá', 3),
(8, 'Cheese Lovers', '78 Main St, Winnipeg, MB R3C 1A7, Canada', 3),
(9, 'Giovanni''s Pizzas', '21 Bannatyne Ave, Winnipeg, MB R3B 0R5, Canada', 3),
(10, 'Yo', '69 Provencher Blvd, Winnipeg, MB R2H 2B9, Canadá', 4),
(11, 'Ohio Temaki', '24 Academy Rd, Winnipeg, MB R3N 0B9, Canadá', 4),
(12, 'Sushi Hero', '900 Grant Ave, Winnipeg, MB R3M 2A6, Canadá', 4),
(13, 'Inazuma', '111 Garry St, Winnipeg, MB R3C 0R3, Canadá', 4),
(14, 'Burger Man', '358 Main St, Winnipeg, MB R3C 1A7, Canada', 5),
(15, 'Big Boss Burger', '853 Bannatyne Ave, Winnipeg, MB R3B 0R5, Canada', 5),
(16, 'Meat Shop', '380 Provencher Blvd, Winnipeg, MB R2H 2B9, Canadá', 5),
(17, 'TGI Friday', '22 Academy Rd, Winnipeg, MB R3N 0B9, Canadá', 5),
(18, 'Lunch and Fries', '1789 Grant Ave, Winnipeg, MB R3M 2A6, Canadá', 5);