create table tb_course(
cno char(4) primary key,
cname char(20),
cpno char(4),
ccredit smallint
)
insert into tb_course(cno,cname,cpno,ccredit)
values('1','数据库','5',4),
('2','数学','  ',2),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7',4),
('6','数据处理',' ',2),
('7','PASCAL','6',4),
('8','数据库','5',4),
('9','数学','  ',2),
('10','信息系统','1',4),
('11','操作系统','6',3),
('12','数据结构','7',4),
('13','数据处理',' ',2),
('14','PASCAL','6',4),
('15','数据库','5',4),
('16','数学','  ',2),
('17','信息系统','1',4),
('18','操作系统','6',3),
('19','数据结构','7',4),
('20','数据处理',' ',2),
('21','PASCAL','6',4),
('22','数据库','5',4),
('23','数学','  ',2),
('24','信息系统','1',4),
('25','操作系统','6',3),
('26','数据结构','7',4),
('27','数据处理',' ',2),
('28','PASCAL','6',4)
select * from tb_course
