--create database db_worker
use db_worker
create table tb_worker(
id tinyint primary key,
name nvarchar (32) not null,
salary money default 3000,
dateline date,
department nvarchar (16),
remarks ntext,
recommend bit,
age tinyint default 25)