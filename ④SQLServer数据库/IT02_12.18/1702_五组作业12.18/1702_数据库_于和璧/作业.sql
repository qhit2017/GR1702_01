--第一题
create database db_yuhebi
use db_yuhebi
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='男' or Ssex= '女') default '男' not null,
Sage smallint not null,
Sdept char(20) 
)
create table tb_Course(
Cno char(4) primary key,
CName char(20) not null,
Cpno char(4)not null,
Ccredit smallint  not null
)
create table tb_SC(
Sno char(11) primary key,
Cno char(4) not null,
Grade smallint not null 
)  
--第二题
insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept) 
values(200215621,'李勇','男',20,'CS'),
(200215622,'刘晨','女',19,'CS'),
(200215623,'王敏','女',18,'MA'),
(200215624,'张立','男',19,'IS'),
(200215625,'李小豪','男',18,'IT'),
(200215626,'王迎阔','男',18,'IT'),
(200215627,'贾慧博','男',18,'IT'),
(200215628,'孔于辉','男',20,'IT'),
(200215629,'团长','男',18,'IT'),
(200215630,'老刘','男',17,'IT'),
(200215631,'夏杰','男',18,'IT'),
(200215632,'夏小雨','男',18,'IT'),
(200215633,'郭亚茹','女',18,'IT'),
(200215634,'李静静','女',18,'IT'),
(200215635,'郑光达','男',18,'IT'),
(200215636,'孙寒','男',18,'IT'),
(200215637,'陈亮亮','男',18,'IT'),
(200215638,'李继光','男',19,'IT'),
(200215639,'谢庆伟','男',18,'IT'),
(200215640,'陈俊燚','男',18,'IT'),
(200215641,'李利利','女',18,'IT'),
(200215642,'杨雪婷','女',18,'IT'),
(200215643,'李少庆','男',18,'IT'),
(200215644,'赵舞阳','男',18,'IT'),
(200215645,'李永立','男',18,'IT'),
(200215646,'刘天伟','男',18,'IT'),
(200215647,'柴年年','男',18,'IT'),
(200215648,'盛明春','男',18,'IT')
select * from tb_Student

insert into tb_Course(Cno,CName,Cpno,Ccredit)
values (1,'数据库',5,4),
(2,'数学','',2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理','',2),
(7,'PASCAL',6,4),
(8,'PS',2,3),
(9,'英语',6,7),
(10,'JAVA',8,4),
(11,'思修',3,4)
select * from tb_Course

insert into tb_SC(Sno,Cno,Grade)
values(200215121,1,92),
(200215122,2,85),
(200215123,3,88),
(200215124,2,90),
(200215125,3,80),
(200215126,3,65),
(200215127,2,78),
(200215128,1,98),
(200215129,2,87),
(200215130,3,68),
(200215131,5,59),
(200215132,4,68),
(200215133,6,78),
(200215134,7,78),
(200215135,3,56),
(200215136,3,69),
(200215137,5,96),
(200215138,7,78),
(200215139,5,98),
(200215140,1,86),
(200215141,2,67),
(200215142,4,94),
(200215143,3,84),
(200215144,6,69),
(200215145,2,88),
(200215146,4,95)
select * from tb_SC
--第三题
create table tb_employee(
id tinyint identity(1,1) primary key,
name nvarchar(16) not null,
age smallint not null,
workingdate date not null,
salary money not null
)
insert into tb_employee(name,age,workingdate,salary)
values('张三',21,'2012-12-21',5500),
('李四',22,'2013-11-17',4500),
('王二',20,'2011-08-15',6500),
('麻子',21,'2015-05-18',3500)

select * from tb_employee
--增
alter table tb_employee add sex  char(2) check(sex='男' or sex='女') default '男'
insert into tb_employee select '小王',20,'2016-10-24',4200,'男'
select * from tb_employee
--删
delete from tb_employee where name = '李四'
select * from tb_employee
--改
update tb_employee set salary = 5000 where name = '麻子'
select * from tb_employee
update tb_employee set sex = '男' where name = '张三'
update tb_employee set sex = '男' where name = '麻子'
update tb_employee set sex = '女' where name = '王二'
select * from tb_employee
--查
select name from tb_employee 
select id,name,sex from tb_employee 
                                                                                                                          