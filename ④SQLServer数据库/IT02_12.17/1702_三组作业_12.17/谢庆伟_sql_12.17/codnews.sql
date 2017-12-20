use db_practice
go
create table tb_codnews(
id smallint primary key not null,
name nchar(32) not null,
salary money not null,
dateline date not null,
department nchar(16),
recommend bit not null,
remarks ntext)
--go
--insert into tb_codnew(001,'tom',3000,'1964-12-05','”È¿÷≤ø','false','“ª÷ª”´∆¡√®')
go
select * from tb_codnews
go