package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:18:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Palindromic {
	public static void main(String[] args) {
		
		System.out.println("������:");
		//һ��5λ�����ж����ǲ��ǻ�������
		//��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��

		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������:");
		int a =sc.nextInt();
		
		if((a/10000==a%10)&&(a%10000/1000==a%100/10)&&a>=10000&&a<=99999){
			
			System.out.println("�������ǻ�����");
		}else{
			System.out.println("�������ǻ����������������");
		}
	}
	
}
