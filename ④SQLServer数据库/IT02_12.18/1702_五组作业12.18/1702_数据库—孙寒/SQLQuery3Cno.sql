create table tb_course(
Cno char(4)primary key,
cName char(20)not null,
Cpno char(4)not null,
Ccredit smallint(10)not null,)
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'数据库',5,4),
(2,'数学','',2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理','',2),
(7,'PASCAL',6,4),
(8,'PS',2,3),
(9,'英语',6,7),
(10,'JAVA',8,4),
(11,'思修',3,4)
select * from tb_Course