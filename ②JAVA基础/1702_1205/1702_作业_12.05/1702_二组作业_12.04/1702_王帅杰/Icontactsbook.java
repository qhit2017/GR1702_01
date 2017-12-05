package com.qhit;
//第二步接口
import java.util.ArrayList;
import java.util.Scanner;

public interface Icontactsbook {
	//录入通讯录信息
	//返回值，方法名（参数列表）
	//方法：完成特定功能的代码块
	void addcontacts(ArrayList<Contacts> arrayList, Scanner sc);
	//查询所有
	//返回值，方法名（参数列表）
	//方法：完成特定功能的代码块
	void infocontacts(ArrayList<Contacts> arrayList);
	//根据姓名查询，性别查询电话号码，
	//返回值，方法名（参数列表）
	
	void findByname(ArrayList<Contacts> arrayList, String name);
	void findBysex(ArrayList<Contacts> arrayList, String sex);
	void findByNum(ArrayList<Contacts> arrayList, String Num);
}
