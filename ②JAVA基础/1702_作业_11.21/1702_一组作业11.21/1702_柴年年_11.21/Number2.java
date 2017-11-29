package com.qhit.number;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月21日 下午5:07:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Number2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 100; a < 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println(a);
				sum++;
			}
		}
		System.out.println("共有" + sum + "个");
	}
}
