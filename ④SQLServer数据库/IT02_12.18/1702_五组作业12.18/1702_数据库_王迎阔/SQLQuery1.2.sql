create table tb_Course(
Cno char(4) primary key,
CName char(20),
Cpno char(4),
Ccredit smallint
)
sp_help tb_Course
select Cno,CName,Cpno,Ccredit from tb_Course
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'���ݿ�',5,4),
(2,'��ѧ',0,2),
(3,'��Ϣϵͳ',1,4),
(4,'����ϵͳ',6,3),
(5,'���ݽṹ',7,4),
(6,'���ݴ���',0,2),
(7,'pASCAL����',6,4),
(8,'c����',3,2),
(9,'java����',9,8),
(10,'��ҳ���',5,2),
(11,'Photoshop',6,4)
