create database huong_tram

use huong_tram


create table Product (
id varchar(10) primary key,
name nvarchar(50),price int, img varchar(200), sl int, 
cateID varchar(10) foreign key references Category(id))

create table Category (id varchar(10) primary key,
name nvarchar(50))

insert into Product values ('1',N'Hương nén thảo mộc', 10000,N'img/HUONGNEN/huongnen1.jpg', '10', '1' )
insert into Product values ('2',N'Hương sào thảo mộc', 20000,N'img/HUONGNEN/huongsaotm.jpg', '10', '1' )
insert into Product values ('3',N'Hương vòng thảo mộc', 50000,N'img/HUONGNEN/huongvongtm.jpg', '10', '1' )

insert into Product values ('4',N'Hương nén trầm đặc biệt', 100000,N'img/HUONGNEN/huongnentram.jpg', '10', '2' )
insert into Product values ('5',N'Hương sào trầm đặc biệt', 300000,N'img/HUONGNEN/huongsaotram1.jpg', '10', '2' )
insert into Product values ('6',N'Hương vòng trầm 2h', 40000,N'img/HUONGNEN/huongvongtram2h.jpg', '10', '2' )
insert into Product values ('7',N'Hương vòng trầm 8h', 100000,N'img/HUONGNEN/huongvongtram8h.jpg', '10', '2' )

insert into Product values ('8',N'Nụ thảo mộc', 50000,N'img/TRAMNU/nutm.jpg', '10', '3' )
insert into Product values ('9',N'Nụ trầm khói', 170000,N'img/TRAMNU/nutramkhoi.jpg', '10', '3' )
insert into Product values ('10',N'Nụ trầm thơm', 250000,N'img/TRAMNU/nutramthom.jpg', '10', '3' )

insert into Product values ('11',N'Trà trầm lọ đỏ', 100000,N'img/TRATRAM/tratramlodo.jpg', '10', '4' )
insert into Product values ('12',N'Trà trầm cao cấp', 1300000,N'img/TRATRAM/tratramcaocap.jpg', '10', '4' )

insert into Product values ('13',N'Bộ trầm thiền', 350000,N'img/TRAMTHIEN/botramthien.jpg', '10', '5' )
insert into Product values ('14',N'Ống hương thiền', 250000,N'img/TRAMTHIEN/onghuongthien.jpg', '10', '5' )


insert into Category values ('1', N'Hương nén TM')
insert into Category values ('2', N'Hương nén trầm')
insert into Category values ('3', N'Trầm nụ')
insert into Category values ('4', N'Trà trầm')
insert into Category values ('5', N'Trầm thiền')

select* from Product
SELECT* from Category

Select* from Product 
where cateID = '1'

Select* from Product 
where id = '1'

create table Accounts (id int,
users nvarchar(50),
pass varchar(30) not null,
isSell int primary key not null,
isAdmin int)

insert into Accounts values ('1', N'admin', 'admin', '0', '1')
insert into Accounts values ('2', N'abc', 'abc', '1', '0')

select* from Accounts
where users ='admin'
and pass='admin'

insert into Accounts
values(0,'mrc','123')

insert into
Product 
values('15',N'Ống hương thiền nhỏ', 150000,N'img/TRAMTHIEN/onghuongthien.jpg', '10', '5')

delete from Product
 where id = '15'
 
 update Product
 set [name] = 'ooo',
 price ='1234',
 img='fewfe',
 sl='12',
 cateID ='4'
 where id=15
 
 create table Order_list(
id varchar(10) primary key, account_id int foreign key references Accounts(isSell), 
name nvarchar(50), phone varchar(20), address nvarchar(100), order_date date)

create table Order_detail (
id varchar(10)  foreign key references Order_list(id),
pid varchar(10) foreign key references Product(id),name nvarchar(50) ,price int, quantity int, DVT varchar(10))
 
 
