package com.qhit.number;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��21�� ����5:05:53
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
