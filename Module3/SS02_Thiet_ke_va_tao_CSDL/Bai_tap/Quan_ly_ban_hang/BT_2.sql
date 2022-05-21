create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int not null primary key,
customer_name varchar(40) not null,
customer_age int
);

create table order_product(
order_id int not null primary key,
customer_id int,
order_date datetime,
order_total_price double not null,
foreign key (customer_id) references customer (customer_id)
);

create table product(
product_id int not null primary key,
product_name varchar(40) not null,
product_price double not null
);

create table order_detail(
order_id int not null,
product_id int not null,
order_qty int not null,
foreign key (order_id) references order_product(order_id),
foreign key (product_id) references product(product_id)
);