package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	// ¼��ͨѶ¼��Ϣ��
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// ��ѯ���У�
	void infoContacts(ArrayList<Contacts> arrayList);

	// �����������Ա𡢵绰�����ѯ��
	 void findByName(ArrayList<Contacts> arrayList, String name);
	 void findBySex(ArrayList<Contacts> arrayList, String Sex);
	 void findByNum(ArrayList<Contacts> arrayList, String Num);
	 
	 //�˵���
	 void helpInfo();
}
