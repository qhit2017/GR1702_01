package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
public static void main(String[] args) {
	
	//����һ��ArrList�����洢ͨѶ¼��Ϣ
	ArrayList<Contacts>arrayList=new ArrayList<Contacts>();
	
	ContactsString cService = new ContactsString();
	
	Scanner sc=new Scanner(System.in);
	cService.Info();
	int key = 0;
	boolean isQuit = true;
	while(isQuit){
		key=sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("��������Ϣ");
			cService.addContacts(arrayList,sc);
			break;
		case 2:
			cService.addContacts(arrayList,sc);
			break;
		case 3:
			String name=sc.next();
			cService.addContacts(arrayList,sc);
			break;
		case 4:
			String sex = sc.next();
			cService.addContacts(arrayList,sc);
			break;
		case 5:
			String telNum=sc.next();
			cService.addContacts(arrayList,sc);
			break;
		case 6:
			isQuit=false;
			break;
		default:
			System.out.println("�������������Ч");
			break;
		}
	}
	System.out.println("�˳�ϵͳ");
}
}
