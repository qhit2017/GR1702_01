package com.qhit02;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月20日 下午7:42:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Rank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i;
		if (a > b) {
			i = a;
			a = b;
			b = i;

		}
		if (a > c) {
			i = a;
			a = c;
			c = i;
		}
		if (b > c) {
			i = b;
			b = c;
			c = i;
		}
		System.out.println(a + ", " + b + ", " + c);

		sc.close();
	}
}
