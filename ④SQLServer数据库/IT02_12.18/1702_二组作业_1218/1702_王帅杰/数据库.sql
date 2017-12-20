create database db_wangshuaijie
create table tb_student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2)check(Ssex='��' or Ssex='Ů'),
Sage smallint not null,
Sdept char(20)
)

create table tb_Course(
Cno char(4)primary key,
CName char(20) not null,
Cpno char(4) not null,
Ccredit smallint)

create table tb_sc(
Sno char(11)primary key,
Cno char(4),
Grade smallint)


select Sno,Sname,Ssex,Sage,Sdept from tb_student
select Cno,Cname,Cpno,Ccredit from tb_Course
select Sno,Cno,Grade from tb_sc
--���ѧ������Ϣ
insert into tb_student(Sno,Sname,Ssex,Sage,Sdept)
values('200215121','����','��','20','CS'),
('200215122','����','Ů','17','MA'),
('200215123','����','Ů','18','MA'),
('200215124','����','��','19','IS')
--��ӿγ���Ϣ
insert into tb_Course(Cno,CName,Cpno,Ccredit)
values('1','���ݿ�','5',4),
('2','��ѧ','',2),
('3','��Ϣϵͳ','1',4),
('4','����ϵͳ','6',3),
('5','���ݽṹ','7','4'),
('6','���ݴ���',' ',2),
('7','PASCAL����','6',4)
--���ѧ��ѡ����Ϣ
insert into tb_SC(Sno,Cno,Grade)
values ('200215121','1',92),
('200215122','2',85),
('200215123','3',88),
('200215124','4',90),
('200215125','5',80)

