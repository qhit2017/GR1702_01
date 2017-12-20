create table tb_student(
sno char(11) primary key,
sname char(20),
ssex char(2) check(ssex='��'or ssex='Ů') default'��',
sage smallint,
sdept char(20),
)
select sno,sname,ssex,sage,sdept from tb_student
insert into tb_student values
('2002158121','����','��',20,'cs'),
('2002158122','����','Ů',19,'cs'),
('2002158123','����','Ů',18,'ma'),
('2002158124','����','��',19,'is'),
('2002158125','�ŵ�','��',19,'is')
create table tb_course(
cno char(4),
cname char(20),
cpno char(4),
ccredit smallint
)
select cno,cname,cpno,ccredit from tb_course

insert into tb_course values('1','���ݿ�','5',4),
('2','��ѧ','4',5),
('3','ps','2',1),
('4','Ӣ��','1',7),
('5','��ѧ','1',9),
('6','˼��','1',2)
create table tb_sc(
sno char(11) primary key,
cno char(4),
grade smallint
)
select sno,cno,grade from tb_sc
insert into tb_sc values('20170201','1',98),
('20170202','1',68),
('20170203','1',91),
('20170204','1',28)
