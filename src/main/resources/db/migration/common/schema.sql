CREATE TABLE recipe
(
    id             BIGSERIAL PRIMARY KEY NOT NULL,
    name           VARCHAR(30)           NOT NULL,
    calorie_in_100_gr DECIMAL               NOT NULL,
);

CREATE TABLE ingredient
(
    id             BIGSERIAL PRIMARY KEY NOT NULL,
    name           VARCHAR(30)           NOT NULL,
    calorie_in_100_gr DECIMAL               NOT NULL,
);

CREATE TABLE amount
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    value DECIMAL               NOT NULL,
    unit  VARCHAR(10)           NOT NULL
);

CREATE TABLE ingredient_amount
(
    id         BIGSERIAL PRIMARY KEY NOT NULL,
    amount_id  BIGINT REFERENCES amount (id),
    ingredient_id BIGINT REFERENCES ingredient (id)
);

CREATE TABLE meal_amount
(
    id         BIGSERIAL PRIMARY KEY NOT NULL,
    calorie_total DECIMAL,
    amount_id  BIGINT REFERENCES amount (id),
    recipe_id BIGINT REFERENCES recipe (id)
);
