create table tb_student(
sno char(11)primary key,
sname char(20) not null,
ssex char(2) check(ssex='男'or ssex='女')default '男',
sage smallint,
sdept char(20),  
)
create table tb_course(
cno char(4) ,
cname char(20) not null,
cpno char(4),
ccredit smallint ,
)
create table tb_sc(
sno char(11) primary key,
cno char(4),
grade smallint,
)
select sno,sname,ssex,sage,sdept from tb_student
insert into tb_student values('200215121','李勇','男',20,'cs'),
('200215122','刘晨','女',19,'cs'),
('200215123','王敏','女',19,'ma'),
('200215124','张立','男',19,'is'),
('200215125','张得','男',19,'is'),
('200215126','张人','男',19,'is'),
('200215127','张个','男',19,'is'),
('200215128','张给','男',19,'is'),
('200215129','张不','男',19,'is'),
('2002151210','张好','男',19,'is'),
('2002151211','张就','男',19,'is'),
('2002151212','张看','男',19,'is'),
('2002151213','张开','男',19,'is'),
('2002151214','张吗','男',19,'is'),
('2002151215','张将','男',19,'is'),
('2002151216','张可','男',19,'is'),
('2002151217','张来','男',19,'is'),
('2002151218','张并','男',19,'is'),
('2002151219','张过','男',19,'is'),
('2002151220','张从','男',19,'is'),
('2002151221','张才','男',19,'is'),
('2002151222','张把','男',19,'is'),
('2002151223','张门','男',19,'is'),
('2002151224','张噢','男',19,'is'),
('2002151225','张后','男',19,'is')
select cno,cname,cpno,ccredit from tb_course
insert into tb_course values('1','数据库','5',4),
('2','数学','',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('1','数据库','5',4),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7',4),
('6','数据处理','',4),
('7','PASCAL语言','6',4)

select sno ,cno,grade from tb_sc
insert into tb_sc values('200215121','1',98),
('200215122','2',98),
('200215123','3',98),
('200215124','5',98),
('200215125','4',98),
('200215126','6',98),
('200215127','8',98),
('200215128','7',98),
('200215129','5',98),
('2002151210','1',98)
