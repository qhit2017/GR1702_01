package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		
		ContactsService a1 = new ContactsService();
		
		Scanner sc = new Scanner(System.in);
		
		a1.help();
		
		boolean isQuit = true;
		
		while (isQuit) {
			
			System.out.println("������������س�����");
			
			String key = sc.next();
			
			switch (key) {
			case "add":
				
				System.out.println("��������Ҫ¼�����Ϣ��");
				
				a1.addContacts(arrayList, sc);
				
				break;
			case "info":
				
				a1.info(arrayList);
				
				break;
			/*case "findname":
				
				System.out.println("��������Ҫ���ҵ�������");
				
				String name = sc.next();
				
				a1.findByname(arrayList, name);
				
				break;
			case "findsex":
				
				System.out.println("��������Ҫ���ҵ��Ա�");
				
				String sex = sc.next();
				
				a1.findBysex(arrayList, sex);
				
				break;
			case "findnumber":
				
				System.out.println("��������Ҫ���ҵĵ绰���룡");
				
				String num = sc.next();
				
				a1.findBynumber(arrayList, num);
				
				break;
				*/
			case "findname":
				
				System.out.println("��������Ҫ���ҵ�������");
				a1.findBynamesexnumber(arrayList, "����", sc);
				break;
			case "findsex":
				
				System.out.println("��������Ҫ���ҵ��Ա�");
				
				a1.findBynamesexnumber(arrayList, "�Ա�", sc);
				
				break;
			case "findnumber":
				
				System.out.println("��������Ҫ���ҵĵ绰���룡");
				
				a1.findBynamesexnumber(arrayList, "�绰����", sc);
				
				break;
			case "Quit":
				
				isQuit = false;
				
				break;

			default:
				System.out.println("�Բ�����������������������������룡");
				break;
			}
		}
	

		System.out.println("���˳�����");
	}

}
