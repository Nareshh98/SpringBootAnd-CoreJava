use mydb;
drop table IF EXISTS Employee;
drop table IF EXISTS Department;
 
create table Department(
department_id int PRIMARY KEY AUTO_INCREMENT,
department_name varchar(20)
 
);
 
create table Employee(
employee_id int PRIMARY KEY AUTO_INCREMENT,
first_name varchar(20),
last_name varchar(20),
email varchar(50),
department_id int,
FOREIGN KEY (department_id)
REFERENCES Department(department_id)
 
);
