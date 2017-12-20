create database db_testyee
use db_testyee 
create table tb_testyee(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='男' or Ssex='女')default '男' not null,
Sage smallint not null,
Sdept char(12))
INSERT INTO tb_testyee (Sno,Sname,Ssex,Sage,Sdept)
VALUES(200215121,'李勇','男',20,'CS'),
(200215122,'刘晨','女',19,'CS'),
(200215123,'王敏','女',18,'MA'),
(200515125,'张立','男',19,'IS')
SELECT * from tb_testyee
--课程表
create table tb_Course(
Cno char(4) primary key,
Cname char(20) not null,
Cpno char(4) not null,
Ccredit smallint not null)
INSERT INTO tb_Course (Cno,Cname,Cpno,Ccredit)
VALUES(1,'数据库',5,4),
(2,'数学','' ,2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理','' ,2),
(7,'PASCAL语言',6,4)
SELECT * FROM tb_Course 
--学生选课表---
create table tb_sc(
 Sno char(11) primary key,
 Cno char(4) not null,
 Grade smallint)
 INSERT INTO tb_sc (Sno,Cno,Grade)
 VALUES(200215121,1,92),
 (200215122,2,85),
 (200215123,3,88),
 (200215124,2,90),
 (200215125,3,80)
 SELECT * FROM tb_sc 
