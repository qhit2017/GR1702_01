package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:36:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����һ����λ��:");
		
		int a = sc.nextInt();

		int b = a / 10 % 10;

		System.out.println("�����λ����ʮλ���ǣ�" + b);

		sc.close();
	}
}
