package com.zk.qhit;

public class Sum {
	public static void main(String[] args) {
		/**
		 * 1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ����
		 */
		int a = 1;
		int sum = 0;
		while (a <= 10) {
			sum += a;
			a++;
			if (sum >= 20) {
				System.out.println(sum);
				break;
			}
		}
	}
}
