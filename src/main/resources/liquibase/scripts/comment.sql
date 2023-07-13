-- liquibase formatted sql

-- changeset test:1

CREATE TABLE comment
(
    id BIGSERIAL PRIMARY KEY,
    comment_body VARCHAR(255),
    post_id BIGINT REFERENCES post(id )
);