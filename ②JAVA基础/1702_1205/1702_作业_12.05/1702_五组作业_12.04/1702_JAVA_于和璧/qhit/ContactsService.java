package com.qhit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	void help(){
		System.out.println("----------通讯录管理----------");
		System.out.println("【1】添加通訊錄信息请输入add");
		System.out.println("【2】查看已輸入的所有通讯录信息请输入info");
		System.out.println("【3】按姓名查找对应的通讯录信息请输入findname");
		System.out.println("【4】按性别查找对应的通讯录信息请输入findsex");
		System.out.println("【5】按电话号码查找对应的通讯录信息请输入findnumber");
		System.out.println("【6】退出系统请输入Quit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		
		String s = sc.next();
		//拆分
		String[] arrs = s.split(",");
		
		
		if (arrs.length!=3) {
			System.out.println("您输入的格式不正确，请重新输入，格式为“姓名,性别,电话”");
		} else {
			Contacts c = new Contacts(arrs[0], arrs[1], arrs[2]);
			
			arrayList.add(c);
			
			System.out.println(arrayList.toString());
			

		}
		

	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		//普通循环
		/*for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			System.out.println(contacts.toString());
			
		}*/
		
		//增强for循环
		for (Contacts contacts : arrayList) {
			
			System.out.println(contacts.toString());
		}
		
		//迭代器
		/*Iterator<Contacts>iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			
			Contacts contacts = (Contacts) iterator.next();
			
			System.out.println(contacts.toString());
		}*/
		}

	

	@Override
	public void findBynamesexnumber(ArrayList<Contacts> arrayList,String category,Scanner sc) {
			String next = sc.next();
			if (category.equals("姓名")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String name = arrayList.get(i).getName();
					if (name.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("您要查找对象不存在！");
				}
			
	}
			if (category.equals("性别")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String sex = arrayList.get(i).getSex();
					if (sex.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("您要查找对象不存在！");
				}
			
	}
			if (category.equals("电话号码")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String number = arrayList.get(i).getnumber();
					if (number.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("您要查找对象不存在！");
				}
			
	}

	/*public void findByname(ArrayList<Contacts> arrayList,String name){
		
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getName();
			
			if (name.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
				
			} 
			
			if (!isfind) {
				
				System.out.println("您查找的对象不存在!");
			}
			
		}
	}
	public void findBysex(ArrayList<Contacts> arrayList,String sex){
		
		boolean isfind = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getSex();
			
			if (sex.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
			} 
			if (!isfind) {
				
				System.out.println("您查找的对象不存在!");
			}
			
		}
	}
	public void findBynumber(ArrayList<Contacts> arrayList,String num){
		
		boolean isfind = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getnumber();
			
			if (num.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
				
			} 
			if (!isfind) {
				
				System.out.println("您查找的对象不存在!");
			}
			
		}*/
	}
}
