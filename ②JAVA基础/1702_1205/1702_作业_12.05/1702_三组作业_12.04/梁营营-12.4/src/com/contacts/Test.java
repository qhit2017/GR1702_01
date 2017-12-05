package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		Scanner sc = new Scanner(System.in);
		ContactsService contactsService = new ContactsService();
		boolean isQuit = true;
		String key;
		contactsService.helpInfo();
        while (isQuit) {
        	System.out.println("请输入指令，并按回车键:");
        	key = sc.next();
			switch (key) {
			case "Add":
				contactsService.addContacts(arrayList, sc);
				break;
			case "Info":
				contactsService.infoContacts(arrayList);;
				break;
			case "Name":
				String name = sc.next();
				contactsService.findByName(arrayList, name);
				break;
			case "Sex":
				String Sex = sc.next();
				contactsService.findBySex(arrayList, Sex);
				break;
			case "Num":
				String Num = sc.next();
				contactsService.findByNum(arrayList, Num);
				break;
			case "Exit":
				isQuit = false;
				break;

			default:
				System.out.println("您输入的指令无效！");
				break;
			}
		}
        System.out.println("退出系统");
	}
}
