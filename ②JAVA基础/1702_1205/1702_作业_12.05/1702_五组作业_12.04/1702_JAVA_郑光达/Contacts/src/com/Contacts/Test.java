/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��4�� ����3:39:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		CommunicationPractice communicationPractice = new CommunicationPractice();

		communicationPractice.getHelp();
		String key;
		boolean isQure = true;
		while (isQure) {
			System.out.println("\n����������ָ�");
			key = sc.next();
			switch (key) {
			case "Add":
				System.out.println("\t---��������Ҫ��ӵ���Ϣ---");
				System.out.println("\t��ʽΪ:");
				System.out.println("\t(����,�Ա�,�ֻ�����)");
				communicationPractice.Add(arrayList, sc);
				break;
				
			case "Info":
				communicationPractice.Info(arrayList);
				break;

			case "Name":
				System.out.println("\n��������Ҫ���ҵ�����:");
				String category = sc.next();
				communicationPractice.FindName(arrayList, category);
				break;
				
			case "Sex":
				System.out.println("\n��������Ҫ���ҵ��Ա�:");
				String sex = sc.next();
				communicationPractice.FindSex(arrayList, sex);
				break;
				
			case "Number":
				System.out.println("\n��������Ҫ���ҵ��ֻ�����:");
				String phone = sc.next();
				communicationPractice.FindNumber(arrayList, phone);
				break;
				
			case "Exit":
				isQure = false;
				break;

			default:
				System.out.println("\n\t---�������ָ������---");
				break;
			}

		}
		System.out.println("\n\t---�˳�ϵͳ---");
	}

}
