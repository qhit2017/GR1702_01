package com.zk.qhit.statictest;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月21日上午11:06:38
 *邮箱：2408368509@qq.com
 */

public class san {
	public static void main(String[] args) {

		// 输入三个整数x,y,z，请把这三个数由小到大输出
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数");
		double w = sc.nextDouble();
		double x = sc.nextDouble();
		double a = sc.nextDouble();
		double j = 0;
		if (w > x) {
			j = w;
			w = x;
			x = j;
		}
		if (w > a) {
			j = w;
			w = a;
			a = j;
		}
		if (x > a) {
			j = x;
			x = a;
			a = j;
		}
		System.out.println(w + "<" + x + "<" + a);
	}
}
