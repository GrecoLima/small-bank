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

-- Insert sample data into the "loans" table
-- Each loan belongs to a specific customer
INSERT INTO loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
VALUES
    (1, '2023-09-10', 'Personal Loan', 5000, 1000, 4000, '2023-09-10'), -- John Doe's Personal Loan
    (2, '2023-09-11', 'Car Loan', 8000, 2000, 6000, '2023-09-11'); -- Jane Smith's Car LoanK

-- Insert sample data into the "cards" table
-- Each card belongs to a specific customer and account
INSERT INTO cards (card_number, card_type, total_limit, amount_used, available_amount, create_dt, customer_id, account_number)
VALUES
    ('1234567890123456', 'Credit Card', 5000, 0, 5000, '2023-09-12', 1, 1),  -- John Doe's Credit Card for Account 1
    ('9876543210987654', 'Debit Card', 2000, 0, 2000, '2023-09-12', 1, 1),   -- John Doe's Debit Card for Account 1
    ('1111222233334444', 'Credit Card', 6000, 0, 6000, '2023-09-12', 2, 2),  -- Jane Smith's Credit Card for Account 2
    ('5555666677778888', 'Debit Card', 2500, 0, 2500, '2023-09-12', 2, 2);   -- Jane Smith's Debit Card for Account 2

-- Insert sample data into the "notice_details" table
INSERT INTO notice_details (notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES
    ('Important Notice 1', 'This is the first important notice.', '2023-09-10 08:00:00', '2023-09-20 08:00:00', '2023-09-10 08:00:00', '2023-09-10 08:00:00'),
    ('Reminder', 'A friendly reminder for our customers.', '2023-09-12 10:00:00', '2023-09-15 10:00:00', '2023-09-12 10:00:00', '2023-09-12 10:00:00'),
    ('Upcoming Maintenance', 'Scheduled maintenance on the following dates.', '2023-09-15 14:00:00', '2023-09-17 14:00:00', '2023-09-15 14:00:00', '2023-09-15 14:00:00'),
    ('Holiday Closure', 'Our offices will be closed during the holidays.', '2023-12-24 18:00:00', '2024-01-02 08:00:00', '2023-12-24 18:00:00', '2023-12-24 18:00:00'),
    ('Service Disruption', 'Anticipated service disruption due to system upgrades.', '2023-09-18 12:00:00', '2023-09-19 12:00:00', '2023-09-18 12:00:00', '2023-09-18 12:00:00');
