create table tb_employee(
number  char(11) primary key,
name char(20),
 age smallint,
enrollment char(8) ,
 salary  decimal(8,4)
 ) 
 select name from sys.objects where type = 'U'
----���� 
sp_help tb_employee 
alter table tb_employee add remarks ntext
----ɾ��
sp_help tb_employee 
alter table tb_employee drop column remarks
-----�޸�
sp_help tb_employee 
alter table tb_employee alter column salary nvarchar(8) not null
----��ѯ
sp_help tb_employee 
select number,name,age,enrollment,salary from tb_employee
