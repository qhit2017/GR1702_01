package com.contats;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {

	void helpinfo() {
		System.out.println("~~~~~~~~ͨѶ¼��Ϣ����ϵͳ~~~~~~~~~");
		System.out.println("��1������ͨѶ¼��Ϣ������1");
		System.out.println("��2����ʾ����ͨѶ¼��Ϣ������2");
		System.out.println("��3������������������3");
		System.out.println("��4�����Ա�����������4");
		System.out.println("��5�����绰����������5");
		System.out.println("��6���˳�������6");
	}

	@Override
	public void addContatacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String a = sc.next();

		String[] ar = a.split(",");

		if (ar.length == 3) {
			Contacts contacts = new Contacts(ar[0], ar[1], ar[2]);

			arrayList.add(contacts);
			System.out.println(contacts.toString());

		} else {

			System.out.println("��������ĸ�ʽ����ȷ���밴���¸�ʽ���롰����,��,123345685��");
		}

	}

	@Override
	public void infoContatacts(ArrayList<Contacts> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());

		}

		/*
		 * for (Contacts contacts : arrayList) {
		 * System.out.println(arrayList.toString()); }
		 */

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getName();
			if (name.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
		}
		}
		if (!is) {
			System.out.println("����Ҫ���ҵĶ��󲻴��ڣ�����");
		}

	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String sex) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getSex();
			if (sex.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
			}
			
		}
		if (!is) {
			System.out.println("����Ҫ���ҵĶ��󲻴��ڣ�����");
		}
	}

	@Override
	public void findByTeinum(ArrayList<Contacts> arrayList, String teinum) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getTeiNum();
			if (teinum.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
			}
			
		}
		 if (!is) {
				System.out.println("����Ҫ���ҵĶ��󲻴��ڣ�����");
			}
	}

}
