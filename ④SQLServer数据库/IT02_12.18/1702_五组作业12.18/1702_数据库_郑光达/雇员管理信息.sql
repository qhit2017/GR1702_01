use db_Employeemanagement

create database tb_message
--����Ա����ţ������������������䣬��ְ���ڣ�нˮ����ʵ����ɾ�Ĳ�
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
values (1,'����',25,'2017/2/02',3000),
(2,'����',20,'2017/3/02',5000)

update tb_message set name='����' where name = '����'



