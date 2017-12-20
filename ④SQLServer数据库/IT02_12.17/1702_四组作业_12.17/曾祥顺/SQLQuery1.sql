
create table tb_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 3000,
dateline date not null,
department nvarchar(16) not null,
remarks ntext,
recommend bit)