create database quan_ly_diem_thi;

use quan_ly_diem_thi;

create table hoc_sinh (
ma_hs int primary key not null,
ten_hs varchar(45) not null,
ngay_sinh datetime,
lop varchar(20),
gioi_tinh varchar(10)
);

create table mon_hoc (
ma_mh int primary key not null,
ten_mh varchar(20) not null
);

create table bang_diem (
ma_hs int not null,
ma_mh int not null,
diem_thi int,
ngay_kt datetime,
primary key (ma_hs, ma_mh)
);

create table giao_vien (
ma_gv int primary key,
ten_gv varchar(20),
sdt varchar(20)
);

alter table mon_hoc add ma_gv int;
alter table mon_hoc add foreign key (ma_gv) references giao_vien(ma_gv);

alter table bang_diem add foreign key (ma_hs) references hoc_sinh(ma_hs);
alter table bang_diem add foreign key (ma_mh) references mon_hoc(ma_mh);

