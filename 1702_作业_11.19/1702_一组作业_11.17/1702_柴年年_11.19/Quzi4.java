package com.qhit.Work;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月18日 下午1:26:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi4 {

	public static void main(String[] args) {
		int b = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				b = b + a;
			}
		}
		System.out.println("八的倍数之和为:" + b);
	}
}
