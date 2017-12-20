create table tb_worker1(
id tinyint primary key not null,
name nvarchar not null,
salary money not null default 5000,
deteline date not null,
recommend bit not null,
department nvarchar not null,
remark ntext not null)