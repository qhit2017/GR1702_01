package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	//���
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//��ʾ
	void infoContacts(ArrayList<Contacts> arrayList);
	//����
	void findByName(ArrayList<Contacts> arrayList,String category);
	void findBySex(ArrayList<Contacts> arrayList,String category);
	void findBylsum(ArrayList<Contacts> arrayList,String category);
}
