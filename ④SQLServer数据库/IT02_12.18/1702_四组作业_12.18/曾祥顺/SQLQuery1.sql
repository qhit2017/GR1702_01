create table tb_student(
sno char(11) primary key not null,
sname char(20) not null,
ssex char(2) check(ssex='��' or ssex='Ů') default '��' not null,
sage smallint not null,
sdept char(20))
--�������
insert into tb_student(sno,sname,ssex,sage,sdept)
values('201701','����','��',20,'cs'),
('201702','����','Ů',19,'cs')
-----------
create table tb_course(
cno char(4) primary key,
cname char(20),
cpno char(4),
ccredit smallint)
--�������
insert into tb_course 
values('1','���ݿ�','5',4),
('2','��ѧ','',4)
-----------
create table tb_sc(
sno char(11) primary key,
cno char(4),
grade smallint) 
--�������
insert into tb_sc
--����Ψһ��
values('201701','1',88)

------------------
create table tb_yuangong(
id int identity(1,1) primary key,
name char(18),
ege int,
dateling date,
many money)
--����
alter table tb_yuangong add sa int
--ɾ��
alter table tb_yuangong drop column ege
--�޸�
alter table tb_yuangong alter column many int
--����
sp_help tb_yuangong
select id,name,dateling,many from tb_yuangong