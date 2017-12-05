package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		boolean v = true;
		int l;
		cService.hashCode();
		while (v) {
		l = sc.nextInt();
		switch (l) {
		case 1:
			System.out.println("请添加一个联系人");
			cService.addcontacts(arrayList, sc);
			break;
		case 2:
			
			cService.addcontacts(arrayList, sc);
			break;
		case 3:
			System.out.println("请输入你要查找的姓名");
			String name = sc.next();
			break;
		case 4:
			System.out.println("请输入你要查找的性别");
			String sex = sc.next();
			break;
		case 5:
			System.out.println("请输入你要查找的电话");
			String num = sc.next();
			break;
		case 6:
			v = true;
			break;
		default:
			break;
		}
		}
		System.out.println("拜拜");
	}

}
