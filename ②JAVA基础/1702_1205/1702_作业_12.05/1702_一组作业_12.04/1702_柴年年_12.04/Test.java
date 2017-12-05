package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		cService.help();
		boolean isQuite = true;
		int key;
		while (isQuite) {
			System.out.println("请输入你要执行的命令");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入添加的信息");
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				System.out.println("所有信息");
				cService.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("请输入要查询的名字");
				String name = sc.next();
				cService.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("请输入要查询的性别");
				String sex = sc.next();
				cService.findBySex(arrayList, sex);
				break;
			case 5:
				System.out.println("请输入要查询的电话");
				String num = sc.next();
				cService.findBylsum(arrayList, num);
				break;
			case 6:
				isQuite = false;
				break;

			default:
				break;
			}
		}
		System.out.println("再见!");
	}

}
