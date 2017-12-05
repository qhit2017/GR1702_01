package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	// 录入通讯录信息；
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// 查询所有；
	void infoContacts(ArrayList<Contacts> arrayList);

	// 根据姓名、性别、电话号码查询；
	 void findByName(ArrayList<Contacts> arrayList, String name);
	 void findBySex(ArrayList<Contacts> arrayList, String Sex);
	 void findByNum(ArrayList<Contacts> arrayList, String Num);
	 
	 //菜单；
	 void helpInfo();
}
