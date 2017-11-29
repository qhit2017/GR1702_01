package com.qhit.Week;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 上午9:19:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class SumFor {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println("和为:" + sum);
	}
}
