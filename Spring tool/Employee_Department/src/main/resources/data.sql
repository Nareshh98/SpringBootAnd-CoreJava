drop table IF EXISTS customer_accounts;
drop table IF EXISTS customer;
drop table IF EXISTS account;
create table customer(
customer_id int PRIMARY KEY AUTO_INCREMENT,
first_name varchar(20),
last_name varchar(20),
email varchar(100)
);
create table account(
account_number int PRIMARY KEY AUTO_INCREMENT,
account_type varchar(20),
balance double
);
create table customer_accounts(
account_id int,
customer_id int,
FOREIGN KEY (account_id)
REFERENCES account(account_number),
FOREIGN KEY (customer_id)
REFERENCES customer(customer_id)
);
