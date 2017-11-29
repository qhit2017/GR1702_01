package com.Form;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月26日 下午2:01:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Number {

	public static void main(String[] args) {
		for (int a = 1; a <= 10000; a++) {
			if (a / 1000 == 3 || a / 100 == 3 || a / 10 == 3 || a / 1 == 3) {
				System.out.println(a);
			}
		}
	}
}
