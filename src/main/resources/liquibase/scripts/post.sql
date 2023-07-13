-- liquibase formatted sql

-- changeset test:1

CREATE TABLE post
(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    body VARCHAR(255)
);