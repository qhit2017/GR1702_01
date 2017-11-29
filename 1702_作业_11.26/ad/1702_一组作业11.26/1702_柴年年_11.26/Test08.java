package com.qhit;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 下午7:50:40
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test08 {

	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println(a);
			}
		}
	}
}
