package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��4�� ����5:37:37 
 * @version 1.0 
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Contacts>arrayList = new ArrayList<Contacts>();
		ContactsSerivce cSerivce = new ContactsSerivce();
		
		Scanner sc = new Scanner(System.in);
		cSerivce.helpInfo();
		int key = 0;
		
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				cSerivce.addContacts(arrayList, sc);
				break;
				
			case 2:
				cSerivce.infoContacts(arrayList);
				break;

			case 3:
				String name = sc.next();
				cSerivce.findByName(arrayList, name);
				break;

			case 4:
				String sex = sc.next();
				cSerivce.findBySex(arrayList, sex);
				break;

			case 5:
				String num = sc.next();
				cSerivce.findByNum(arrayList, num);
				break;
				
			case 6:
				isQuit = false;
				break;
				
			default:
				System.out.println("�������������Ч��");
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
	}
}
