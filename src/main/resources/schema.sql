SET SCHEMA 'meal_calories';

CREATE TABLE meal_calories.meal (
   id BIGSERIAL PRIMARY KEY NOT NULL,
   name VARCHAR(30) NOT NULL,
   calorieIn100gr DECIMAL NOT NULL
);

CREATE TABLE meal_calories.ingredient (
   id BIGSERIAL PRIMARY KEY NOT NULL,
   name VARCHAR(30) NOT NULL,
   calorieIn100gr DECIMAL NOT NULL,
   meal_id BIGINT REFERENCES meal (id)
);

CREATE TABLE meal_calories.amount (
   id BIGSERIAL PRIMARY KEY NOT NULL,
   value DECIMAL NOT NULL,
   unit VARCHAR(10) NOT NULL
);

CREATE TABLE meal_calories.ingredient_amount (
   id BIGSERIAL PRIMARY KEY NOT NULL,
   amount_id BIGINT REFERENCES amount (id),
   ingredient BIGINT REFERENCES ingredient (id)
);