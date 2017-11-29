package com.qhit;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 下午7:52:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int a = 0; a <= 1000; a++) {
			if (a % 2 != 0) {
				sum += a;
			} else if (a % 2 == 0) {
				sum2 += a;
			}
		}
		System.out.println("奇数" + sum);
		System.out.println("偶数" + sum2);
	}
}
