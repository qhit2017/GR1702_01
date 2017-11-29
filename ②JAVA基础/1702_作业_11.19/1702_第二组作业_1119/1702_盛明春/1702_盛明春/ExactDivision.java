package com.zk.qhit;

public class ExactDivision {
	public static void main(String[] args) {
		int b = 0;
		for (int a = 100; a < 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println(a);
				b++;
			}
		}
		System.out.println(b);
	}
}
