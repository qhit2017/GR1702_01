package com.qhit;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 下午7:33:17
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数");
		int a = sc.nextInt();
		System.out.println("输入第二个数");
		int b = sc.nextInt();
		System.out.println("输入第三个数");
		int c = sc.nextInt();
		int d = 0;
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		if (a > c) {
			d = a;
			a = c;
			c = d;
		}
		if (b > c) {
			d = b;
			b = c;
			c = d;
		}
		if (c > a) {
			d = c;
			c = a;
			a = d;
		}
		System.out.println(c + "<" + b + "<" + a);
	}
}