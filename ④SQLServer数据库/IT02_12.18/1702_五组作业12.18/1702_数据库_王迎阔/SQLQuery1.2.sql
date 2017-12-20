create table tb_Course(
Cno char(4) primary key,
CName char(20),
Cpno char(4),
Ccredit smallint
)
sp_help tb_Course
select Cno,CName,Cpno,Ccredit from tb_Course
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'数据库',5,4),
(2,'数学',0,2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理',0,2),
(7,'pASCAL语言',6,4),
(8,'c语言',3,2),
(9,'java语言',9,8),
(10,'网页设计',5,2),
(11,'Photoshop',6,4)
