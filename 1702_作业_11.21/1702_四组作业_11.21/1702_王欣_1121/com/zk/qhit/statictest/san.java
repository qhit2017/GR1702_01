package com.zk.qhit.statictest;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��21������11:06:38
 *���䣺2408368509@qq.com
 */

public class san {
	public static void main(String[] args) {

		// ������������x,y,z���������������С�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
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
