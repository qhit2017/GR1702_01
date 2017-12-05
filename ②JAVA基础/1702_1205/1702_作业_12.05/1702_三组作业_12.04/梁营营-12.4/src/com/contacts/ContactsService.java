package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	@Override
	public void helpInfo() {
		System.out.println("-----------通信录管理系统------------");
		System.out.println("【1】录入通讯录信息请输入Add");
		System.out.println("【2】显示所有通讯录信息请输入Info");
		System.out.println("【3】姓名搜索请输入Name");
		System.out.println("【4】性别搜索请输入Sex");
		System.out.println("【5】电话号码搜索请输入Num");
		System.out.println("【6】退出系统请输入Exit");
		
	}
	

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		
		
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("您输入的信息超出范围，请重新输入：");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());

				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("您要查找的对象不存在！");
		}

	}

	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSex();
			if (Sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			if (!isFind) {
				System.out.println("您要查找的对象不存在！");
			}
		}
	}

	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelNum();
			if (Num.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			} 
			if (!isFind) {
				System.out.println("您要查找的对象不存在！");
			}
		}
	}

	
}
