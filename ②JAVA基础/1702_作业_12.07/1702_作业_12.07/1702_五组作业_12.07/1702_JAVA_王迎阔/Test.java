package com.wyk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		 ArrayList<Employee>arrayList = new ArrayList<Employee>();
		 RealizeEmployee realizeEmployee = new RealizeEmployee();
		 Scanner sc = new Scanner(System.in);
		 realizeEmployee.help();
		 boolean isQuit = true;
		
		while (isQuit) {
			String key = sc.next();
			System.out.println("����������ָ����س���");
			
			switch (key) {
			case "add":
				System.out.println("��������Ҫ��ӵ���Ʒ����");
			realizeEmployee.addEmployee(arrayList, sc);
				break;
			case "get":
				realizeEmployee.getEmployee(arrayList, sc);
				break;
			case "sell":
				realizeEmployee.sellEmployee(arrayList, sc);
				break;
			case "info":
				realizeEmployee.infoEmployee(arrayList, sc);
				break;
			case "Exit":
				isQuit = false;
				break;
			default:
				System.out.println("�������ָ���������������");
				break;
			}
		}
		System.out.println("�ټ�������");
		 }
}
