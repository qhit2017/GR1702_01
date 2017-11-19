package com.qhit.animal;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月16日 下午8:15:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Size {

	public static void main(String[] args) {
		// 从键盘输入4个整数，
		// 编写程序实现对这4 个整数从大到小的顺序排列输出
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个值");
		int a = sc.nextInt();
		System.out.println("输入第二个值");
		int b = sc.nextInt();
		System.out.println("输入第三个值");
		int c = sc.nextInt();
		System.out.println("输入第四个值");
		int d = sc.nextInt();
		int i = 0;
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
		if (a > d) {
			i = a;
			a = d;
			d = i;
		}
		if (b > c) {
			i = b;
			b = c;
			c = i;
		}
		if (b > d) {
			i = b;
			b = d;
			d = i;
		}
		if (c > d) {
			i = c;
			c = d;
			d = i;
		}
		System.out.println(d + ">" + c + ">" + b + ">" + a);
	}
}
