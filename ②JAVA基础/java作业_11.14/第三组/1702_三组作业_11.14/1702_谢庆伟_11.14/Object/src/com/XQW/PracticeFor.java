package com.XQW;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����9:35:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeFor {

	public static void main(String[] args) {
		System.out.println("�塢���ۼ�ֵ����Ҫ��������λΪ3������\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("��������С��Χ��");
		int a=sc.nextInt();
		System.out.println("���������Χ��");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++){
			if(i%10!=3){
				sum=sum+i;
			}
		}
		System.out.println(a+"~"+b+"ȥ����λΪ3���ۼ�ֵ�ǣ�"+sum);
		sc.close();

	}
	
}
