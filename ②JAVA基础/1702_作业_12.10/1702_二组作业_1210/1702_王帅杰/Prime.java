package com.qhit;

public class Prime {
	public static void main(String[] args) {
		/*
		 * for (int i = 101; i <= 200; i++) { for (int j = 2; j < i / 2; j++) {
		 * if (i % j == 0) { break; } if (j == i / 2 - 1) {
		 * System.out.println(i); } } }
		 * 
		 * }
		 */
		int count = 0;
		for (int i = 101; i < 200; i += 2) {
			boolean a = false;
			for (int j = 2; j < Math.sqrt(i); j++) {
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
		System.out.println("101~200之间的素数共有" + count + "个");
	}

}
