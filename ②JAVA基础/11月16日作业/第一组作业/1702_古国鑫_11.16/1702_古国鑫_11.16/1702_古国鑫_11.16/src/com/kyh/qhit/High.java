package com.kyh.qhit;

/**
 * @author ���� E-mail:1299394372@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:21:11
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class High {
	public static void main(String[] args) {

		double a = 100;
		double c = a / 2;

		for (int b = 1; b <= 10; b++) {
			a += c * 2;
			c = c / 2;
		}
		System.out.println(a);
		System.out.println(c);

	}
}
