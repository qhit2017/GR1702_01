package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����7:24:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {

	//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����λ����");
		
		int a = sc.nextInt();
		
			if(a/10000==a%10 && a%10000/1000==a%100/10){
			
				System.out.println(a+"�ǻ�����");
			}else{
			
			System.out.println(a+"���ǻ�����");
		}
		sc.close();
	}
}
