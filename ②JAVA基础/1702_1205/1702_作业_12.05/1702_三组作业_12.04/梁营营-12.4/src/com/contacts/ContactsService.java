package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	@Override
	public void helpInfo() {
		System.out.println("-----------ͨ��¼����ϵͳ------------");
		System.out.println("��1��¼��ͨѶ¼��Ϣ������Add");
		System.out.println("��2����ʾ����ͨѶ¼��Ϣ������Info");
		System.out.println("��3����������������Name");
		System.out.println("��4���Ա�����������Sex");
		System.out.println("��5���绰��������������Num");
		System.out.println("��6���˳�ϵͳ������Exit");
		
	}
	

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		
		
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("���������Ϣ������Χ�����������룺");
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
			System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
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
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
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
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
		}
	}

	
}
