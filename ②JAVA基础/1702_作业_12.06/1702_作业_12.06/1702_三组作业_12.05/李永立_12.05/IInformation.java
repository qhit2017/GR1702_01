package com.lyl.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IInformation {
	
	/*ģ��һ���߿�����ϵͳ����ҵ��Χ������
	1	¼�뿼���ĸ߿���Ϣ
	2	��ʾ���п�����Ϣ
	3	��ѯ��߷�, ����: �ܷ���߷� �� ������߷�
	4	�˳�����*/
	
	
	void helpinfo();
	
    void addInformation(ArrayList<Student>  arrayList   ,Scanner sc);
    
    void infoInformation(ArrayList<Student>  arrayList  );
    
    void findInformation(ArrayList<Student>  arrayList  );
    
    double getMax(ArrayList<Student>  arrayList, String subject);
}
