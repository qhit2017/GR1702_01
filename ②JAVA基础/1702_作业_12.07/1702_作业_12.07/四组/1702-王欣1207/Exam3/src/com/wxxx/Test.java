package com.wxxx;

import java.util.ArrayList;
/*�����ˣ�����
 *����2017��12��7��ʱ������8:26:51
 *����:2408368509@qq.com
 */
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	ArrayList<Contacts> arrayList=new ArrayList<Contacts>();
	Scanner sc =new Scanner(System.in);
	ContactsService contactsService=new ContactsService();
	contactsService.help();
	boolean isExit=true;
	while (isExit) {
		int key = sc.nextInt();
		switch (key) {
		case 1:
			contactsService.addContacts(arrayList, sc);
			break;
		case 2:
			contactsService.infoContacts(arrayList);
			break;
		case 3:
			contactsService.stock(arrayList, sc);
			break;
		case 4:
			contactsService.market(arrayList, sc);
			break;
		case 5:
			isExit=false;
			break;
		
		default:
			System.out.println("�������ָ�����Χ");
			break;
		}
	}
	System.out.println("�ݰ�");
}
}
