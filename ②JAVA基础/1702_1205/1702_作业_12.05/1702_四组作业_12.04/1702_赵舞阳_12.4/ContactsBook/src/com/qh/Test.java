package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// ����һ��ArrayList�����洢ͨѶ¼��Ϣ
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService Service = new ContactsService();
		Scanner sc = new Scanner(System.in);
		Service.helpInfo();
		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("�����һ����ϵ��");
				System.out.println("��ʽ����:\n����,��,13608877477");
				Service.addContacts(arrayList, sc);
				break;
			case 2:
				System.out.println("������ϵ����Ϣ����:");
				Service.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("��������������ϵ��");
				String Name = sc.next();
				Service.findByName(arrayList, Name);
				break;
			case 4:
				System.out.println("�����Ա������ϵ��");
				String Sex = sc.next();
				Service.findBySex(arrayList, Sex);
				break;
			case 5:
				System.out.println("����绰������ϵ��");
				String Num = sc.next();
				Service.findByNum(arrayList, Num);
				break;
			case 6:
				isQuit = false;
				break;
			default:
				System.out.println("�������������Ч");
				break;
			}
		}
		System.out.println("�˳�");
	}
}
