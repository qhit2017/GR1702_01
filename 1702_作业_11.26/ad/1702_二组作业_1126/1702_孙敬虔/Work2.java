package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��25�� ����12:25:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��;");
		int a =sc.nextInt();
		
		int Tens =a/10%10;
		System.out.println(Tens);
		sc.close();
	}
}
