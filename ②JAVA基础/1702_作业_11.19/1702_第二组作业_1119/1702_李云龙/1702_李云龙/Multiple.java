package com.zk.qhit;

public class Multiple {
	public static void main(String[] args) {
		/**
		 * 求1000以内所有8的倍数之和
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
