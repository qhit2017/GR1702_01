create database db_LiJiguang
--学生表
create table tb_student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='男' or Ssex='女'),
Sage smallint not null,
Sdept char(20))  
--课程表
create table tb_Course(
Cno char(4) primary key,
Cname char(20) not null,
Cpno char(4) not null,
Credit smallint )
--学生选课表
create table tb_SC(
Sno char(11) primary key,
Cno char(4) not null,
Grade int )      
-------------------------------------------------------------------
select Sno,Sname,Ssex,Sage,Sdept from tb_student
select Cno,Cname,Cpno,Credit from tb_Course
select Sno,Cno,Grade from tb_SC
--添加学生表信息
insert into tb_student(Sno,Sname,Ssex,Sage,Sdept) 
values('200215121','李勇','男',20,'CS'),
('200215122','刘晨','女',19,'CS'),
('200215123','王敏','女',18,'MA'),
('200215124','张立','女',19,'IS')
--添加课程表信息
insert into tb_Course(Cno,Cname,Cpno,Credit)
values('1','数据库','5',4),
('2','数学',' ',2),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7',4),
('6','数据处理',' ',2),
('7','PASCAL语言','6',4)
--添加学生选课表信息
insert into tb_SC(Sno,Cno,Grade)
values ('200215121','1',92),
('200215121','2',85),
('200215121','3',88),
('200215122','2',90),
('200215122','3',80)
