package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:16:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Order {
	public static void main(String[] args) {
		
		System.out.println("������:");
		//������������x,y,z���������������С���������
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�����һ������:");
		int x=sc.nextInt();
		System.out.println("����ڶ�������:");
		int y=sc.nextInt();
		System.out.println("�������������:");
		int z=sc.nextInt();
		int t;
		
		if(x>y){
			t=x;
			x=y;
			y=t;
		}
		if(x>z){
			t=x;
			x=z;
			z=t;
		}
		if(y>z){
			t=y;
			y=z;
			z=t;
		}
		
	 	
		System.out.println(x+"<"+y+"<"+z);
	}
	
}
