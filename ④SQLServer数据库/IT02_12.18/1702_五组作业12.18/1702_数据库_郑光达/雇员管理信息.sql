use db_Employeemanagement

create database tb_message
--包括员工编号（主键），姓名，年龄，入职日期，薪水；并实现增删改查
create table tb_message(
id int primary key,
name char(8) not null,
age int ,
dateine date,
salary money)

sp_help tb_message
SELECT * FROM tb_message
truncate table tb_message

insert into tb_message(id,name,age,dateine,salary)
values (1,'张三',25,'2017/2/02',3000),
(2,'李四',20,'2017/3/02',5000)

update tb_message set name='米子' where name = '张三'



