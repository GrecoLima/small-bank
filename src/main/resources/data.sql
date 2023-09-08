-- Insert sample data into the "roles" table
INSERT INTO roles (role_name)
VALUES ('ADMIN'),
       ('CUSTOMER');

-- Insert 5 customers into the "customers" table
INSERT INTO customers (email, name, mobile_number, created_date, pwd)
VALUES
    ('john.doe@example.com', 'John Doe', '123-456-7890', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('jane.smith@example.com', 'Jane Smith', '987-654-3210', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('michael.johnson@example.com', 'Michael Johnson', '555-555-5555', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('susan.williams@example.com', 'Susan Williams', '333-333-3333', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('david.miller@example.com', 'David Miller', '777-777-7777', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O');

-- Insert the corresponding roles into the "customer_roles" table
INSERT INTO customer_roles (customer_id, role_id)
VALUES
    (1, 1), -- Customer John Doe has role 1
    (2, 1), -- Customer Jane Smith has role 1
    (3, 1), -- Customer Michael Johnson has role 1
    (4, 1), -- Customer Susan Williams has role 1
    (5, 1); -- Customer David Miller has role 1
