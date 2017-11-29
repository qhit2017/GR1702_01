package com.qhit;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 下午7:46:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test07 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 1000) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println(a);				
			}
			a++;
		}
	}
}
