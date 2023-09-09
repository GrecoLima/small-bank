-- Insert data into the 'contact_messages' table
-- This message is related to customer with ID 1
INSERT INTO contact_messages (active, created_date, updated_date, contact_id, created_by, email, message, name, subject, updated_by)
VALUES
    (1, '2023-09-09', '2023-09-09', 1, 'Admin', 'john@example.com', 'Hello, how can I help you?', 'John Doe', 'Support', 'Admin'),
    (1, '2023-09-09', '2023-09-09', 2, 'Admin', 'jane@example.com', 'Please assist with my issue.', 'Jane Smith', 'Help', 'Admin');

-- Insert data into the 'customers' table
-- Customer with ID 1
INSERT INTO customers (active, created_date, updated_date, customer_id, created_by, email, mobile_phone, password, updated_by)
VALUES
    (1, '2023-09-09', '2023-09-09', 1, 'Admin', 'john@example.com', '1234567890', 'hashed_password', 'Admin'),
    -- Customer with ID 2
    (1, '2023-09-09', '2023-09-09', 2, 'Admin', 'jane@example.com', '9876543210', 'hashed_password', 'Admin');

-- Insert data into the 'notice_details' table
-- Notice 1
INSERT INTO notice_details (create_dt, notic_beg_dt, notic_end_dt, notice_id, update_dt, notice_details, notice_summary)
VALUES
    ('2023-09-09 08:00:00.000000', '2023-09-09 08:30:00.000000', '2023-09-09 09:00:00.000000', 1, '2023-09-09 10:00:00.000000', 'Important notice content 1', 'Notice 1 Summary'),
    -- Notice 2
    ('2023-09-09 09:00:00.000000', '2023-09-09 09:30:00.000000', '2023-09-09 10:00:00.000000', 2, '2023-09-09 11:00:00.000000', 'Important notice content 2', 'Notice 2 Summary');

-- Insert data into the 'roles' table
-- Admin role
INSERT INTO roles (active, created_date, updated_date, role_id, created_by, role_name, updated_by)
VALUES
    (1, '2023-09-09', '2023-09-09', 1, 'Admin', 'ADMIN', 'Admin'),
    -- User role
    (1, '2023-09-09', '2023-09-09', 2, 'Admin', 'USER', 'Admin');

-- Insert data into the 'accounts' table
-- Account 1 belongs to Customer with ID 1
INSERT INTO accounts (active, created_date, updated_date, account_id, customer_id, account_type, branch_address, created_by, updated_by)
VALUES
    (1, '2023-09-09', '2023-09-09', 1, 1, 'Savings', '123 Main St', 'Admin', 'Admin'),
    -- Account 2 belongs to Customer with ID 2
    (1, '2023-09-09', '2023-09-09', 2, 2, 'Checking', '456 Elm St', 'Admin', 'Admin');

-- Insert data into the 'cards' table
-- Card 1 belongs to Customer with ID 1 and Account with ID 1
INSERT INTO cards (active, amount_used, available_amount, created_date, total_limit, updated_date, card_id, customer_id, card_number, card_type, created_by, updated_by)
VALUES
    (1, 500.00, 2500.00, '2023-09-09', 3000.00, '2023-09-09', 1, 1, '1234567890123456', 'Credit', 'Admin', 'Admin'),
    -- Card 2 belongs to Customer with ID 2 and Account with ID 2
    (1, 100.00, 900.00, '2023-09-09', 1000.00, '2023-09-09', 2, 2, '9876543210987654', 'Debit', 'Admin', 'Admin');

-- Insert data into the 'customer_roles' table
-- Customer with ID 1 has Admin role (ID 1)
INSERT INTO customer_roles (customer_id, role_id)
VALUES
    (1, 1),
    -- Customer with ID 2 has User role (ID 2)
    (2, 2);

-- Insert data into the 'loans' table
-- Loan 1 belongs to Customer with ID 1
INSERT INTO loans (active, amount_paid, created_date, loan_amount, outstanding_amount, updated_date, customer_id, loan_id, created_by, loan_type, updated_by)
VALUES
    (1, 1000.00, '2023-09-09', 5000.00, 4000.00, '2023-09-09', 1, 1, 'Admin', 'Personal', 'Admin'),
    -- Loan 2 belongs to Customer with ID 2
    (1, 2000.00, '2023-09-09', 10000.00, 8000.00, '2023-09-09', 2, 2, 'Admin', 'Home', 'Admin');

-- Insert data into the 'account_transactions' table
-- Transaction 1 is related to Account with ID 1 and Customer with ID 1
INSERT INTO account_transactions (closing_balance, transaction_amt, account_id, account_transaction_id, create_dt, customer_id, transaction_dt, transaction_summary, transaction_type)
VALUES
    (2500, -500, 1, 1, '2023-09-09 10:00:00.000000', 1, '2023-09-09 10:00:00.000000', 'Withdrawal', 'Debit'),
    -- Transaction 2 is related to Account with ID 2 and Customer with ID 2
    (900, 100, 2, 2, '2023-09-09 11:00:00.000000', 2, '2023-09-09 11:00:00.000000', 'Deposit', 'Credit');