package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>(10);
		ContactService c = new ContactService(); 
		Scanner sc = new Scanner(System.in);
		boolean isquit = true;
		int key;
		c.helpInfo();
		while (isquit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				c.addContacts(arrayList, sc);
				break;
			case 2:
				c.infoContacts(arrayList);
				break;
			case 3:
				
				c.findByNameSexTelNum(arrayList,"����", sc);
				
				
				
				break;
			case 4:
				c.findByNameSexTelNum(arrayList, "�Ա�", sc);
				break;
			case 5:
				c.findByNameSexTelNum(arrayList, "�绰����", sc);
				break;
			case 6:
				isquit = false;
				break;
			

			default:
				System.out.println("�������������Ч");
				break;
			}
			
		}
		System.out.println("�˳�ϵͳ");

	}

}
