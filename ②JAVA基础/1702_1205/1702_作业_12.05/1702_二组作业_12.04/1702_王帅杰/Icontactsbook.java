package com.qhit;
//�ڶ����ӿ�
import java.util.ArrayList;
import java.util.Scanner;

public interface Icontactsbook {
	//¼��ͨѶ¼��Ϣ
	//����ֵ���������������б�
	//����������ض����ܵĴ����
	void addcontacts(ArrayList<Contacts> arrayList, Scanner sc);
	//��ѯ����
	//����ֵ���������������б�
	//����������ض����ܵĴ����
	void infocontacts(ArrayList<Contacts> arrayList);
	//����������ѯ���Ա��ѯ�绰���룬
	//����ֵ���������������б�
	
	void findByname(ArrayList<Contacts> arrayList, String name);
	void findBysex(ArrayList<Contacts> arrayList, String sex);
	void findByNum(ArrayList<Contacts> arrayList, String Num);
}
