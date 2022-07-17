create database product_manager;

use product_manager;

drop database product_manager;

create table product (
 id int auto_increment primary key,
 id_categogy int not null,
 name varchar(50) not null,
 price double not null,
 color varchar(50),
 FOREIGN KEY (id_categogy) REFERENCES categogy(id_categogy)
);

create table categogy(
	id_categogy int auto_increment primary key,
    name_category varchar(50) not null
);

insert into product (id_categogy,name, price, color)
values (1,'iphone', 10000.0, 'white'),
		(2,'samsung', 11000.0, 'black'),
        (3,'xiaomi', 7000.0, 'green'),
        (3,'Nokia', 8000.0, 'blue');
        
insert into product (name, price, color)
values ('Nokia', 8000.0, 'blue');

