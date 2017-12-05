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
			System.out.println("��������Ҫִ�е�����");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������ӵ���Ϣ");
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				System.out.println("������Ϣ");
				cService.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("������Ҫ��ѯ������");
				String name = sc.next();
				cService.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("������Ҫ��ѯ���Ա�");
				String sex = sc.next();
				cService.findBySex(arrayList, sex);
				break;
			case 5:
				System.out.println("������Ҫ��ѯ�ĵ绰");
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
		System.out.println("�ټ�!");
	}

}
