package com.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0  
 * @function
 */
public interface IScore {

	void help();
	
	//1 ¼�뿼���ĸ߿���Ϣ
	void addExaminee(ArrayList<student>arrayList,Scanner sc);
	
	//2	��ʾ���п�����Ϣ
	void Information(ArrayList<student>arrayList);
	
	//3	��ѯ��߷�, ����: �ܷ���߷� �� ������߷�
	double getMax(ArrayList<student>arrayList,String subject);

	
}
