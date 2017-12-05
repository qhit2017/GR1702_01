package qhit.xym;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Scanner;

public class ContactsService implements IContacts {

	void help() {
		System.out.println("---ͨѶ¼---");
		System.out.println("1.�����ֻ�ͨѶ¼");
		System.out.println("2.��ѯȫ������");
		System.out.println("3.��������");
		System.out.println("4.�Ա����");
		System.out.println("5.�������");
		System.out.println("6.�˳�");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// 1.��������ֵ��Ctrl+2�ɵ����ٰ�L��
		String s = sc.next();
		// 2.���
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������ĸ�ʽ����ȷ�����������룬�������ӣ�Ů��13569577999�������ʽд");
		} else {
			// 3.ͨ���������Ϣ����һ��Contacts��ʵ��˼��
			Contacts A = new Contacts(a[0], a[1], a[2]);
			// 4.��ӵ�arrayList����
			arrayList.add(A);
			// 5.��ӡ�ո���ӵ�����ͨѶ¼��Ϣ
			System.out.println(A.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {

		// ��ͨforѭ��
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	public void findName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name1 = contacts.getName();
			if (name.equals(name1)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("������Ķ��󲻴���");
		}
	}

	public void findSex(ArrayList<Contacts> arrayList, String sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String sex1 = contacts.getSex();
			if (sex.equals(sex1)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("������Ķ��󲻴���");
		}
	}

	public void findTelnum(ArrayList<Contacts> arrayList, String telnum) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String telnum1 = contacts.getTelnum();
			if (telnum.equals(telnum1)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("������Ķ��󲻴���");
		}
	}

	@Override
	public void findByNameSexTelnum(ArrayList<Contacts> arrayList, String sort) {
		// TODO Auto-generated method stub

	}

}
