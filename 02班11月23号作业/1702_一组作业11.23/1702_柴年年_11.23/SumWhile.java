package com.qhit.Week;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����9:25:42
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class SumWhile {

	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			if (a % 2 != 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("��Ϊ" + sum);

	}
}
