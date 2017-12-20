create table tb_student(
sno char(11) primary key not null,
sname char(20) not null,
ssex char(2) check(ssex='男' or ssex='女') default '男' not null,
sage smallint not null,
sdept char(20))
--添加数据
insert into tb_student(sno,sname,ssex,sage,sdept)
values('201701','李勇','男',20,'cs'),
('201702','刘晨','女',19,'cs')
-----------
create table tb_course(
cno char(4) primary key,
cname char(20),
cpno char(4),
ccredit smallint)
--添加数据
insert into tb_course 
values('1','数据库','5',4),
('2','数学','',4)
-----------
create table tb_sc(
sno char(11) primary key,
cno char(4),
grade smallint) 
--添加数据
insert into tb_sc
--主键唯一性
values('201701','1',88)

------------------
create table tb_yuangong(
id int identity(1,1) primary key,
name char(18),
ege int,
dateling date,
many money)
--增加
alter table tb_yuangong add sa int
--删除
alter table tb_yuangong drop column ege
--修改
alter table tb_yuangong alter column many int
--查找
sp_help tb_yuangong
select id,name,dateling,many from tb_yuangong