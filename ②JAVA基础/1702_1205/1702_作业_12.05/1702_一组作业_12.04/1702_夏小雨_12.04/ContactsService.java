package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


public class ContactsService implements IContactsBook {

	private Object name;

	public void infohelp(){
		System.out.println("ͨѶ¼ϵͳ");
		System.out.println("1	¼��ͨѶ¼��Ϣ");
		System.out.println("2	��ʾ����ͨѶ¼��Ϣ");
		System.out.println("3	��������");
		System.out.println("4	�Ա�����");
		System.out.println("5	�绰����");
		System.out.println("6	�˳�����");

	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");

		if (a.length != 3) {
			System.out.println("������ĸ�ʽ�����밴������,��,15934561254��");
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
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
			
		}
		if (!isfind) {
			System.out.println("������Ķ��󲻴���");
		}
	}

	public void findBySex(ArrayList<Contacts> arrayList, String sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
		}
		if (!isfind) {
			System.out.println("������Ķ��󲻴���");
			}
	}

	public void findByNum(ArrayList<Contacts> arrayList, String num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelnum();
			if (num.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
		}
		if (!isfind) {
			System.out.println("������Ķ��󲻴���");
		}
	}
}
