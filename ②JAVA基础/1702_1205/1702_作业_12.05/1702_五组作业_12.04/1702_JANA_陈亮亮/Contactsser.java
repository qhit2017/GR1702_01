package com.qk;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Scanner;

/**
 * �����ߣ������� ����ʱ�䣺2017��12��4������3:15:57 ���䣺2507147605@qq.com
 */

public class Contactsser implements IContacts {
	public void help() {
		System.out.println("-----ͨѶ¼������Ϣ-----");
		System.out.println("-----[1]¼��ͨѶ¼��Ϣ-----");
		System.out.println("-----[2]�鿴������Ϣ--------");
		System.out.println("-----[3]�����ֲ���ͨѶ¼��Ϣ---");
		System.out.println("-----[4]���Ա����ͨѶ¼��Ϣ---");
		System.out.println("-----[5]���������ͨѶ¼��Ϣ---");
		System.out.println("-----[6]�˳�ͨѶ¼��Ϣϵͳ---");
	}

	@Override
	public void add(ArrayList<Contacts> arrayList, Scanner sc) {
		String next = sc.next();
		String[] a = next.split(",");
		if (a.length != 3) {
			System.out.println("������ĸ�ʽ���� ");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void findName(ArrayList<Contacts> arrayList, String category) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (category.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("���󲻴���");
		}
	}

	@Override
	public void findsex(ArrayList<Contacts> arrayList, String sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getSex();
			if (sex.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("���󲻴���");
		}
	}

	@Override
	public void findNumber(ArrayList<Contacts> arrayList, String Num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getPhonenumber();
			if (Num.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("���󲻴���");
		}
	}

}
