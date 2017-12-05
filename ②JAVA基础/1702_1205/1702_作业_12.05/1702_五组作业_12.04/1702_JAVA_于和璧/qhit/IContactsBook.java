package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	
	//添加
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	//遍历
	void info(ArrayList<Contacts> arrayList);
	
	//按要求查找
	void findBynamesexnumber(ArrayList<Contacts> arrayList,String category,Scanner sc);
	/*public void findByname(ArrayList<Contacts> arrayList,String name);
	public void findBysex(ArrayList<Contacts> arrayList,String sex);
	public void findBynumber(ArrayList<Contacts> arrayList,String num);
*/
}
