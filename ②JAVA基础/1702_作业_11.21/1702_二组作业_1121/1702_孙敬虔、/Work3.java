package com.zk.qhit.stattictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��21�� ����6:57:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("��������������");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i;
		if(a>b){
			i=a;
			a=b;
			b=i;
		}
		if(a>c){
			i=a;
			a=c;
			c=i;
		}
		if(b>c){
			i=b;
			b=c;
			c=i;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}

}
