create database db_wangshuaijie
create table tb_student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2)check(Ssex='男' or Ssex='女'),
Sage smallint not null,
Sdept char(20)
)

create table tb_Course(
Cno char(4)primary key,
CName char(20) not null,
Cpno char(4) not null,
Ccredit smallint)

create table tb_sc(
Sno char(11)primary key,
Cno char(4),
Grade smallint)


select Sno,Sname,Ssex,Sage,Sdept from tb_student
select Cno,Cname,Cpno,Ccredit from tb_Course
select Sno,Cno,Grade from tb_sc
--添加学生表信息
insert into tb_student(Sno,Sname,Ssex,Sage,Sdept)
values('200215121','李勇','男','20','CS'),
('200215122','刘晨','女','17','MA'),
('200215123','玉敏','女','18','MA'),
('200215124','张立','男','19','IS')
--添加课程信息
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values('1','数据库','5',4),
('2','数学','',2),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7','4'),
('6','数据处理',' ',2),
('7','PASCAL语言','6',4)
--添加学生选课信息
insert into tb_SC(Sno,Cno,Grade)
values ('200215121','1',92),
('200215122','2',85),
('200215123','3',88),
('200215124','4',90),
('200215125','5',80)

