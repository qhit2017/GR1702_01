
create table tb_studeny(
Sno char(11)primary key,
Sname char(20)not null,
Ssex char(2)check(Ssex='男'or Ssex='女')default'男' not null,
Sage smallint not null,
Sdept char(20))

insert into tb_studeny(Sno,Sname,Ssex,Sage,Sdept)
values(200215121,'李勇','男',20,'CS'),
      (200215122,'刘晨','女',19,'CS'),
      (200215123,'王敏','女',18,'MA'),
      (200215124,'张立','男',19,'IS'),
      (201715125,'王迎阔','男',19,'IT')
      
select* from tb_studeny
 
 
 