package com.qhit;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:52:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int a = 0; a <= 1000; a++) {
			if (a % 2 != 0) {
				sum += a;
			} else if (a % 2 == 0) {
				sum2 += a;
			}
		}
		System.out.println("����" + sum);
		System.out.println("ż��" + sum2);
	}
}
