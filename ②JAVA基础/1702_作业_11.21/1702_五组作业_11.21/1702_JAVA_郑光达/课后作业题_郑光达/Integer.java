/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��20�� ����7:13:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if(a>b){
			a=d;
			a=b;
			b=d;
		}if(a>c){
			a=d;
			a=c;
			c=d;
		}if(b>c){
			b=d;
			b=c;
			c=d;
		}System.out.println(a+" "+b+" "+c);
		
	}
}
