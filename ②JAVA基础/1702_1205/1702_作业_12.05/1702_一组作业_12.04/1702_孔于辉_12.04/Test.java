package com.contats;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Contacts> contacts = new ArrayList<Contacts>();
		
		ContactsService cService = new ContactsService();
		
		cService.helpinfo();
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true;
		
		int key;
		
		while (exit) {
			key = sc.nextInt();
			switch (key) {

			case 1:
				System.out.println("请输入要增加的通讯录信息：");
				cService.addContatacts(contacts, sc);
				break;

			case 2:
				cService.infoContatacts(contacts);
				break;

			case 3:
				System.out.println("请输入要查询的姓名：");
				String name = sc.next();
				cService.findByName(contacts, name);
				break;

			case 4:
				System.out.println("请输入要查询的性别：");
				String sex = sc.next();
				cService.findBySex(contacts, sex);
				break;

			case 5:
				System.out.println("请输入要查询的电话：");
				String tei = sc.next();
				cService.findByTeinum(contacts, tei);
				break;
			case 6:
				exit = false;
				break;

			default:
				System.out.println("您输入的命令无效！！！");
				break;
			}

		}
		System.out.println("谢谢使用，再见！");
	}

}
