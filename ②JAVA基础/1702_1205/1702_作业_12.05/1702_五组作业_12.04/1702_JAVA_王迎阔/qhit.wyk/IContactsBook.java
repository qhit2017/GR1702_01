package com.Contacts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContactsBook {

	//录入通讯录信息
	//返回值  方法名(参数列表)
	// 方法 完成特定功能的代码块
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	
	
	void infoContacts(ArrayList<Contacts>arrayList);
	
	
	public void findByName(ArrayList<Contacts> arrayList, String name);
	
	
	public void findBySex(ArrayList<Contacts> arrayList, String name);
	
	
	public void findBytelNum(ArrayList<Contacts> arrayList, String name);
}
