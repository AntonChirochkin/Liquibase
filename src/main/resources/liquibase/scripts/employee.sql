-- liquibase formatted sql

-- changeset test:1

CREATE TABLE employee
(
    id BIGSERIAl PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255)
);