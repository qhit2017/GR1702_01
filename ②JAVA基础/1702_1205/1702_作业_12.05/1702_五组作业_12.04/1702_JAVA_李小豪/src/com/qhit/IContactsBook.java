package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	
	//¼��ͨѶ¼��Ϣ
	//����ֵ������(�����б�)
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	//��ѯ����
	void infoContacts(ArrayList<Contacts>arrayList);
	//����������ѯ,�Ա��ѯ,�绰����
 public	void findByName(ArrayList<Contacts>arrayList,Scanner sc,String Name);
 public	void findBySex(ArrayList<Contacts>arrayList,Scanner sc,String Sex);
 public	void findByNum(ArrayList<Contacts>arrayList,Scanner sc,String Num);
void findByName(ArrayList<Contacts> arrayList, String name);
}
