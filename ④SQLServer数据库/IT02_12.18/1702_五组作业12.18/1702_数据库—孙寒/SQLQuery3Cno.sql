create table tb_course(
Cno char(4)primary key,
cName char(20)not null,
Cpno char(4)not null,
Ccredit smallint(10)not null,)
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