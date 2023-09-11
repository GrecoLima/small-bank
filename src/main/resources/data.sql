-- Insert additional data into the 'contact_messages' table
-- This message is related to customer with ID 1
INSERT INTO contact_messages (active, created_date, updated_date, contact_id, created_by, email, message, name, subject,
                              updated_by)
VALUES (1, '2023-09-10', '2023-09-10', 1, 'Admin', 'alice@example.com', 'Need assistance with my account.',
        'Alice Johnson',
        'Support', 'Admin'),
       -- This message is related to customer with ID 2
       (1, '2023-09-10', '2023-09-10', 2, 'Admin', 'bob@example.com', 'Inquiry about my recent transactions.',
        'Bob Williams',
        'Help', 'Admin'),
       -- This message is related to customer with ID 3
       (1, '2023-09-10', '2023-09-10', 3, 'Admin', 'carol@example.com', 'Issue with my card, urgent assistance needed.',
        'Carol Davis',
        'Urgent', 'Admin'),
       -- This message is related to customer with ID 4
       (1, '2023-09-10', '2023-09-10', 4, 'Admin', 'dave@example.com', 'Requesting information on loan options.',
        'Dave Wilson',
        'Loan Inquiry', 'Admin');

-- Insert additional data into the 'customers' table
-- Customer with ID 1
INSERT INTO customers (customer_id, created_by, updated_by, created_date, updated_date, active, name, email, password,
                       mobile_number)
VALUES (1, 'Admin', 'Admin', '2023-09-10', '2023-09-10', 1, 'Alice Johnson', 'alice@example.com',
        '$2a$10$GznGIotoTSVj8lrKbrh7ROyT6o8A4taJ1t28nJHcN.E9nihsY9mpG', '1112223333'),
       -- Customer with ID 2
       (2, 'Admin', 'Admin', '2023-09-10', '2023-09-10', 1, 'Bob Williams', 'bob@example.com',
        '$2a$10$GznGIotoTSVj8lrKbrh7ROyT6o8A4taJ1t28nJHcN.E9nihsY9mpG', '4445556666'),
       -- Customer with ID 3
       (3, 'Admin', 'Admin', '2023-09-10', '2023-09-10', 1, 'Carol Davis', 'carol@example.com',
        '$2a$10$GznGIotoTSVj8lrKbrh7ROyT6o8A4taJ1t28nJHcN.E9nihsY9mpG', '7778889999'),
       -- Customer with ID 4
       (4, 'Admin', 'Admin', '2023-09-10', '2023-09-10', 1, 'Dave Wilson', 'dave@example.com',
        '$2a$10$GznGIotoTSVj8lrKbrh7ROyT6o8A4taJ1t28nJHcN.E9nihsY9mpG', '1234567890');

-- Insert additional data into the 'notice_details' table
-- Notice 1
INSERT INTO notice_details (create_dt, notic_beg_dt, notic_end_dt, notice_id, update_dt, notice_details, notice_summary)
VALUES ('2023-09-10 10:00:00.000000', '2023-01-01 08:30:00.000000', '2024-01-01 09:00:00.000000', 1,
        '2023-09-10 12:00:00.000000', 'Important notice content 1', 'Notice 1 Summary'),
       -- Notice 2
       ('2023-09-10 11:00:00.000000', '2023-01-01 09:30:00.000000', '2024-01-01 10:00:00.000000', 2,
        '2023-09-10 13:00:00.000000', 'Important notice content 2', 'Notice 2 Summary'),
       -- Notice 3
       ('2023-09-10 12:00:00.000000', '2023-01-01 10:30:00.000000', '2024-01-01 11:00:00.000000', 3,
        '2023-09-10 14:00:00.000000', 'Important notice content 3', 'Notice 3 Summary'),
       -- Notice 4
       ('2023-09-10 13:00:00.000000', '2023-01-01 11:30:00.000000', '2024-01-01 12:00:00.000000', 4,
        '2023-09-10 15:00:00.000000', 'Important notice content 4', 'Notice 4 Summary');

-- Insert additional data into the 'roles' table
-- Manager role
INSERT INTO roles (active, created_date, updated_date, role_id, created_by, role_name, updated_by)
VALUES (1, '2023-09-10', '2023-09-10', 5, 'Admin', 'MANAGER', 'Admin'),
       -- Support role
       (1, '2023-09-10', '2023-09-10', 6, 'Admin', 'SUPPORT', 'Admin'),
       -- Analyst role
       (1, '2023-09-10', '2023-09-10', 7, 'Admin', 'ANALYST', 'Admin'),
       -- Developer role
       (1, '2023-09-10', '2023-09-10', 8, 'Admin', 'DEVELOPER', 'Admin');

-- Insert additional data into the 'accounts' table
-- Account 1 belongs to Customer with ID 1
INSERT INTO accounts (active, created_date, updated_date, account_id, customer_id, account_type, account_number,
                      branch_address,
                      created_by, updated_by)
VALUES (1, '2023-09-10', '2023-09-10', 1, 1, 'Savings', '12345678', '789 Oak St', 'Admin', 'Admin'),
       -- Account 2 belongs to Customer with ID 2
       (1, '2023-09-10', '2023-09-10', 2, 2, 'Checking', '23456789', '101 Maple St', 'Admin', 'Admin'),
       -- Account 3 belongs to Customer with ID 3
       (1, '2023-09-10', '2023-09-10', 3, 3, 'Savings', '34567890', '222 Pine St', 'Admin', 'Admin'),
       -- Account 4 belongs to Customer with ID 4
       (1, '2023-09-10', '2023-09-10', 4, 4, 'Checking', '45678901', '333 Cedar St', 'Admin', 'Admin');

-- Insert additional data into the 'cards' table
-- Card 1 belongs to Customer with ID 1 and Account with ID 1
INSERT INTO cards (active, amount_used, available_amount, created_date, total_limit, updated_date, card_id, customer_id,
                   card_number, card_type, created_by, updated_by)
VALUES (1, 200.00, 2800.00, '2023-09-10', 3000.00, '2023-09-10', 1, 1, '1111222233334444', 'Credit', 'Admin', 'Admin'),
       -- Card 2 belongs to Customer with ID 2 and Account with ID 2
       (1, 50.00, 950.00, '2023-09-10', 1000.00, '2023-09-10', 2, 2, '4444555566667777', 'Debit', 'Admin', 'Admin'),
       -- Card 3 belongs to Customer with ID 3 and Account with ID 3
       (1, 300.00, 700.00, '2023-09-10', 1000.00, '2023-09-10', 3, 3, '7777888899990000', 'Credit', 'Admin', 'Admin'),
       -- Card 4 belongs to Customer with ID 4 and Account with ID 4
       (1, 75.00, 925.00, '2023-09-10', 1000.00, '2023-09-10', 4, 4, '8888999911112222', 'Debit', 'Admin', 'Admin');

-- Insert additional data into the 'customer_roles' table
-- Customer with ID 1 has Manager role (ID 1)
INSERT INTO customer_roles (customer_id, role_id)
VALUES (1, 5),
       -- Customer with ID 2 has Support role (ID 2)
       (2, 6),
       -- Customer with ID 3 has Analyst role (ID 3)
       (3, 7),
       -- Customer with ID 4 has Developer role (ID 4)
       (4, 8);

-- Insert additional data into the 'loans' table
-- Loan 1 belongs to Customer with ID 1
INSERT INTO loans (active, amount_paid, created_date, loan_amount, outstanding_amount, updated_date, customer_id,
                   loan_id, created_by, loan_type, updated_by)
VALUES (1, 800.00, '2023-09-10', 5000.00, 4200.00, '2023-09-10', 1, 1, 'Admin', 'Personal', 'Admin'),
       -- Loan 2 belongs to Customer with ID 2
       (1, 1500.00, '2023-09-10', 10000.00, 8500.00, '2023-09-10', 2, 2, 'Admin', 'Home', 'Admin'),
       -- Loan 3 belongs to Customer with ID 3
       (1, 400.00, '2023-09-10', 8000.00, 7600.00, '2023-09-10', 3, 3, 'Admin', 'Auto', 'Admin'),
       -- Loan 4 belongs to Customer with ID 4
       (1, 300.00, '2023-09-10', 6000.00, 5700.00, '2023-09-10', 4, 4, 'Admin', 'Education', 'Admin');

-- Insert additional data into the 'account_transactions' table
-- Transaction 1 is related to Account with ID 1 and Customer with ID 1
INSERT INTO account_transactions (closing_balance, transaction_amt, account_id, account_transaction_id, create_dt,
                                  customer_id, transaction_dt, transaction_summary, transaction_type)
VALUES (2800, -200, 1, 1, '2023-09-10 10:30:00.000000', 1, '2023-09-10 10:30:00.000000', 'Purchase', 'Debit'),
       -- Transaction 2 is related to Account with ID 2 and Customer with ID 2
       (950, -50, 2, 2, '2023-09-10 11:30:00.000000', 2, '2023-09-10 11:30:00.000000', 'Withdrawal', 'Debit'),
       -- Transaction 3 is related to Account with ID 3 and Customer with ID 3
       (700, -300, 3, 3, '2023-09-10 12:30:00.000000', 3, '2023-09-10 12:30:00.000000', 'Online Payment', 'Debit'),
       -- Transaction 4 is related to Account with ID 4 and Customer with ID 4
       (925, -75, 4, 4, '2023-09-10 13:30:00.000000', 4, '2023-09-10 13:30:00.000000', 'Cash Deposit', 'Credit');
