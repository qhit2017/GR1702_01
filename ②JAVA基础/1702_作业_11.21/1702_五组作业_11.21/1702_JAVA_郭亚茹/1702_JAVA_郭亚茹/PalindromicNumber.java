package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PalindromicNumber {
	public static void main(String[] args) {
		System.out.println("������");
		//һ��5λ�����ж����ǲ��ǻ�������
		//��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����������");
		int a=sc.nextInt();
		if(a%10 == a/10000 && a%10000/1000 == a%100/10){
			System.out.println(a+"���ǻ�����");
		}else {
			System.out.println(a+"������һ��������");
		}
		
		
		
		
		
		
		
	}

}
