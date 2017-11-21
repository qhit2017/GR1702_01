package com.qhit.number;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月21日 下午5:05:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Number1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum > 20) {
				System.out.println(a);
				break;
			}
		}
	}
}
