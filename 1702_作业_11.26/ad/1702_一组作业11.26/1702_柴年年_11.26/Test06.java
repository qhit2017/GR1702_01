package com.qhit;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 下午7:41:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 8; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum++;
			}
		}
		System.out.println("八的倍数有"+sum+"个");
	}
}
