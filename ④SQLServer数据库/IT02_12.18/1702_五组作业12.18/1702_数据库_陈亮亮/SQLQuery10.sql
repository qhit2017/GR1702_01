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
            (8,'Ӣ��',6,3),
            (9,'Java',6,3),
            (10,'���ݴ���',5,2)
            
      