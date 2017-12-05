package com.Contacts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContacts {
	void p(){
		System.out.println("---通讯录---");
		System.out.println("1 增加手机通讯录");
		System.out.println("2 查询全部人数");
		System.out.println("3 姓名查找");
		System.out.println("4 姓别查找");
		System.out.println("5 号码查找");
		System.out.println("6 退出");
	}

	public void addcontacts(ArrayList<Contacts> arryArrayList, Scanner sc) {
		String a = sc.next();
		String s = sc.next();
		if (s.length() != 3) {
			System.out.println("你输入的格式不正确");
		} else {
			Contacts c = new Contacts();
			arryArrayList.add(c);
			System.out.println(c.toString());
		}

	}

	public void infocontacts(ArrayList<Contacts> arryArrayList, Scanner sc) {
		//普通for循环
		for (Contacts contacts : arryArrayList) {
			System.out.println(contacts.toString());
		}
		//增强for循环
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			System.out.println(contacts.toString());

		}
		//迭代器 ，游标卡尺，只能用于有容器的地方：
		Iterator<Contacts> iterator = arryArrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
	}

	public void findBynum(ArrayList<Contacts> arryArrayList,String num) {
		boolean q = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(num)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("你要查找的对象不存在");
				q = true;
			}
		}
		if (!q) {
			System.out.println("你要查找的对象不存在");
		}
		}
	public void findBysex(ArrayList<Contacts> arryArrayList,String sex) {
		boolean d = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(sex)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("你要查找的对象不存在");
				d = true;
			}
		}
		if (!d) {
			System.out.println("你要查找的对象不存在");
		}
			
		}
	public void findByName(ArrayList<Contacts> arryArrayList,String name) {
		boolean u = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(name)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("你要查找的对象不存在");
				u = true;
			}
		}
		System.out.println("你要查找的对象不存在");
			
		}

	@Override
	public void findBySex(ArrayList<Contacts> arryArrayList, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByNum(ArrayList<Contacts> arryArrayList, String num) {
		// TODO Auto-generated method stub
		
	}
			}
			


	


