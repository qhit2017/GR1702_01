package com.qhit;

//������ʵ����
import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements Icontactsbook {
	void helpInfo() {
		System.out.println("ͨѶ¼����ϵͳ");
		System.out.println("1 ¼��ͨѶ¼��Ϣ");
		System.out.println("2 ��ʾ������Ϣ");
		System.out.println("3 ����������");
		System.out.println("4 ���Ա���� ");
		System.out.println("5 ���绰�������");
		System.out.println("6 �˳�");
	}

	@Override
	public void addcontacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������ĸ�ʽ���ԣ�����������");
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
			System.out.println("��Ҫ���ҵĶ��󲻴���");
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
			System.out.println("��Ҫ���ҵĶ��󲻴���");
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
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
	}
}
