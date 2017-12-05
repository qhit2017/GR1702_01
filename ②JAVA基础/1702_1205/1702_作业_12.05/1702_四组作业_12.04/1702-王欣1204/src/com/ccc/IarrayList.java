package com.ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class IarrayList implements IContacts {
	void helpinfo() {
		System.out.println("--------目录--------");
		System.out.println("（1）");
		System.out.println("（2）");
		System.out.println("（3）");
		System.out.println("（4）");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的不对，请按jack，man，1234567890这种格式输入");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findBynameNumber(ArrayList<Contacts> arrayList, Scanner sc,
			String category) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (name.equals(category)) {
				System.out.println(contacts.toString());

			} else {
				System.out.println("你要找的对象不存在");

			}
		}

	}

	public void findBysex(ArrayList<Contacts> arrayList, String Sex) {

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getSex();
			if (Sex.equals(name)) {
				System.out.println(contacts.toString());

			} else {
				System.out.println("你要找的对象不存在");

			}
		}
	}

	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (Num.equals(name)) {
				System.out.println(contacts.toString());

			} else {
				System.out.println("你要找的对象不存在");

			}
		}
	}

	public void findByname(ArrayList<Contacts> arrayList, String name) {
		// TODO Auto-generated method stub

	}

}