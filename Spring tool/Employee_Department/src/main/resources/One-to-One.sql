use mydb;
drop table IF EXISTS person;
drop table IF EXISTS license;
 
create table license(
license_id int PRIMARY KEY AUTO_INCREMENT,
valid_from date,
valid_to date
);
create table person(
person_id int PRIMARY KEY AUTO_INCREMENT,
person_name varchar(20),
license_id int,
FOREIGN KEY (license_id ) REFERENCES license(license_id )
 
);
