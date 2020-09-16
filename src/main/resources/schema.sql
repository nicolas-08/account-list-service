--
--DROP TABLE account;
CREATE SCHEMA TEST;

    CREATE TABLE account
    (   id INT PRIMARY KEY,
        acc_num VARCHAR(20),
        acc_name VARCHAR(20),
        acc_type VARCHAR(20),
        acc_balance_date date,
        acc_currency VARCHAR(3),
        acc_open_balance decimal(10,2)
    )
    ;
