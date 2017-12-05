package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	void helpInfo() {
		System.out.println("******ͨѶ¼����ϵͳ******");
		System.out.println("1.���һ����ϵ��");
		System.out.println("2.��ʾ������ϵ����Ϣ");
		System.out.println("3.ͨ������������ϵ��");
		System.out.println("4.ͨ���Ա������ϵ��");
		System.out.println("5.ͨ���绰������ϵ��");
		System.out.println("6.�˳�");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// 1.���������ֵ
		String s = sc.next();
		// 2.���
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("����ĸ�ʽ����ȷ������������");
		} else {
			// 3.ͨ���������Ϣ����һ��Contacts��ʵ����Ϣ
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// 4.��ӵ�arrayList����
			arrayList.add(contacts);
			// 5.��ӡ�ո���ӵ�������Ϣ
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
	public void findByName(ArrayList<Contacts> arrayList, String Name) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (Name.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String sex = contacts.getSex();
			if (Sex.equals(sex)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
	}

	@Override
	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String num = contacts.getTelNum();
			if (Num.equals(num)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
	}
}
