CREATE database db_liyongli
USE db_liyongli 
CREATE table tb_student(
sno char(10) primary key ,
sname nvarchar(32) not null,
ssex char(6) check (ssex='boy' or ssex='gril') default 'boy',
sage smallint,
sdept char(10),
grade smallint)
sp_help tb_student
SELECT *from  tb_student
INSERT into tb_student values
(2,'b','gril',20,'is',89),
(3,'c','boy',23,'cs',41),
(4,'d','gril',17,'ma',21),
(5,'e','boy',14,'kungfu',52),
(6,'f','boy',10,'cs',63),
(7,'g','boy',15,'ma',52),
(8,'h','gril',21,'ma',44),
(9,'j','boy',23,'ma',89),
(10,'k','boy',25,'ma',90),
(11,'o','gril',40,'ma',45),
(12,'i','boy',31,'ma',62),
(13,'u','boy',22,'cs',50),
(14,'���ǿ','boy',27,'ma',41),
(15,'��˧','boy',25,'ma',36),
(16,'����','gril',36,'ma',14),
(09102040203,'z','gril',36,'ma',14),
(17,'��÷÷','gril',12,'ma',44),
(20,'������ ','boy',16,'mm',78),
(34,'������','gril',14,'cs',87),
(31,'����','gril',23,'ma',52)


INSERT into tb_student values
(124,'����','gril',10,'is',0)

--��SQL���������е����ѯ��
---1.��ѯȫ��ѧ����ѧ����������
SELECT sno, sname from tb_student

---2.��ѯȫ��ѧ����������ѧ�ţ�רҵ
SELECT sname as ����,sno as ѧ��,sdept as רҵ from tb_student

---3.��ȫ��ѧ�����������������ݡ�
select sname,year(getdate())- sage as ������� from tb_student

--4.��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT sname as ���� from tb_student where sdept ='cs'

--5.��ѯ����������20�����µ�ѧ�������������䡣
SELECT sname as ����,sage as ���� from  tb_student where sage <20

---6.��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(sage) as ����,AVG(grade) as ƽ���ɼ� from tb_student where sage <18 

--7.��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT sno as ѧ�� from tb_student where grade<60

--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT  sname as  ����, sdept as רҵ, sage as ���� FROM tb_student where sage NOT BETWEEN 20 AND 23

--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT  sname as ����, ssex as �Ա� FROM tb_student where sdept IN ('is','ma', 'cs')

---11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT  sname as ����, ssex as �Ա� FROM tb_student where sdept not IN ('is','ma', 'cs')

---12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT *FROM tb_student where sno =09102040203

---13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT sname as ����,sno as ѧ��, ssex as �Ա� FROM tb_student where sname LIKE '��%'

--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname as ���� FROM tb_student  where sname  LIKE '��__' 
  
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT sname as ����, sno as ѧ�� FROM tb_student where sname like '_��%'

--16.��ѯ���в��ա��¡���ѧ��������
SELECT sname from tb_student where sname  not like '��%'

--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT sname as ����, sno as ѧ�� FROM tb_student where grade=0

--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT  AVG(grade) as csϵƽ���ɼ� FROM tb_student  where sdept='cs'
SELECT  AVG(grade) as isϵƽ���ɼ� FROM tb_student  where sdept='ma'
SELECT  AVG(grade) as maϵƽ���ɼ� FROM tb_student  where sdept='is'

---19.�������гɼ���ѧ����ѧ�ź�������
SELECT sname as ����, sno as ѧ�� FROM tb_student where  not grade=0

--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�


--21.��ѯѧ����������
SELECT COUNT(sno) as ѧ�������� FROM tb_student 

--22.��ѯ������Ů����������

--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ���������.

--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���

--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���

--26.��ѯƽ���ɼ�����רҵ�����֡�
--27.��ѯ������Ů����ƽ���ɼ���
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
select AVG(grade) as ƽ���ɼ� FROM tb_student 
select sname as ����, grade as �ɼ� FROM tb_student where  grade>54
--29.��ѯרҵѧ����������50�˵�רҵ����
SELECT sdept as רҵ��  FROM tb_student where 
--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
select AVG(grade) as ƽ���ɼ�, sdept

