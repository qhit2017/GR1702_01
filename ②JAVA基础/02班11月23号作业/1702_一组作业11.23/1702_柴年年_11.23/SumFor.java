package com.qhit.Week;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����9:19:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class SumFor {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println("��Ϊ:" + sum);
	}
}
