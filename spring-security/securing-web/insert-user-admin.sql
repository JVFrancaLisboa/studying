INSERT INTO roles (name) VALUES ('USER'), ('ADMIN');

INSERT INTO users (username, password, enabled) VALUES 
('user', '$2a$10$HwIh4F.dWeg8preAj7M.4uPxxMzUU/jnuVIUgd4tCgOKp6E193O/m', true), -- senha: password
('admin', '$2a$10$vEarNZmje6QuJ3emS75lHuqqM2CkDSyS1WJliY8viyW8BwZkDAbx6', true); -- senha: admin

INSERT INTO user_roles (user_id, role_id) VALUES 
(1, 1), -- user tem ROLE_USER
(2, 2); -- admin tem ROLE_ADMIN