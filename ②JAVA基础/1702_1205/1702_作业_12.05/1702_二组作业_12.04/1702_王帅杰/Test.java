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
				System.out.println("�����룺");
				cservice.addcontacts(arrayList, sc);
				break;
			case 2:
				System.out.println("������ϢΪ��");
				cservice.infocontacts(arrayList);
				break;
			case 3:
				System.out.println("���������ң�");
				String name = sc.next();
				cservice.findByname(arrayList, name);
				break;
			case 4:
				System.out.println("���Ա����:");
				String sex = sc.next();
				cservice.findBysex(arrayList, sex);
				break;
			case 5:
				System.out.println("���绰������ң�");
				String Num = sc.next();
				cservice.findByNum(arrayList, Num);
				break;
			case 6:
				isQuit = false;
				System.out.println("�ݰ�");
				break;

			default:
				System.out.println("�������������Ч");
				break;
			}
		}

	}
}
