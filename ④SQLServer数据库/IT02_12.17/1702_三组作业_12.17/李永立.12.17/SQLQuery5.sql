create table tb_employee02(
id int primary key ,
name nvarchar(32) not null,
salay money default 3000,
dateline date not null,
recommend bit,
department nvarchar(16) not null)