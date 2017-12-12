package com.Score;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// 判断101-200之间有多少个素数，并输出所有素数。
		int count = 0;
		boolean a = false;
		for (int i = 101; i < 200; i += 2) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					a = false;
					break;
				} else {
					a = true;
				}
			}
			if (a == true) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("素数的个数是：" + count);
	}
}
