package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��12��4������5:21:09
 *���䣺2507147605@qq.com
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts>arrayList = new ArrayList<Contacts>();
		Contactsser contactsser =new Contactsser();
		Scanner  sc=new Scanner(System.in);
		contactsser.help();
		
		boolean isQuit =true;
		while (isQuit) {
			System.out.println("���������ָ��");
			String key = sc .next();
			switch (key) {
			case "1":
				contactsser.add(arrayList, sc);
				break;
			case "2":
				contactsser.info(arrayList );
				break;
			case "3":
				
				String category = sc.next();
				contactsser.findName(arrayList, category);
				break;
				case "4":
				String sex = sc.next();
				contactsser.findsex(arrayList,sex);
				break;
				case "5":
					
					String number= sc.next();
					contactsser.findNumber(arrayList,number);
					
				break;
				case "6":
					 isQuit =false;
				break;
			default:
				System.out.println("���������Ч");
				break;
			}
		}
		System.out.println("�ݰ�");
		
	}

}
