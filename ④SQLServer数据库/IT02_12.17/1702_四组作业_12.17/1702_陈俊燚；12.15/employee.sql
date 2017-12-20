use db_employe
create table tb_employee(
id tinyint primary key,
name nvarchar(22) not null,
salary money default 3000,
datalint date,
recommend bit,
department nvarchar(15),
remarks ntext)
