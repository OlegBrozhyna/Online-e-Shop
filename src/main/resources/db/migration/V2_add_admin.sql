INSERT INTO users (id, archive, email, name, password, role, bucket_id)
VALUES (1, false, 'admin@mail.com', 'admin', '123456', ADMIN, null);

ALTER SEQUENCE user_seq RESTART WITH 2;