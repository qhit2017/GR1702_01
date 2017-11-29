package com.zk;

public class Tset5 {
	
	public static void main(String[] args) {
		
		int a = 0;
		for (int b = 1; b <= 100; b++) {
			if (b % 2 != 0) {
				a += b;
			}
		}
		System.out.println("for循环为：" + a);
		int c = 0;
		int d = 1;
		while (d <= 100) {

			if (d % 2 != 0) {
				c += d;

			}

			d++;
		}
		System.out.println("while循环为：" + c);
	}

}
