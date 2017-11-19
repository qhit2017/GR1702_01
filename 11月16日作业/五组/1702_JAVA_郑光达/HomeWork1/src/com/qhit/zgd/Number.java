/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月16日 下午8:09:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数:");
		int c = sc.nextInt();
		System.out.println("请输入第四个数：");
		int d = sc.nextInt();
		int f;
		if (a > b) {
			f = a;
			a = b;
			b = f;
		}
		if (a > c) {
			f = a;
			a = c;
			c = f;
		}
		if (a > d) {
			f = a;
			a = d;
			d = f;
		}
		if (b > c) {
			f = b;
			b = c;
			c = f;
		}
		if (b > d) {
			f = b;
			b = d;
			d = f;
		}
		if (c > d) {
			f = c;
			c = d;
			d = f;
		}
		System.out.println("从大到小依次排列：\n"+d + " " + c + " " + b + " " + a);
	}

}
