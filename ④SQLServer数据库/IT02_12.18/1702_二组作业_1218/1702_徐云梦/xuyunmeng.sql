create table tb_student(
sno char(11) primary key,
sname char(20),
ssex char(2) check(ssex='男'or ssex='女') default'男',
sage smallint,
sdept char(20),
)
select sno,sname,ssex,sage,sdept from tb_student
insert into tb_student values
('2002158121','李勇','男',20,'cs'),
('2002158122','刘晨','女',19,'cs'),
('2002158123','王敏','女',18,'ma'),
('2002158124','张立','男',19,'is'),
('2002158125','张得','男',19,'is')
create table tb_course(
cno char(4),
cname char(20),
cpno char(4),
ccredit smallint
)
select cno,cname,cpno,ccredit from tb_course

insert into tb_course values('1','数据库','5',4),
('2','数学','4',5),
('3','ps','2',1),
('4','英语','1',7),
('5','数学','1',9),
('6','思修','1',2)
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
