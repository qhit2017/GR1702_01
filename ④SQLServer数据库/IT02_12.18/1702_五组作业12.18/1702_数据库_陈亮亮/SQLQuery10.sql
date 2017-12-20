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
            (8,'英语',6,3),
            (9,'Java',6,3),
            (10,'数据处理',5,2)
            
      