package com.qhit;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��25�� ����12:17:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test10 {

	public static void main(String[] args) {
		for (int a = 1900; a < 2017; a++) {
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
				System.out.println(a);
			}
		}
	}
}
