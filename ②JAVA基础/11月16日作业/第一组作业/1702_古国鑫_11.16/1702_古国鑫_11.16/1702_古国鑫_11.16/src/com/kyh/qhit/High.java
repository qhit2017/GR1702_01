package com.kyh.qhit;

/**
 * @author 作者 E-mail:1299394372@qq.com
 * @date 创建时间：2017年11月16日 下午8:21:11
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
