create database quan_ly_ban_hang;
drop database quan_ly_ban_hang;

use quan_ly_ban_hang;

create table customer(
customer_id int not null auto_increment primary key,
customer_name varchar(40) not null,
customer_age int
);

create table order_product(
order_id int not null auto_increment primary key,
customer_id int,
order_date datetime,
order_total_price double,
foreign key (customer_id) references customer (customer_id)
);

create table product(
product_id int not null auto_increment primary key,
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

insert into customer (customer_name, customer_age)
values ('Minh Quan', 10),
		('Ngoc Oanh', 20),
		('Hong Ha', 50);
        
insert into order_product (customer_id, order_date)
values (1, '2006-03-21'),
		(2, '2006-03-23'),
        (1, '2006-03-16');
        
insert into product (product_name, product_price)
values ('May Giat', 3),
		('Tu Lanh', 5),
		('Dieu Hoa', 7),
		('Quat', 1),
		('Bep Dien', 2);
        
insert into order_detail (order_id, product_id, order_qty) 
values (1, 1, 3),
		(1, 3, 7),
        (1, 4, 2),
        (2, 1, 1),
        (3, 1, 8),
        (2, 5, 4),
        (2, 3, 3);
        
-- Hiển thị các thông tin  gồm order_id, order_date, order_price của tất cả các hóa đơn trong bảng Order
select order_id, order_date, order_total_price
from order_product;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.customer_name, product.product_name
from customer
join order_product on customer.customer_id = order_product.customer_id
join order_detail on order_product.order_id = order_detail.order_id
join product on order_detail.product_id = product.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.customer_name
from customer
left join order_product on customer.customer_id = order_product.customer_id
where order_product.order_id is null;

/*Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
(giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
Giá bán của từng loại được tính = odQTY*pPrice)

order_product.order_id, order_product.order_date, sum(order_detail.order_qty * product.product_price) as order_total_price
*/
select *
from order_product
join order_detail on order_product.order_id = order_detail.order_id
join product on product.product_id = order_detail.product_id
group by order_product.order_id
having order_total_price > 10;
