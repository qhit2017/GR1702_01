package com.lyl;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��4�� ����5:16:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		
		ContactsService service = new ContactsService();
		Scanner sc = new Scanner(System.in);
		service.helpinfo();
		
		boolean isquest = true;
		int key=0;
		while (isquest) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("������ ���� �� �Ա� �绰����");
				service.addContacts(arrayList, sc);
				break;
			case 2:
				
				service.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("��������Ҫ������ϵ�˵�������");
				String name2 = sc.next();
				service.findname(arrayList, name2);
				break;
			case 4:
				System.out.println("��������Ҫ������ϵ�˵��Ա�");
				String sex = sc.next();
				service.findsex(arrayList, sex);
				break;
			case 5:
			System.out.println("��������Ҫ������ϵ�˵ĵ绰��");
				String num= sc.next();
				service.findnum(arrayList, num);
				break;
			case 6:
				isquest = false;
				break;
              default:
            	  System.out.println("�������ָ����Ч!");
				break;
			}
		}
		System.out.println("��л���ʹ�ã��ټ���");
		
	}

}
