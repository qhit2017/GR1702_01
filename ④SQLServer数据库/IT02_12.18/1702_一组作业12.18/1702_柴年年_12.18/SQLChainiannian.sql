create database db_Chainiannian
create table tb_Student(
Sno char (11) primary key,
Sname char (20),
Ssex char (2) check(Ssex='男' or Ssex='女') default '男',
Sage smallint,
Sdept char (20),
)
create table tb_Course(
Cno char(4) primary key,
CName CHAR(20),
Cpno char(4),
Ccredit smallint,
)
create table tb_SC(
Sno char(11) primary key,
Cno char(4),
Grade smallint,
)
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept)
values (200215121,'李勇','男',20,'CS'),
(200215122,'刘晨','女',19,'CS'),
(200215123,'王敏','女',18,'MA'),
(200215124,'张立','男',19,'IS'),
(200215125,'李丹','男',20,'CS'),
(200215126,'刘涛','女',19,'MA'),
(200215127,'王勇','男',18,'MA'),
(200215128,'张三','男',19,'IS'),
(200215129,'李四','男',20,'CS'),
(200215130,'刘麻子','女',19,'CS'),
(200215131,'王二','女',18,'IS'),
(200215132,'张潭','男',19,'MA'),
(200215133,'张大大','男',20,'CS'),
(200215134,'京东','女',19,'CS'),
(200215135,'淘宝','女',28,'MA'),
(200215136,'拼多多','男',19,'IS'),
(200215137,'天猫','男',20,'CS'),
(200215138,'蘑菇街','女',19,'CS'),
(200215139,'不凡','女',18,'MA'),
(200215140,'瑞丹','男',29,'IS'),
(200215141,'姚明','男',20,'MA'),
(200215142,'陈赤赤','女',19,'CS'),
(200215143,'郑凯','女',28,'MA'),
(200215144,'王祖蓝','男',19,'IS'),
(200215145,'李晨','男',20,'IS'),
(200215146,'邓超','男',20,'CS')
select Sno,Sname,Ssex,Sage,Sdept from tb_Student
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'数据库',5,4),
(2,'数学','', 2),
(3,'英语',2,3),
(4,'信息系统',1,4),
(5,'操作系统',6,3),
(6,'数据结构',7,4),
(7,'数据处理','',2),
(8,'PASCAL语言',6,4),
(9,'java',6,2),
(10,'语文',5,3)
select Cno,CName,Cpno,Ccredit from tb_Course