package zk.qhit.smc;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays implements IArrays {

	public void help() {
		System.out.println("---ͨѶ¼ϵͳ---");
		System.out.println("1¼����Ϣ");
		System.out.println("2��ѯ����");
		System.out.println("3��ѯ�Ա�");
		System.out.println("4��ѯ�绰");
		System.out.println("5��ѯȫ����Ϣ");
		System.out.println("6�˳�ϵͳ");

	}

	@Override
	public void addAddressBook(ArrayList<AddressBook> arrayList, Scanner sc) {

		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������ĸ�ʽ����ȷ");
		} else {
			AddressBook A = new AddressBook(a[0], a[1], a[2]);
			arrayList.add(A);
			System.out.println(A.toString());

		}

	}

	@Override
	public void infoAddressBook(ArrayList<AddressBook> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			AddressBook addressBook = arrayList.get(i);
			System.out.println(addressBook.toString());
		}

	}

	@Override
	public void findByNameSexNum(ArrayList<AddressBook> arrayList, String sort,
			Scanner sc) {
		String string = sc.next();
		if (sort.equals("����")) {
			boolean isfind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				AddressBook Book = arrayList.get(i);
				String name = Book.getName();
				if (name.equals(string)) {
					System.out.println(Book.toString());
					isfind = true;
				}
			}
			if (!isfind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
			}
		}

		if (sort.equals("�Ա�")) {
			boolean isfind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				AddressBook Book = arrayList.get(i);
				String sex = Book.getSex();
				if (sex.equals(string)) {
					System.out.println(Book.toString());
					isfind = true;
				}

			}
			if (!isfind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
			}
		}

		if (sort.equals("�绰")) {
			boolean isfind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				AddressBook Book = arrayList.get(i);
				String num = Book.getTelnum();
				if (num.equals(string)) {
					System.out.println(Book.toString());
					isfind = true;
				}

			}
			if (!isfind) {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
			}
		}

	}

}
