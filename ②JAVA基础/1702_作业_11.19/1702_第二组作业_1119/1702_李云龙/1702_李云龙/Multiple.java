package com.zk.qhit;

public class Multiple {
	public static void main(String[] args) {
		/**
		 * ��1000��������8�ı���֮��
		 */
		int a = 1;
		int sum = 0;
		while (a <= 1000) {
			if (a % 8 == 0) {
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
