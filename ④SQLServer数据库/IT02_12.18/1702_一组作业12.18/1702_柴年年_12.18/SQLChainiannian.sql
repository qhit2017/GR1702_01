create database db_Chainiannian
create table tb_Student(
Sno char (11) primary key,
Sname char (20),
Ssex char (2) check(Ssex='��' or Ssex='Ů') default '��',
Sage smallint,
Sdept char (20),
)
create table tb_Course(
Cno char(4) primary key,
CName CHAR(20),
Cpno char(4),
Ccredit smallint,
)
create table tb_SC(
Sno char(11) primary key,
Cno char(4),
Grade smallint,
)
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept)
values (200215121,'����','��',20,'CS'),
(200215122,'����','Ů',19,'CS'),
(200215123,'����','Ů',18,'MA'),
(200215124,'����','��',19,'IS'),
(200215125,'�','��',20,'CS'),
(200215126,'����','Ů',19,'MA'),
(200215127,'����','��',18,'MA'),
(200215128,'����','��',19,'IS'),
(200215129,'����','��',20,'CS'),
(200215130,'������','Ů',19,'CS'),
(200215131,'����','Ů',18,'IS'),
(200215132,'��̶','��',19,'MA'),
(200215133,'�Ŵ��','��',20,'CS'),
(200215134,'����','Ů',19,'CS'),
(200215135,'�Ա�','Ů',28,'MA'),
(200215136,'ƴ���','��',19,'IS'),
(200215137,'��è','��',20,'CS'),
(200215138,'Ģ����','Ů',19,'CS'),
(200215139,'����','Ů',18,'MA'),
(200215140,'��','��',29,'IS'),
(200215141,'Ҧ��','��',20,'MA'),
(200215142,'�³��','Ů',19,'CS'),
(200215143,'֣��','Ů',28,'MA'),
(200215144,'������','��',19,'IS'),
(200215145,'�','��',20,'IS'),
(200215146,'�˳�','��',20,'CS')
select Sno,Sname,Ssex,Sage,Sdept from tb_Student
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'���ݿ�',5,4),
(2,'��ѧ','', 2),
(3,'Ӣ��',2,3),
(4,'��Ϣϵͳ',1,4),
(5,'����ϵͳ',6,3),
(6,'���ݽṹ',7,4),
(7,'���ݴ���','',2),
(8,'PASCAL����',6,4),
(9,'java',6,2),
(10,'����',5,3)
select Cno,CName,Cpno,Ccredit from tb_Course