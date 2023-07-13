-- liquibase formatted sql

-- changeset test:1

CREATE TABLE position
(
    id BIGSERIAL PRIMARY KEY,
    surname_position VARCHAR(255),
    employee_id BIGINT REFERENCES employee(id)
);