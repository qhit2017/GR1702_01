package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��25�� ����1:07:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������;");
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		
		int a;
		if(x>y){
			a=x;
			x=y;
			y=a;
		}
		if(x>z){
			a=x;
			x=z;
			z=a;
		}
		if(y>z){
			a=y;
			y=z;
			z=a;
		}
		System.out.println(x+"<"+y+"<"+z);
		sc.close();
	}

}
