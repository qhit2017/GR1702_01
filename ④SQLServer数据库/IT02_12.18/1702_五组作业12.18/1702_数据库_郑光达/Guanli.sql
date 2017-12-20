use db_zgd

truncate table tb_student
sp_help tb_student
insert into tb_Student(Ssno,Ssname,Ssex,Sage,Sdept)
values (20021511,'刘勇','男',18,'CS'),
(20021512,'刘勇','男',20,'CS'),
(20021513,'张三','女',19,'CS'),
(20021514,'李四','男',18,'MA'),
(20021515,'王二','男',19,'CS'),
(20021516,'麻子','男',18,'CS'),
(20021517,'刘一','男',18,'CS'),
(20021518,'刘二','男',18,'CS'),
(20021519,'刘三','男',18,'CS'),
(20021520,'刘四','男',18,'CS'),
(20021521,'刘无','男',18,'CS'),
(20021522,'刘六','男',18,'CS'),
(20021523,'刘七','男',18,'CS'),
(20021524,'刘八','男',18,'CS'),
(20021525,'刘九','男',18,'CS'),
(20021526,'刘十','男',18,'CS'),
(20021527,'刘天','男',18,'CS'),
(20021528,'刘地','男',18,'CS'),
(20021529,'刘梦','男',18,'CS'),
(20021530,'刘猛','男',18,'CS'),
(20021531,'刘蒙','男',18,'CS'),
(20021532,'刘孟','男',18,'CS'),
(20021533,'刘盟','男',18,'CS'),
(20021534,'刘萌','男',18,'CS'),
(20021535,'刘么','男',18,'CS')


alter table tb_Student drop constraint CK__tb_Student__Ssex__060DEAE8
SELECT * FROM tb_Student


truncate table tb_course
SELECT * FROM tb_course
insert into tb_course(Cno,CName,Cpno,Ccredit)
values (1,'数据库',5,4),
(2,'数学',null,2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理',null,2),
(7,'pascal语言',6,4)

alter table tb_SC drop constraint PK__tb_SC__CA1FE4640CBAE877
sp_help tb_SC
insert into tb_SC(Sno,Cno,Grade)
values (200215121,1,92),
(200215121,2,85),
(200215121,3,88),
(200215122,2,90),
(200215122,3,80)
SELECT * FROM tb_SC