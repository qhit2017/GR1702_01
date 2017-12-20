--��һ��
create database db_yuhebi
use db_yuhebi
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='��' or Ssex= 'Ů') default '��' not null,
Sage smallint not null,
Sdept char(20) 
)
create table tb_Course(
Cno char(4) primary key,
CName char(20) not null,
Cpno char(4)not null,
Ccredit smallint  not null
)
create table tb_SC(
Sno char(11) primary key,
Cno char(4) not null,
Grade smallint not null 
)  
--�ڶ���
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept) 
values(200215621,'����','��',20,'CS'),
(200215622,'����','Ů',19,'CS'),
(200215623,'����','Ů',18,'MA'),
(200215624,'����','��',19,'IS'),
(200215625,'��С��','��',18,'IT'),
(200215626,'��ӭ��','��',18,'IT'),
(200215627,'�ֻ۲�','��',18,'IT'),
(200215628,'���ڻ�','��',20,'IT'),
(200215629,'�ų�','��',18,'IT'),
(200215630,'����','��',17,'IT'),
(200215631,'�Ľ�','��',18,'IT'),
(200215632,'��С��','��',18,'IT'),
(200215633,'������','Ů',18,'IT'),
(200215634,'���','Ů',18,'IT'),
(200215635,'֣���','��',18,'IT'),
(200215636,'�ﺮ','��',18,'IT'),
(200215637,'������','��',18,'IT'),
(200215638,'��̹�','��',19,'IT'),
(200215639,'л��ΰ','��',18,'IT'),
(200215640,'�¿��D','��',18,'IT'),
(200215641,'������','Ů',18,'IT'),
(200215642,'��ѩ��','Ů',18,'IT'),
(200215643,'������','��',18,'IT'),
(200215644,'������','��',18,'IT'),
(200215645,'������','��',18,'IT'),
(200215646,'����ΰ','��',18,'IT'),
(200215647,'������','��',18,'IT'),
(200215648,'ʢ����','��',18,'IT')
select * from tb_Student

insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'���ݿ�',5,4),
(2,'��ѧ','',2),
(3,'��Ϣϵͳ',1,4),
(4,'����ϵͳ',6,3),
(5,'���ݽṹ',7,4),
(6,'���ݴ���','',2),
(7,'PASCAL',6,4),
(8,'PS',2,3),
(9,'Ӣ��',6,7),
(10,'JAVA',8,4),
(11,'˼��',3,4)
select * from tb_Course

insert into tb_SC(Sno,Cno,Grade)
values(200215121,1,92),
(200215122,2,85),
(200215123,3,88),
(200215124,2,90),
(200215125,3,80),
(200215126,3,65),
(200215127,2,78),
(200215128,1,98),
(200215129,2,87),
(200215130,3,68),
(200215131,5,59),
(200215132,4,68),
(200215133,6,78),
(200215134,7,78),
(200215135,3,56),
(200215136,3,69),
(200215137,5,96),
(200215138,7,78),
(200215139,5,98),
(200215140,1,86),
(200215141,2,67),
(200215142,4,94),
(200215143,3,84),
(200215144,6,69),
(200215145,2,88),
(200215146,4,95)
select * from tb_SC
--������
create table tb_employee(
id tinyint identity(1,1) primary key,
name nvarchar(16) not null,
age smallint not null,
workingdate date not null,
salary money not null
)
insert into tb_employee(name,age,workingdate,salary)
values('����',21,'2012-12-21',5500),
('����',22,'2013-11-17',4500),
('����',20,'2011-08-15',6500),
('����',21,'2015-05-18',3500)

select * from tb_employee
--��
alter table tb_employee add sex  char(2) check(sex='��' or sex='Ů') default '��'
insert into tb_employee select 'С��',20,'2016-10-24',4200,'��'
select * from tb_employee
--ɾ
delete from tb_employee where name = '����'
select * from tb_employee
--��
update tb_employee set salary = 5000 where name = '����'
select * from tb_employee
update tb_employee set sex = '��' where name = '����'
update tb_employee set sex = '��' where name = '����'
update tb_employee set sex = 'Ů' where name = '����'
select * from tb_employee
--��
select name from tb_employee 
select id,name,sex from tb_employee 
                                                                                                                          