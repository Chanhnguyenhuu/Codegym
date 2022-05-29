create database furama_resort;

drop database furama_resort;

use furama_resort;

create table vi_tri(
ma_vi_tri int not null auto_increment primary key,
ten_vi_tri varchar(45)
);

create table trinh_do(
ma_trinh_do int not null auto_increment primary key,
ten_trinh_do varchar(45)
);

create table bo_phan(
ma_bo_phan int not null auto_increment primary key,
ten_bo_phan varchar(45)
);

create table nhan_vien(
ma_nhan_vien int not null auto_increment primary key,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
ma_loai_khach int not null auto_increment primary key,
ten_loai_khach varchar(45)
);

create table khach_hang(
ma_khach_hang int not null auto_increment primary key,
ma_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table loai_dich_vu(
ma_loai_dich_vu int not null auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

create table kieu_thue(
ma_kieu_thue int not null auto_increment primary key,
ten_kieu_thue varchar(45)
);

create table dich_vu(
ma_dich_vu int not null auto_increment primary key,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
ma_kieu_thue int,
ma_loai_dich_vu int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table hop_dong(
ma_hop_dong int not null auto_increment primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int not null auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int not null auto_increment primary key,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

insert into vi_tri(ten_vi_tri)
values
    ('Le tan'),
    ('Phuc vu'),
    ('Chuyen vien'),
    ('Giam sat'),
    ('Quan ly'),
    ('Giam doc');
    
insert into trinh_do(ten_trinh_do)
values 
	('Trung cap'),
    ('Cao dang'),
    ('Dai hoc'),
    ('Sau Dai hoc');
    
insert into bo_phan(ten_bo_phan)
values
	('Sale - Marketing'),
    ('Hanh chinh'),
    ('Phuc vu'),
    ('Quan ly');

insert into loai_dich_vu(ten_loai_dich_vu)
values 
	('Villa'),
    ('House'),
    ('Room');
    
insert into kieu_thue(ten_kieu_thue)
values 
	('Thue theo nam'),
    ('Thue theo thang'),
    ('Thue theo ngay'),
    ('Thue theo gio');
    
insert into dich_vu_di_kem(ten_dich_vu_di_kem, gia, don_vi, trang_thai)
values
	('Massage', 100000.0, 've', 'off'),
    ('Karaoke', 200000.0, 'gio', 'on'),
    ('Thuc an', 150000.0, 've', 'on'),
    ('Nuoc uong', 20000.0, 'chai', 'on'),
    ('Thue xe', 120000.0, 'chiec', 'off');

insert into loai_khach(ten_loai_khach)
values
	('Diamond'),
    ('Platinium'),
    ('Gold'),
    ('Silver'),
    ('Member');

insert into khach_hang(ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values
	(1, 'Truong Cong Hien', '1990-11-03', 1, '02078945', 0905987768, 'hien@gmail.com', 'Da nang'),
    (5, 'Nguyen Van Khoa', '1996-06-15', 1, '01054657', 0905944567, 'khoa@gmail.com', 'Quang Tri'),
	(2, 'Vo Hau', '1985-06-12', 0, '32156745', 0905335476, 'hau@gmail.com', 'Quang Tri'),
    (4, 'Pham Tan', '1989-11-03', 1, '02076882', 0905347658, 'tan@gmail.com', 'Da nang'),
    (3, 'Tran Thi Hoa', '1990-11-03', 0, '36547097', 0905879896, 'hoa@gmail.com', 'Quang Nam');
    
    
/* Hiển thị thông tin những nhân viên có tên bắt đầu bằng 't', 'h', 'k'
và độ dài tên nhỏ hơn 15
*/
select * 
from nhan_vien
where ho_ten like 't%' or ho_ten like 'h%' or ho_ten like 'k%' and length(ho_ten) < 15;
