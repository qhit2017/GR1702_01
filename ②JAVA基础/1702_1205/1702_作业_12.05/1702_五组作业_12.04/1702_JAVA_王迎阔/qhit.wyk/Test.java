package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService  =  new ContactsService();
		Scanner sc = new Scanner(System.in); 
		contactsService.helpinfo();
		boolean isQuit = true;
		int s =0;
		
		
		
		while (isQuit) {
			s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("��������Ϣ");
				contactsService.addContacts(arrayList, sc);
				break;
			case 2:
				contactsService.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("��������Ϣ");
				String name = sc.next();
				contactsService.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("��������Ϣ");
				String Sex = sc.next();
				contactsService.findBySex(arrayList, Sex);
				
				break;
			case 5:
				System.out.println("��������Ϣ");
				String telNum = sc.next();
				contactsService.findBytelNum(arrayList, telNum);
				break;
			case 6:
				isQuit = false;
				
				break;
			default:
				break;
			}
			
		}
		System.out.println("�˳�ϵͳ");
	}
}
