package com.zk.qhit.statictest;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����4:47:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int a = sc.nextInt();
		 
		if (a%10==a/10000&&a%10000/1000==a%100/10) {
			System.out.println(a+"��һ��������");
		} else {
			System.out.println(a+"����һ��������");
		}
	}
}
