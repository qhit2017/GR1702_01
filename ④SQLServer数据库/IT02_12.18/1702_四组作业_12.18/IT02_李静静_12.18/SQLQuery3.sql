create table tb_sc(
sno char(11) primary key,
cno char(4),
grade smallint
)
insert into tb_sc(sno,cno,grade)
values('200215121','1',92),
('200215122','1',92),
('200215123','2',85),
('200215124','3',88),
('200215125','2',90),
('200215126','3',80),
('200215127','6',92),
('200215128','7',92),
('200215129','8',92),
('200215130','9',92),
('200215131','10',92)
select * from tb_sc
