
--学生表
create table tb_Student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check (Ssex='男' or Ssex='女')default'男',
Sage smallint,
Sdept char(20))
--课程表
create table tb_Course(
Cno char(4) ,
CName char(20),
Cpno char(4),
Ccredit smallint)
--学生选课表
create table tb_SC(
Sno char(11) primary key,
Cno char(4),
Grade smallint)
--学生表
sp_help tb_Student
select Sno,Sname,Ssex,Sage,Sdept from tb_Student
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept) 
values('201212121','张三','男',18,'CS'),
('201312152','李四','男',19,'CS'),
('201512123','张曦','女',17,'MA'),
('201512544','张荣','男',16,'IS')

insert into tb_Course(Cno,Cname,Cpno,Credit)
values('1','数据库','5',4),
('2','数学',' ',2),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7',4),
('6','数据处理',' ',2),
('7','PASCAL语言','6',4)


insert into tb_SC(Sno,Cno,Grade)
values ('200215121','1',92),
('200215121','2',98),
('200215121','3',88),
('200215122','2',95),
('200215122','3',80)

