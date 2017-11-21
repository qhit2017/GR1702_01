package com.zk.qhit;

public class Odd {
	public static void main(String[] args) {
		/**
		 * 求1~1000以内所有的奇数
		 */
		System.out.println("1~1000以内所有奇数为：");
		int a = 1;
		while (a <= 1000) {
			System.out.println(a);
			a = a + 2;
		}
	}
}
