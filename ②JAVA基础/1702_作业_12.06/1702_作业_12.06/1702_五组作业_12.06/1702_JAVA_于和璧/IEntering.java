package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IEntering {
	
	//����
	void help();
	void help3();
	
	//¼����Ϣ
	void addInformation(ArrayList<Examinee>arrayList,Scanner sc);
	
	//��ѯ���п�����Ϣ
	void infoEntering(ArrayList<Examinee>arrayList);
	
	//��ѯ�ɼ���߷�
	void findGradeMax(ArrayList<Examinee>arrayList,String Grade);
	
	

}
