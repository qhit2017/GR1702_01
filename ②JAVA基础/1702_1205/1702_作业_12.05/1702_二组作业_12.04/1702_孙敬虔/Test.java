package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Address> arrayList = new ArrayList<Address>();
		AddressService cService = new AddressService();
		Scanner sc = new Scanner(System.in);
		cService.helpinfo();
		int key = 0;
		boolean isquit = true;
		while (isquit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				cService.addAddress(arrayList, sc);
				break;
			case 2:
				cService.infoAddress(arrayList);
				break;
			case 3:
				String name = sc.next();
				cService.findname(arrayList, name);
				break;
			case 4:
				String sex = sc.next();
				cService.findsex(arrayList, sex);
				break;
			case 5:
				String num = sc.next();
				cService.findNum(arrayList, num);
				break;
			case 6:
				isquit = false;
				break;
			default:
				System.out.println("ÄãµÄÃüÁîÎÞÐ§");
				break;
			}
		}
		System.out.println("°Ý°Ý£¡");
	}

}
