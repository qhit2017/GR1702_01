package com.kyh.qhit;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1299394372@qq.com
 * @date 创建时间：2017年11月16日 下午8:23:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Rank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数：");
		int b = sc.nextInt();

		System.out.println("请输入第三个数：");
		int c = sc.nextInt();

		System.out.println("请输入第四个数：");
		int d = sc.nextInt();

		int j;
		if (a < b) {
			j = a;
			a = b;
			b = j;
		}

		int w;
		if (b < c) {
			w = b;
			b = c;
			c = w;
		}

		int x;
		if (c < d) {
			x = c;
			c = d;
			d = x;
		}

		int h;
		if (a < d) {
			h = a;
			a = d;
			d = h;
		}

		int s;
		if (a < c) {
			s = a;
			a = c;
			c = s;
		}

		int g;
		if (b < d) {
			g = b;
			b = d;
			d = g;
		}

		if (a < b) {
			j = a;
			a = b;
			b = j;
		}

		if (b < c) {
			w = b;
			b = c;
			c = w;
		}

		if (c < d) {
			x = c;
			c = d;
			d = x;
		}

		if (a < d) {
			h = a;
			a = d;
			d = h;
		}

		if (a < c) {
			s = a;
			a = c;
			c = s;
		}

		if (b < d) {
			g = b;
			b = d;
			d = g;
		}

		System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
		sc.close();
	}

}
