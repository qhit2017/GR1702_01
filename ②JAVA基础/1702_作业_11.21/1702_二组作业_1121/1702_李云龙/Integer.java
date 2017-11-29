package com.zk.qhit;

public class Integer {

	public static void main(String[] args) {

		int a;
		int b = 0;
		System.out.println("个位数为6且能被3整除的数为：");
		for (a = 100; a < 1000; a++) {
			if (a % 3 == 0 && a % 10 == 0) {
				System.out.print(a + "、");
				b++;
			}
		}
		System.out.println();
		System.out.println("个位数为6且能被3整除的数共有" + b + "个");
	}
}
