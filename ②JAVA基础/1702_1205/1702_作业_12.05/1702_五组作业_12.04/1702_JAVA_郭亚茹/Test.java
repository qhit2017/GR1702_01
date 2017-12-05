package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		contactsService.help();
		String key;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.next();
			switch (key) {
			case "add":
				System.out.println("��������Ҫ��ӵ���Ϣ��");
				contactsService.addContacts(arrayList, sc);
				break;
			case "info":
				contactsService.infoContacts(arrayList);
				break;
			case "name":
				System.out.println("��������Ҫ���ҵ�������");
				String name = sc.next();
				contactsService.findByname(arrayList, name);
				break;
			case "sex":
				System.out.println("��������Ҫ���ҵ��Ա�");
				String sex = sc.next();
				contactsService.findBysex(arrayList, sex);
				break;
			case "tell":
				System.out.println("��������Ҫ���ҵĵ绰���룡");
				String tell = sc.next();
				contactsService.findBytell(arrayList, tell);
				break;
			case "exit":
				isQuit = false;
				break;
			    default:
				break;
			}

		}
		System.out.println("лл�����˳�����!");
	}

}
