package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����2:40:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestContacts {

	public static void main(String[] args) {
		ArrayList<Contacts> arr=new ArrayList<Contacts>();
		ContactsSer con=new ContactsSer();
		Scanner sc=new Scanner(System.in);
		System.out.println("----------ͨѶ¼ϵͳ----------");
		boolean is=true;
		while (is) {
			System.out.println("������ָ������롾0���鿴������");
			String key=sc.next();
			switch (key) {
			case "0":
				con.help();
				break;
			case "1":
				con.addcon(arr, sc);
				break;
			case "2":
				con.info(arr);
				break;
			case "3":
				con.findby(arr, sc);
				break;
			case "9":
				is=false;
				System.out.println("��л����ʹ�ã��ټ���");
				break;
			default:
				System.out.println("ָ����Ч�����������룡");
				break;
			}
		}

	}

}
