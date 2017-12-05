package zk.qhit.smc;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays implements IArrays {

	public void help() {
		System.out.println("---通讯录系统---");
		System.out.println("1录入信息");
		System.out.println("2查询姓名");
		System.out.println("3查询性别");
		System.out.println("4查询电话");
		System.out.println("5查询全部信息");
		System.out.println("6退出系统");

	}

	@Override
	public void addAddressBook(ArrayList<AddressBook> arrayList, Scanner sc) {

		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的格式不正确");
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
		if (sort.equals("姓名")) {
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
				System.out.println("你要查找的对象不存在");
			}
		}

		if (sort.equals("性别")) {
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
				System.out.println("你要查找的对象不存在");
			}
		}

		if (sort.equals("电话")) {
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
				System.out.println("你要查找的对象不存在");
			}
		}

	}

}
