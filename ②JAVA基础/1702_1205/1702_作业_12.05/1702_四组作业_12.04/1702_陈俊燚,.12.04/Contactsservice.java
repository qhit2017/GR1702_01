//ʵ����
package com.chen;

import java.util.ArrayList;
import java.util.Scanner;

public class Contactsservice implements IContacts {
	void helpInfo(){
		System.out.println("-----ͨѶ����ϵͳ-----");
		System.out.println("1:��ӵ绰����Ա");
		System.out.println("2:��ʾ����ͨѶ¼��Ϣ");
		System.out.println("3:��������");
		System.out.println("4:�Ա�����");
		System.out.println("5:�绰����");
		System.out.println("6:�˳���ϵͳ��   ");
	}
	
	private void Contacts() {
		// TODO Auto-generated method stub
	}

	// ¼��ͨѶ¼��Ϣ
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("��������������������롣��������ʾ���롰����,�绰,�Ա𡱣�");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// ��ӵ�ArrayList���
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	// ��ѯ����
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// ��ͨѭ��
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	// ����������ѯ���Ա��ѯ���绰��ѯ
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
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSexs();
			if (Sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("��Ҫ���ҵĶ��󲻴���!");
		}
	}

	@Override
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
			System.out.println("��Ҫ���ҵĶ��󲻴���!");
		}
	}
}
