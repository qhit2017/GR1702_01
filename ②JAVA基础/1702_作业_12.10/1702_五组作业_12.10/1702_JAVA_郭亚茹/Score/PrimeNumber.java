package com.Score;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// �ж�101-200֮���ж��ٸ����������������������
		int count = 0;
		boolean a = false;
		for (int i = 101; i < 200; i += 2) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					a = false;
					break;
				} else {
					a = true;
				}
			}
			if (a == true) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("�����ĸ����ǣ�" + count);
	}
}
