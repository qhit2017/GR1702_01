 --create database db_create
 use db_create
 create table tb_student(
sno char(11) primary key ,         
sname char(20)not null,
Ssex char(2)check(Ssex ='man' or Ssex ='woman'),
Sage smallint 
)
 sp_help tb_student
 select Sno,SName,Ssex,Sage from tb_student
 insert into tb_student(Sno,Sname,Ssex,Sage )
 Values(200215121,'����','��',20,'cs'),
 (200212125,'����','Ů',18,'cs'),
 (200210131,'����','��',17,'cs'),
 (200215130,'����','��',28,'cs'),
 (200215112,'����','��',30,'cs'),
 (200215112,'����','��',42,'cs'),
 (200215130,'����','��',35,'cs'),
 (200215129,'С��','Ů',31,'cs'),
 (200215118,'С��','��',20,'cs'),
 (200215118,'���','Ů',21,'cs'),
 (200215125,'��ҧ��','��',23,'cs'),
 (200215115,'��ѩ','Ů',25,'cs'),
 (200215122,'����','Ů',26,'cs'),
 (200215129,'������','��',56,'cs'),
 (200215123,'������','��',48,'cs'),
 (200215124,'����','Ů',35,'cs'),
 (200215128,'������','��',48,'cs'),
 (200215115,'����','Ů',19,'cs'),
 (200215116,'�׸�','Ů',19,'cs'),
 (200215117,'����','��',16,'cs'),
 (200215118,'С����','��',19,'cs'),
 (200215125,'�','Ů',58,'cs'),
 (200215127,'����','��',54,'cs'),
 (200215126,'槼�','Ů',41,'cs'),
 (200215125,'�깫��','��',28,'cs'),
 (200215131,'����','��',25,'cs'),
 