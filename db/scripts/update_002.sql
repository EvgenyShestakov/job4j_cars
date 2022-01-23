CREATE TABLE IF NOT EXISTS users
(
    id SERIAL PRIMARY KEY,
    name varchar(255),
    email varchar(255),
    password varchar(255)
);

CREATE TABLE IF NOT EXISTS auto_brand
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);

CREATE TABLE IF NOT EXISTS body_type
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);

CREATE TABLE IF NOT EXISTS color
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);

CREATE TABLE IF NOT EXISTS engine_capacity
(
    id SERIAL PRIMARY KEY,
    volume int
);

CREATE TABLE IF NOT EXISTS fuel_type
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);
CREATE TABLE IF NOT EXISTS seering_wheel
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);
CREATE TABLE IF NOT EXISTS transmission
(
    id SERIAL PRIMARY KEY,
    description varchar(255)
);
CREATE TABLE IF NOT EXISTS car
(
    id SERIAL PRIMARY KEY,
    auto_brand_id int NOT NULL REFERENCES auto_brand(id),
    body_type_id int NOT NULL REFERENCES body_type(id),
    color_id int NOT NULL REFERENCES color(id),
    engine_capacity_id int NOT NULL REFERENCES engine_capacity(id),
    fuel_type_id int NOT NULL REFERENCES fuel_type(id),
    seering_wheel_id int NOT NULL REFERENCES seering_wheel(id),
    transmission_id int NOT NULL REFERENCES transmission(id)
);

CREATE TABLE IF NOT EXISTS announcement
(
    id SERIAL PRIMARY KEY,
    description text,
    status boolean,
    car_id int NOT NULL REFERENCES car(id),
    users_id int NOT NULL REFERENCES users(id)
);