--create database db_student

create table tb_student(
sno char(11)primary key not null,
sname char(20)not null,
ssex char check(ssex='男' or ssex='女') not null,
sage smallint not null,
sdept char(20),
)
--查询数据库
sp_help tb_student
select sno,sname,ssex,sage,sdept from tb_student

--增加数据
insert into tb_student(sno,sname,ssex,sage,sdept)
values('200215121','李勇','男',20,'cs')