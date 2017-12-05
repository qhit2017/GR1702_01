package com.qhit;

//第三步实现类
import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements Icontactsbook {
	void helpInfo() {
		System.out.println("通讯录管理系统");
		System.out.println("1 录入通讯录信息");
		System.out.println("2 显示所有信息");
		System.out.println("3 按姓名查找");
		System.out.println("4 按性别查找 ");
		System.out.println("5 按电话号码查找");
		System.out.println("6 退出");
	}

	@Override
	public void addcontacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的格式不对，请重新输入");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);

			arrayList.add(contacts);

			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infocontacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByname(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getname();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在");
		}
	}

	public void findBysex(ArrayList<Contacts> arrayList, String sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在");
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
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在");
		}
	}
}
