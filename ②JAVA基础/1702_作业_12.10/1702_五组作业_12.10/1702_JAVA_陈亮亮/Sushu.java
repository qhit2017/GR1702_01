package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��12��10������8:14:14
 *���䣺2507147605@qq.com
 */
public class Sushu {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 101; i <= 200; i++) {
			boolean a = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a = false;
					break;
				}
			}
			if (a) {
				sum++;
				System.out.println(i);
			}
		}
		System.out.println("һ����" + sum + "������");
	}

}
