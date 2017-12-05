package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����4:24:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContactsBook {

	void helpinfo() {
		System.out.println("----ͨѶ¼����ϵͳ----");
		System.out.println("--1--¼��ͨѶ¼");
		System.out.println("--2--��ʾͨѶ¼��Ϣ");
		System.out.println("--3--��������");
		System.out.println("--4--�Ա�����");
		System.out.println("--5--�绰����");
		System.out.println("--6--�˳�ͨѶ¼");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String s = sc.next();
		// ���
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("���������Ϣ��ʽ���������������룬��ʽ����С�ţ��У�15896325478������");
		} else {
			// ʵ����Ĺ���
			Contacts contacts = new Contacts(a[0], a[1], a[2]);

			// ���arrayList����
			arrayList.add(contacts);

			// ��ӡ�ո���ӵ�����ͨѶ¼��Ϣ
			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*
		 * //��ǿfor for (Contacts contacts : arrayList) {
		 * System.out.println(contacts.toString()); } //������ Interator<Contacts>
		 * arrayListiterator(); while (iterator.hasNext()) { Contacts contacts =
		 * (Contacts) iterator.next(); System.out.println(contacts.toString());
		 * }
		 */

	}

	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getName();
			if (name.equals(name2)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
			}

		}
		
	

	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name3 = contacts.getSex();
			if (Sex.equals(name3)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");

			}

		}
		
	

	public void findBytelNum(ArrayList<Contacts> arrayList, String telNum) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name4 = contacts.getTelNum();
			if (telNum.equals(name4)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");

			}

		}
		
	}

