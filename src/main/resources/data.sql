INSERT INTO users
    ( username, password, enabled )
VALUES
    ('chaz', '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07xd00DMxs.AQubh4a', 1),
    ('guerson', '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07xd00DMxs.AQubh4a', 1);

INSERT INTO authorities (username, authority)
    values ('chaz', 'ROLE_USER'),
           ('guerson', 'ROLE_USER');