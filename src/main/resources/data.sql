-- Insert sample data into the "roles" table
INSERT INTO roles (role_name)
VALUES ('ADMIN'),
       ('CUSTOMER');

-- Insert sample data into the "customers" table
INSERT INTO customers (email, name, mobile_number, created_date, pwd)
VALUES
    ('john.doe@example.com', 'John Doe', '123-456-7890', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('jane.smith@example.com', 'Jane Smith', '987-654-3210', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('michael.johnson@example.com', 'Michael Johnson', '555-555-5555', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('susan.williams@example.com', 'Susan Williams', '333-333-3333', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O'),
    ('david.miller@example.com', 'David Miller', '777-777-7777', '2023-09-06', '$2a$10$/oKnziz60HFue7YXsUWt2.e7ufs3xxTP0o5mNB03eFZCmuoWX3X5O');

-- Insert sample data into the "accounts" table
-- Each account belongs to a specific customer
INSERT INTO accounts (account_number, customer_id, account_type, branch_address, create_date)
VALUES
    (1, 1, 'Savings', '123 Main St', '2023-09-06'),
    (2, 2, 'Checking', '456 Elm St', '2023-09-06'),
    (3, 3, 'Savings', '789 Oak St', '2023-09-06'),
    (4, 4, 'Checking', '101 Pine St', '2023-09-06'),
    (5, 5, 'Savings', '222 Maple St', '2023-09-06');

-- Insert sample data into the "customer_roles" table
INSERT INTO customer_roles (customer_id, role_id)
VALUES
    (1, 1), -- Customer John Doe has role 1
    (2, 1), -- Customer Jane Smith has role 1
    (3, 1), -- Customer Michael Johnson has role 1
    (4, 1), -- Customer Susan Williams has role 1
    (5, 1); -- Customer David Miller has role 1

-- Insert sample data into the "account_transactions" table
-- Each transaction belongs to a specific account and customer
INSERT INTO account_transactions (transaction_id, account_id, transaction_dt, create_dt, transaction_summary, transaction_type, transaction_amt, closing_balance)
VALUES
    ('1', 1, '2023-09-07 10:00:00', '2023-09-07 10:00:00', 'Deposit', 'Credit', 1000, 1000),
    ('2', 1, '2023-09-07 14:30:00', '2023-09-07 14:30:00', 'Withdrawal', 'Debit', -500, 500),
    ('3', 2, '2023-09-08 09:15:00', '2023-09-08 09:15:00', 'Deposit', 'Credit', 1500, 1500),
    ('4', 3, '2023-09-08 12:45:00', '2023-09-08 12:45:00', 'Withdrawal', 'Debit', -800, 800),
    ('5', 4, '2023-09-09 11:30:00', '2023-09-09 11:30:00', 'Deposit', 'Credit', 2000, 2000);