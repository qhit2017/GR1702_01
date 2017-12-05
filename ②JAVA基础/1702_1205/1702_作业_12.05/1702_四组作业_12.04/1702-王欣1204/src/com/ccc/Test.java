package com.ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		IarrayList cService = new IarrayList();
		Scanner sc = new Scanner(System.in);
		cService.helpinfo();
		boolean isQuit = true;
		while (isQuit) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				cService.infoContacts(arrayList);
				break;
			case 3:
				String name = sc.next();
				cService.findByname(arrayList, name);
				break;
			case 4:
				String sex = sc.next();
				cService.findBysex(arrayList, sex);
				break;
			case 5:
				String num = sc.next();
				cService.findByNum(arrayList, num);
				break;
			case 6:
				isQuit = false;
				break;

			default:
				System.out.println("你输入的命令无效");
				break;
			}
		}System.out.println("拜拜");
	}

}
