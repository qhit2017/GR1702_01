package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��26�� ����8:26:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������С��:");

		double a = sc.nextDouble();
		
		double b = sc.nextDouble();

		if (a == b) {
			System.out.println("����С�����");
		} else {
			System.out.println("����С�������");
			
			sc.close();
		}
	}
}
