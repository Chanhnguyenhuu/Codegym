create database Student_management;

use Student_management;

create table Student(
	id int not null,
    name varchar(45) null,
    age int null,
    country varchar(45) null,
    primary key(id)
);

create table class(
	id int,
    name varchar(45)
);

create table teacher(
	id int,
    name varchar(45),
    age int,
    country varchar(45)
);