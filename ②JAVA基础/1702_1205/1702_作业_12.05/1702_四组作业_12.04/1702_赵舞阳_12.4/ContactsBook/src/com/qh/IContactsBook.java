package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	// ¼��ͨѶ¼��Ϣ
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// ��ѯ����
	void infoContacts(ArrayList<Contacts> arrayList);

	// �����������Ա𡢵绰��ѯ
	void findByName(ArrayList<Contacts> arrayList, String Name);

	void findBySex(ArrayList<Contacts> arrayList, String Sex);

	void findByNum(ArrayList<Contacts> arrayList, String Num);
}
