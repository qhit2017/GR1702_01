create database db_testyee
use db_testyee 
create table tb_testyee(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='��' or Ssex='Ů')default '��' not null,
Sage smallint not null,
Sdept char(12))
INSERT INTO tb_testyee (Sno,Sname,Ssex,Sage,Sdept)
VALUES(200215121,'����','��',20,'CS'),
(200215122,'����','Ů',19,'CS'),
(200215123,'����','Ů',18,'MA'),
(200515125,'����','��',19,'IS')
SELECT * from tb_testyee
--�γ̱�
create table tb_Course(
Cno char(4) primary key,
Cname char(20) not null,
Cpno char(4) not null,
Ccredit smallint not null)
INSERT INTO tb_Course (Cno,Cname,Cpno,Ccredit)
VALUES(1,'���ݿ�',5,4),
(2,'��ѧ','' ,2),
(3,'��Ϣϵͳ',1,4),
(4,'����ϵͳ',6,3),
(5,'���ݽṹ',7,4),
(6,'���ݴ���','' ,2),
(7,'PASCAL����',6,4)
SELECT * FROM tb_Course 
--ѧ��ѡ�α�---
create table tb_sc(
 Sno char(11) primary key,
 Cno char(4) not null,
 Grade smallint)
 INSERT INTO tb_sc (Sno,Cno,Grade)
 VALUES(200215121,1,92),
 (200215122,2,85),
 (200215123,3,88),
 (200215124,2,90),
 (200215125,3,80)
 SELECT * FROM tb_sc 
