create database demo;

drop database demo;

use demo;

create table Product(
id int not null auto_increment primary key,
product_code varchar(20),
product_name varchar(45),
product_price double,
product_amount varchar(20),
product_description varchar(20),
product_status int
);

insert into product
values
	(1, '345345', 'Nha', 457.0, '35435', '35436', 1),
    (2, '343535', 'Xe', 56.0, '45356', '9878', 0),
    (3, '436543', 'Computer', 43.0, '45645', '54355', 0);

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
ALTER TABLE product ADD UNIQUE product_code_index (product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
ALTER TABLE product ADD UNIQUE product_composite_index (product_name, product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
EXPLAIN SELECT * FROM product WHERE product_code = '343535';

-- So sánh câu truy vấn trước và sau khi tạo index
SELECT * FROM product WHERE product_code = '343535';







