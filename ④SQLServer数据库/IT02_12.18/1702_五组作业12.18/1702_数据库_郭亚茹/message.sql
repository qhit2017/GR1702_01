use db_guoyaru
create table tb_student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check(Ssex='��'or Ssex='Ů'),
Sage smallint,
Sdept char(20))
sp_help tb_student

select Sno,Sname,Ssex,Sage,Sdept from tb_student

insert into tb_student(Sno,Sname,Ssex,Sage,Sdept)
values (200215120,'����','��',20,'CS'),
	   (200215121,'����','Ů',19,'CS'),
       (200215122,'����','Ů',18,'MA'),
       (200215123,'����','��',19,'IS'),
       (200215124,'ī��','Ů',20,'RD'),
       (200215125,'��Զ','��',20,'CS'),
       (200215126,'lucy','Ů',21,'MA'),
       (200215127,'Jack','��',24,'RD'),
       (200215128,'Llmei','Ů',24,'CS'),
       (200215129,'Mary','Ů',20,'RD'),
       (200215130,'Tom','��',25,'CS'),
	   (200215131,'Mary','Ů',20,'RD'),
	   (200215132,'aa','Ů',20,'RD'),
	   (200215133,'bb','��',24,'RD'),
	   (200215134,'cc','Ů',20,'RD'),
       (200215135,'dd','Ů',20,'RD'),
       (200215136,'rr','��',20,'RD'),
       (200215137,'qq','Ů',27,'CS'),
       (200215138,'vv','Ů',22,'NA'),
       (200215139,'oo','��',22,'RD'),      
       (200215140,'pp','Ů',23,'RD'),
       (200215141,'zz','Ů',20,'RD'),      
       (200215142,'gg','��',20,'FAM'),
       (200215143,'mm','Ů',28,'RD'),      
       (200215144,'hh','��',20,'RD'),
       (200215145,'jj','Ů',29,'MA')
       
       
       create table tb_course(
       Cno char(4) primary key,
       CName char(20),
       Cpno char (4),
       Ccredit smallint 
       )
      sp_help tb_course
      select Cno,CName ,Cpno,Ccredit from tb_course
      insert into tb_course
      values(1,'���ݿ�',5,4),
            (2,'��ѧ',0,2),
            (3,'��Ϣϵͳ',1,4),
            (4,'����ϵͳ',6,3),
            (5,'���ݽṹ',7,4),
            (6,'���ݴ���',0,2),
            (7,'PASCAL����',6,4),
            (8,'����ϵͳ',6,3),
            (9,'����ϵͳ',6,3),
            (10,'���ݴ���',5,2)
            
      
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