package zengxiangshun;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��5�� ����3:16:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContacts {
	void hellp(){
		System.out.println("ͨѶ¼ϵͳ");
		System.out.println("1�����");
		System.out.println("2������");
		System.out.println("3��������ѯ");
		System.out.println("4���Ա��ѯ");
		System.out.println("5���绰��ѯ");
		System.out.println("6���˳�ϵͳ");
	}

	@Override
	public void add(ArrayList<Contacts> arrayList, Scanner sc) {

		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 3) {
			System.out.println("�����ʽ��������������");
		} else {
			Contacts contacts = new Contacts(s[0], s[1], s[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		// 1��for ��ǿѭ��
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		/*
		 * //2����ͨѭ�� for (int i = 0; i < arrayList.size(); i++) {
		 * System.out.println(arrayList.get(i).toString()); } //3��������
		 * Iterator<Contacts> iterator = arrayList.iterator(); while
		 * (iterator.hasNext()) { Contacts contacts = (Contacts)
		 * iterator.next(); System.out.println(contacts.toString()); }
		 */
	}

	@Override
	public void find(ArrayList<Contacts> arrayList, String leixing, Scanner sc) {
		String a = sc.next();
		if (leixing.equals("����")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				String name = arrayList.get(i).getName();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}
			}
			if (!isFind) {
				System.out.println("û���������");
			}
		}
		if (leixing.equals("�Ա�")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				String name = arrayList.get(i).getSex();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}
			}
			if (!isFind) {
				System.out.println("û���������");
			}
		}
		if (leixing.equals("�绰")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {

				String name = arrayList.get(i).getTel();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}

			}
			if (!isFind) {
				System.out.println("û���������");
			}
		}

	}

}
