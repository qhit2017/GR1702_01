package qhit.xym;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Scanner;

public class ContactsService implements IContacts {

	void help() {
		System.out.println("---通讯录---");
		System.out.println("1.增加手机通讯录");
		System.out.println("2.查询全部人数");
		System.out.println("3.姓名查找");
		System.out.println("4.性别查找");
		System.out.println("5.号码查找");
		System.out.println("6.退出");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// 1.接收输入值，Ctrl+2松掉，再按L键
		String s = sc.next();
		// 2.拆分
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的格式不正确，请重新输入，按“张子，女，13569577999”这个形式写");
		} else {
			// 3.通过上面的信息构造一个Contacts的实体思想
			Contacts A = new Contacts(a[0], a[1], a[2]);
			// 4.添加到arrayList里面
			arrayList.add(A);
			// 5.打印刚刚添加的这条通讯录信息
			System.out.println(A.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {

		// 普通for循环
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
			System.out.println("你输入的对象不存在");
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
			System.out.println("你输入的对象不存在");
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
			System.out.println("你输入的对象不存在");
		}
	}

	@Override
	public void findByNameSexTelnum(ArrayList<Contacts> arrayList, String sort) {
		// TODO Auto-generated method stub

	}

}
