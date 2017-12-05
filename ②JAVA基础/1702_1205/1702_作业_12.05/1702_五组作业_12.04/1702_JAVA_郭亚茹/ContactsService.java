package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContactsBook {
	void help(){
		System.out.println("---通讯录管理系统---");
		System.out.println("1 录入通信信息请输入add");
		System.out.println("2 显示通信录信息请输入info");
		System.out.println("3 姓名搜索请输入name");
		System.out.println("4 性别搜索请输入sex");
		System.out.println("5 电话搜索请输入tell");
		System.out.println("6 退出系统请输入exit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arraylist, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的格式错误,请重新输入！");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arraylist.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			System.out.println(contacts.toString());
		}
	}

	/*增强for循环
	 * for (Contacts contacts : arraylist) {
	 * System.out.println(contacts.toString());
	 * 
	 * }
	 * 迭代器
	 * Iterator<Contacts> iterator = arraylist.iterator(); while
	 * (iterator.hasNext()) { Contacts contacts = (Contacts) iterator.next();
	 * System.out.println(contacts.toString());
	 */

	@Override
	public void findByname(ArrayList<Contacts> arraylist,String name) {
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isFind=true;
			}
		}if (!isFind) {
			System.out.println("你查找的对象不在！");
		}	
	}
				
	public void findBysex(ArrayList<Contacts> arraylist,String sex){
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			
			Contacts contacts = arraylist.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind=true;	
			}
		}if (!isFind) {
			System.out.println("你查找的对象不在！");
		}	
	}
	public void findBytell(ArrayList<Contacts> arraylist,String tell) {
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			String string = contacts.getTell();
			if (tell.equals(string)) {
				System.out.println(contacts.toString());	
				isFind=true;
		}
	}if (!isFind) {
		System.out.println("你查找的对象不在！");
				System.out.println("你查找的对象不在！");
		}	
    }
}

