package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	
	//���
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	//����
	void info(ArrayList<Contacts> arrayList);
	
	//��Ҫ�����
	void findBynamesexnumber(ArrayList<Contacts> arrayList,String category,Scanner sc);
	/*public void findByname(ArrayList<Contacts> arrayList,String name);
	public void findBysex(ArrayList<Contacts> arrayList,String sex);
	public void findBynumber(ArrayList<Contacts> arrayList,String num);
*/
}
