CREATE table tb_Emp(
Eid int primary key  ,
Ename nvarchar(16) ,
Ebumen nvarchar(16) ,
Ezhiwei nvarchar(16) ,
Exinshui decimal(16,4),
Ejiangjin decimal(16,4),
Eshijian datetime,
ESex nvarchar(16) 
)
INSERT INTO tb_Emp 
VALUES 
      (001,'������',10,'����Ա',2500,3000,'2013-10-1','��'),
      (002,'������',10,'����Ա',500,3000,'2015-5-1','Ů'),
      (003,'������',20,'����Ա',4500,3000,'2007-9-1','Ů'),
      (004,'�Ľ�',10,'����',2500,5000,'2010-2-1','��'),
      (005,'ŷ��������',10,'����Ա',2500,1000,'2010-11-11','Ů'),
      (006,'�����',20,'����Ա',2000,3000,'2008-8-1','��'),
      (007,'�ں��',10,'����',2000,3000,'2005-1-11','��'),
      (008,'���',20,'����Ա',2500,2000,'2006-9-1','Ů'),
      (009,'�Ź���',10,'����',2500,50,'2012-12-1','��'),
      (010,'��Ӣ��',30,'����Ա',2000,NULL,'2014-4-1','��'),
      (011,'��С��',30,'����Ա',3500,3000,'2017-7-1','��'),
      (012,'�߽�',30,'����',3000,1000,'2015-5-15','��'),
      (013,'��ӨӨ',10,'����Ա',2600,700,'2017-7-1','Ů'),
      (014,'������',30,'����',2500,6000,'2012-12-12','Ů'),
      (015,'����ΰ',10,'����Ա',2000,5000,'2013-3-13','��'),
      (016,'�볿��',20,'����',800,1000,'2011-4-14','Ů'),
      (017,'������',10,'Ա��',2000,2000,'2012-8-5','��'),
      (018,'��ѩ��',30,'Ա��',2500,3000,'2014-8-11','Ů'),
      (019,'����˳',20,'Ա��',2000,2500,'2013-3-11','��'),
      (020,'������',10,'Ա��',2000,2000,'2011-1-2','Ů'),
      (021,'nijy',10,'Ա��',2000,2000,'2011-1-2','Ů')

--1  ѡ����30�е�����Ա���� 
SELECT Ename  from tb_Emp where Ebumen ='30' 
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š� 
SELECT Ename,Eid,Ebumen    from  tb_Emp   where Ezhiwei ='����Ա'
--3  �ҳ��������н���Ա���� 
SELECT Ename  from tb_Emp where Ejiangjin>Exinshui  
--4  �ҳ��������н��60%��Ա���� 
SELECT Ename  from tb_Emp where Ejiangjin>Exinshui+Exinshui*0.6
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ� 
SELECT *FROM tb_Emp where    Ebumen=10 AND Ezhiwei='����' or Ebumen=20 AND Ezhiwei='����Ա'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
--�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ� 
SELECT *FROM tb_Emp where  Ebumen=10 AND Ezhiwei='����' or Ebumen=20 AND Ezhiwei='����Ա'
or Ezhiwei NOT IN ('����','����Ա') AND Exinshui>=2000 
--7  �ҳ��н����Ա���Ĳ�ͬ������ 
SELECT DISTINCT(Ezhiwei)  from  tb_Emp 
--8  �ҳ�û�н���򽱽����100��Ա���� 
SELECT * FROM tb_Emp WHERE Ejiangjin=null or Ejiangjin<100  
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT Ebumen,AVG(Exinshui) from tb_Emp GROUP BY Ebumen ORDER BY AVG(Exinshui) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա���� 
SELECT Ename  from  tb_Emp WHERE Eshijian<2012 
--11  ��ѯ��˾Ա��нˮ������ 
SELECT sum(Exinshui) from tb_Emp 
--12  ��ʾ����Ϊ5���ַ���Ա���������� 
SELECT Ename  from tb_Emp WHERE LEN(Ename)=5 
--13  ��ʾ������'R'��Ա���������� 
SELECT Ename  FROM tb_Emp WHERE Ename not like'%R%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT Ebumen,COUNT(Eid)  from tb_Emp GROUP BY Ebumen ORDER BY COUNT(Eid)
--15  ��ѯÿ������ŮԱ����������
SELECT Ebumen,COUNT(Ename)  from tb_Emp WHERE ESex ='Ů' GROUP BY Ebumen  
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
SELECT Ename,Eshijian   from tb_Emp where  Eshijian LIKE  '[2007-2017]' 
--17  ��ʾԱ������ϸ���ϣ�����������
SELECT * from tb_Emp ORDER BY Ename 
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT Eshijian  from tb_Emp  ORDER BY Eshijian 
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
SELECT Ename,Ezhiwei,Exinshui   from tb_Emp  ORDER BY Ezhiwei desc,Exinshui 
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ�� 
SELECT * FROM tb_Emp where Exinshui>(SELECT AVG(Exinshui) FROM tb_Emp )  
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
SELECT Ename , Ejiangjin+Exinshui as'������'   from  tb_Emp 
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
SELECT Ebumen,Ezhiwei,avg(Ejiangjin) as 'ƽ������',AVG(Exinshui)as 'ƽ��нˮ' from  tb_Emp  GROUP BY Ebumen,Ezhiwei ORDER BY Ebumen   
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT DISTINCT(Ename)   from tb_Emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT  * from tb_Emp WHERE Ename IN (SELECT  Ename from tb_Emp  GROUP BY Ename HAVING COUNT(Ename) =1)
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT Ename FROM tb_Emp WHERE Ename LIKE'%A%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT  Ename,COUNT(Ename)  from tb_Emp  GROUP BY Ename HAVING COUNT(Ename)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT DISTINCT(Ebumen)  from tb_Emp where Ebumen not in( 
SELECT DISTINCT(Ebumen)  from tb_Emp where  not Exinshui>=900 AND Exinshui<=3000 ) 
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT Ezhiwei , MIN(Exinshui )  from  tb_Emp  GROUP BY Ezhiwei  ORDER BY MIN(Exinshui )