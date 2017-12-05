package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService implements IContacts {
	
	void helpInfo(){
		System.out.println("通讯录管理系统");
		System.out.println("1.添加通讯录成员");
		System.out.println("2.查看所有通讯录成员信息");
		System.out.println("3.按名字查找对象信息");
		System.out.println("4.按性别查找对象信息");
		System.out.println("5.按电话号码查找对象信息");
		System.out.println("6.退出");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		
		String[] a = s.split(",");
		
		if (a.length != 3) {
			System.out.println("输入格式有误，请按“小明,男,110”的格式输入:");
		}else{
			Contacts contacts = new Contacts();
			
			contacts.setName(a[0]);
			contacts.setSex(a[1]);
			contacts.setTelNum(a[2]);
			
			arrayList.add(contacts);
			
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByNameSexTelNum(ArrayList<Contacts> arrayList,
			String category,Scanner sc) {
		
		String string = sc.next();
		if (category.equals("姓名")) {
			boolean x=false;
			for (int i = 0; i < arrayList.size(); i++) {
				Contacts a = arrayList.get(i);
				String name = a.getName();
				if (name.equals(string)) {
					x=true;
					System.out.println(a.toString());
					
				} 
			}
			if(!x){
				System.out.println("你输入的对象不存在！");
			}
		}
		if (category.equals("性别")) {
			boolean v=false;
			for (int i = 0; i < arrayList.size(); i++) {
				Contacts a = arrayList.get(i);
				String Sex = a.getSex();
				if (Sex.equals(string)) {
					v=true;
					System.out.println(a.toString());
				} 
					

				}
				
				
			if (!v) {
				System.out.println("你要查找的对象不存在！");
			}
			
			}
		
		if (category.equals("电话号码")) {
			boolean o = false;
			for (int i = 0; i < arrayList.size(); i++) {
				
				Contacts a = arrayList.get(i);
				String telNum = a.getTelNum();
				if (telNum.equals(string)) {
					o=true;
					System.out.println(a.toString());
				}
					

				}
			if (!o) {
				System.out.println("你要查找的对象不存在！");
			}
			}
		}

	}


