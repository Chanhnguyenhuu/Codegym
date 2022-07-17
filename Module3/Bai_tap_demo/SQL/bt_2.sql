create database product_bt2;

use product_bt2;

drop database product_bt2;

create table product (
id int auto_increment primary key,
id_category int not null,
name varchar(50) not null,
price double not null,
quantity int,
color varchar(50),
descri varchar(250),
FOREIGN KEY (id_category) REFERENCES category(id_category)
);

create table category(
	id_category int auto_increment primary key,
    name_category varchar(50) not null
);

insert into product (id_category, name, price, quantity, color, descri)
values (1,'iphone13', 10000.0, 10, 'white', 'a'),
		(2,'samsungA7', 11000.0, 15,'black', 'b'),
        (4,'xiaomi M1', 7000.0, 17,'green', 'c'),
        (3,'Nokia 99', 8000.0, 4, 'blue','d');
        
        
insert into category (name_category)
value ('iphone'),
		('samsung'),
        ('Nokia'),
        ('Xiaomi');
        
select * from product p inner join category c on p.id_category = c.id_category;

select * from product p inner join category c on p.id_category = c.id_category
where id = 1;