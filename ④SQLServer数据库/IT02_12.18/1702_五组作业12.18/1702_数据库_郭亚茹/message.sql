use db_guoyaru
create table tb_student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check(Ssex='男'or Ssex='女'),
Sage smallint,
Sdept char(20))
sp_help tb_student

select Sno,Sname,Ssex,Sage,Sdept from tb_student

insert into tb_student(Sno,Sname,Ssex,Sage,Sdept)
values (200215120,'李勇','男',20,'CS'),
	   (200215121,'刘晨','女',19,'CS'),
       (200215122,'王敏','女',18,'MA'),
       (200215123,'张立','男',19,'IS'),
       (200215124,'墨涵','女',20,'RD'),
       (200215125,'涵远','男',20,'CS'),
       (200215126,'lucy','女',21,'MA'),
       (200215127,'Jack','男',24,'RD'),
       (200215128,'Llmei','女',24,'CS'),
       (200215129,'Mary','女',20,'RD'),
       (200215130,'Tom','男',25,'CS'),
	   (200215131,'Mary','女',20,'RD'),
	   (200215132,'aa','女',20,'RD'),
	   (200215133,'bb','男',24,'RD'),
	   (200215134,'cc','女',20,'RD'),
       (200215135,'dd','女',20,'RD'),
       (200215136,'rr','男',20,'RD'),
       (200215137,'qq','女',27,'CS'),
       (200215138,'vv','女',22,'NA'),
       (200215139,'oo','男',22,'RD'),      
       (200215140,'pp','女',23,'RD'),
       (200215141,'zz','女',20,'RD'),      
       (200215142,'gg','男',20,'FAM'),
       (200215143,'mm','女',28,'RD'),      
       (200215144,'hh','男',20,'RD'),
       (200215145,'jj','女',29,'MA')
       
       
       create table tb_course(
       Cno char(4) primary key,
       CName char(20),
       Cpno char (4),
       Ccredit smallint 
       )
      sp_help tb_course
      select Cno,CName ,Cpno,Ccredit from tb_course
      insert into tb_course
      values(1,'数据库',5,4),
            (2,'数学',0,2),
            (3,'信息系统',1,4),
            (4,'操作系统',6,3),
            (5,'数据结构',7,4),
            (6,'数据处理',0,2),
            (7,'PASCAL语言',6,4),
            (8,'操作系统',6,3),
            (9,'操作系统',6,3),
            (10,'数据处理',5,2)
            
      
    create table tb_SC(
    Sno char (11)primary key ,
    Cno char (4),
    Grade smallint)
    sp_help tb_SC
    select  Sno,Cno,Grade from tb_SC 
    insert into tb_SC
    values(200215121,1,92) ,
          (200215121,1,85) ,
          (200215121,1,88) ,
          (200215122,1,90) ,
          (200215122,1,80) 
          
          alter table tb_SC drop constraint PK__tb_SC__CA1FE464164452B1