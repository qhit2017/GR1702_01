package com.qhit.number;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��21�� ����5:02:53
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
