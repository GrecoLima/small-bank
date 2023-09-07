-- Insert sample data into the "roles" table
INSERT INTO roles (role_name)
VALUES ('ADMIN'),
       ('CUSTOMER');

-- Insert sample data into the "customers" table
INSERT INTO customers (email, pwd)
VALUES ('john.doe@example.com', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
       ('jane.smith@example.com', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
       ('alice.johnson@example.com', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
       ('bob.williams@example.com', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
       ('emily.brown@example.com', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O');

-- Insert sample data into the "customer_roles" table
-- Associate customers with roles
-- For example, associate 'john.doe@example.com' with the 'ADMIN' and 'CUSTOMER' roles
INSERT INTO customer_roles (customer_id, role_id)
VALUES (1, 1), -- 'john.doe@example.com' is ADMIN
       (2, 1), -- 'jane.smith@example.com' is ADMIN
       (3, 2), -- 'alice.johnson@example.com' is CUSTOMER
       (4, 2), -- 'bob.williams@example.com' is CUSTOMER
       (5, 1); -- 'emily.brown@example.com' is ADMIN;
