package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	void help(){
		System.out.println("通讯信息帮助");
		System.out.println("1 录入信息");
		System.out.println("2 显示所有信息");
		System.out.println("3 姓名查找");
		System.out.println("4 性别查找");
		System.out.println("5 电话查找");
		System.out.println("6 退出系统");
	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// 接收
		String s = sc.next();
		// 拆分
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的信息格式有误,请按name,sex,1548962输入");
		} else {
			// 构造实体
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// 添加到
			arrayList.add(contacts);
			// 输出
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}*/
	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getName();
			if (name.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			} 
		}
		if(!isinfo){
			System.out.println("你查找的对象不存在");
		}
	}

	public void findBySex(ArrayList<Contacts> arrayList, String sex) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getSex();
			if (sex.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			}
		}
		if(!isinfo){
			System.out.println("你查找的对象不存在");
		}
	}

	public void findBylsum(ArrayList<Contacts> arrayList, String num) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getTelnum();
			if (num.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			} 
		}
		if(!isinfo){
			System.out.println("你查找的对象不存在");
		}
	}
}
