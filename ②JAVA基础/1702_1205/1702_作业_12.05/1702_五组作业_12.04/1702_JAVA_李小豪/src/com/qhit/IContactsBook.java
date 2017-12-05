package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	
	//录入通讯录信息
	//返回值方法名(参数列表)
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	//查询所有
	void infoContacts(ArrayList<Contacts>arrayList);
	//根据姓名查询,性别查询,电话号码
 public	void findByName(ArrayList<Contacts>arrayList,Scanner sc,String Name);
 public	void findBySex(ArrayList<Contacts>arrayList,Scanner sc,String Sex);
 public	void findByNum(ArrayList<Contacts>arrayList,Scanner sc,String Num);
void findByName(ArrayList<Contacts> arrayList, String name);
}
