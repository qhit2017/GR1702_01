package com.lyl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:李永立271406@163.com
 * @date 创建时间：2017年12月4日 下午3:16:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class ContactsService implements Icontacts {
	
	
	
	
	 void helpinfo(){
		 
		 System.out.println("--通讯录管理系统--");
		 System.out.println("1  添加通讯录");
		 System.out.println("2  查找显示所有通讯录");
		 System.out.println("3  通过姓名查找联系人");
		 System.out.println("4  通过性别查找联系人");
		 System.out.println("5  通过电话号码查找联系人");
		 System.out.println("6  退出");
	 }

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的有误，请按以下格式输入：姓名, 性别, 电话号码");

		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 普通循环
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());

			// 增强循环
			/*for (Contacts contactss : arrayList) {
				System.out.println(arrayList.toString());
			}
*/
		}

	}

	public void findname(ArrayList<Contacts> arrayList, String name) {
		boolean isQuit = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getName();
			if (name .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit = true;
			} 
			
		}
		if (!isQuit) {
			System.out.println("你要找的信息不存在");
		}
		
		
	}

	public void findsex(ArrayList<Contacts> arrayList, String sex) {
		boolean isQuit = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getSet();
			if (sex .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit =true;
			} 
			
		}
		if (!isQuit) {
			System.out.println("你要找的信息不存在");
		}
		
	
	}

	public void findnum(ArrayList<Contacts> arrayList, String num) {
		boolean isQuit =false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getNum();
		
			if (num .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit = true;
			} 

			
		}
		if (!isQuit) {
			System.out.println("你要找的信息不存在");
		}
		
		
	}

	
}
