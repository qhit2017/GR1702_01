package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:36:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入第二个数");

		int b = sc.nextInt();
		;
		System.out.println("请输入第三个数");
		int c = sc.nextInt();
		;
		int j = 0;

		if (a > b) {
			j = a;
			a = b;
			b = j;
		}

		if (a > c) {
			j = a;
			a = c;
			c = j;
		}

		if (b > c) {
			j = b;
			b = c;
			c = j;
		}
		System.out.println(a + "<" + b + "<" + c);
		sc.close();
	}
}

