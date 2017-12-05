package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cservice = new ContactsService();
		Scanner sc = new Scanner(System.in);
		cservice.helpInfo();
		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入：");
				cservice.addcontacts(arrayList, sc);
				break;
			case 2:
				System.out.println("所有信息为：");
				cservice.infocontacts(arrayList);
				break;
			case 3:
				System.out.println("按姓名查找：");
				String name = sc.next();
				cservice.findByname(arrayList, name);
				break;
			case 4:
				System.out.println("按性别查找:");
				String sex = sc.next();
				cservice.findBysex(arrayList, sex);
				break;
			case 5:
				System.out.println("按电话号码查找：");
				String Num = sc.next();
				cservice.findByNum(arrayList, Num);
				break;
			case 6:
				isQuit = false;
				System.out.println("拜拜");
				break;

			default:
				System.out.println("你输入的命令无效");
				break;
			}
		}

	}
}
