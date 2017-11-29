package com.qhit.number;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月21日 下午5:02:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Number {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a != b) {
					System.out.println(a + "" + b);
				}
			}
		}
	}
}
