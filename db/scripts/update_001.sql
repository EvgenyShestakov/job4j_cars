CREATE TABLE IF NOT EXISTS engine
(
    id SERIAL PRIMARY KEY,
    name varchar(255)
);

CREATE TABLE IF NOT EXISTS driver
(
    id SERIAL PRIMARY KEY,
    name varchar(255)
);

CREATE TABLE IF NOT EXISTS car
(
    id SERIAL PRIMARY KEY,
    name varchar(255),
    engine_id int NOT NULL REFERENCES engine(id)
);

CREATE TABLE IF NOT EXISTS history_owner
(
    id SERIAL PRIMARY KEY,
    driver_id int NOT NULL REFERENCES driver(id),
    car_id int NOT NULL REFERENCES car(id)
);

