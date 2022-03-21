create database huongtram

use huongtram

create table Adm (username varchar(20) primary key not null,
pass varchar(30) not null)

create table Customer (id varchar(10) primary key not null, username varchar(20),
pass varchar(30) not null, phone varchar(20)) 

create table Product (
id varchar(10) primary key,
name nvarchar(50),price int, img varchar(200), sl int, 
cateID varchar(10) foreign key references Category(id))

create table Category (id varchar(10) primary key,
name nvarchar(50))

insert into Product values ('1',N'H??ng nén th?o m?c', 10000,N'img/HUONGNEN/huongnen1.jpg', '10', '1' )
insert into Product values ('2',N'H??ng sào th?o m?c', 20000,N'img/HUONGNEN/huongsaotm.jpg', '10', '1' )
insert into Product values ('3',N'H??ng vòng th?o m?c', 50000,N'img/HUONGNEN/huongvongtm.jpg', '10', '1' )

insert into Product values ('4',N'H??ng nén tr?m ??c bi?t', 100000,N'img/HUONGNEN/huongnentram.jpg', '10', '2' )
insert into Product values ('5',N'H??ng sào tr?m ??c bi?t', 300000,N'img/HUONGNEN/huongsaotram1.jpg', '10', '2' )
insert into Product values ('6',N'H??ng vòng tr?m 2h', 40000,N'img/HUONGNEN/huongvongtram2h.jpgg', '10', '2' )
insert into Product values ('7',N'H??ng vòng tr?m 8h', 100000,N'img/HUONGNEN/huongvongtram8h.jpg', '10', '2' )

insert into Product values ('8',N'N? th?o m?c', 50000,N'img/TRAMNU/nutm.jpg', '10', '3' )
insert into Product values ('9',N'N? tr?m khói', 170000,N'img/TRAMNU/nutramkhoi.jpg', '10', '3' )
insert into Product values ('10',N'N? tr?m th?m', 250000,N'img/TRAMNU/nutramthom.jpg', '10', '3' )

insert into Product values ('11',N'Trà tr?m l? ??', 100000,N'img/TRATRAM/tratramlodo.jpg', '10', '4' )
insert into Product values ('12',N'Trà tr?m cao c?p', 1300000,N'img/TRATRAM/tratramcaocap.jpg', '10', '4' )

insert into Product values ('13',N'B? tr?m thi?n', 350000,N'img/TRAMTHIEN/botramthien.jpg', '10', '5' )
insert into Product values ('14',N'?ng h??ng thi?n', 250000,N'img/TRAMTHIEN/onghuongthien.jpg', '10', '5' )


insert into Category values ('1', N'H??ng nén TM')
insert into Category values ('2', N'H??ng nén tr?m')
insert into Category values ('3', N'Tr?m n?')
insert into Category values ('4', N'Trà tr?m')
insert into Category values ('5', N'Tr?m thi?n')

select* from Product
SELECT* from Category