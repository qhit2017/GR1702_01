
create table tb_studeny(
Sno char(11)primary key,
Sname char(20)not null,
Ssex char(2)check(Ssex='��'or Ssex='Ů')default'��' not null,
Sage smallint not null,
Sdept char(20))

insert into tb_studeny(Sno,Sname,Ssex,Sage,Sdept)
values(200215121,'����','��',20,'CS'),
      (200215122,'����','Ů',19,'CS'),
      (200215123,'����','Ů',18,'MA'),
      (200215124,'����','��',19,'IS'),
      (201715125,'��ӭ��','��',19,'IT')
      
select* from tb_studeny
 
 
 