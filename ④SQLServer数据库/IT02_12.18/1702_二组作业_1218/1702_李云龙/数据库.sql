
--ѧ����
create table tb_Student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check (Ssex='��' or Ssex='Ů')default'��',
Sage smallint,
Sdept char(20))
--�γ̱�
create table tb_Course(
Cno char(4) ,
CName char(20),
Cpno char(4),
Ccredit smallint)
--ѧ��ѡ�α�
create table tb_SC(
Sno char(11) primary key,
Cno char(4),
Grade smallint)
--ѧ����
sp_help tb_Student
select Sno,Sname,Ssex,Sage,Sdept from tb_Student
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept) 
values('201212121','����','��',18,'CS'),
('201312152','����','��',19,'CS'),
('201512123','����','Ů',17,'MA'),
('201512544','����','��',16,'IS')

insert into tb_Course(Cno,Cname,Cpno,Credit)
values('1','���ݿ�','5',4),
('2','��ѧ',' ',2),
('3','��Ϣϵͳ','1',4),
('4','����ϵͳ','6',3),
('5','���ݽṹ','7',4),
('6','���ݴ���',' ',2),
('7','PASCAL����','6',4)


insert into tb_SC(Sno,Cno,Grade)
values ('200215121','1',92),
('200215121','2',98),
('200215121','3',88),
('200215122','2',95),
('200215122','3',80)

