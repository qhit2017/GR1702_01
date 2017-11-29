package com.kyh;

public class Four {
	public static void main(String[] args) {

		for (int a = 0; a < 10000; a++) {
			if (a < 10 && a % 10 == 3) {
				System.out.println(a);
			} else if (a > 10 && a < 100 && a / 10 % 10 == 3) {
				System.out.println(a);
			} else if (a > 100 && a < 1000 && a / 100 == 3) {
				System.out.println(a);
			} else if (a > 1000 && a < 10000 && a / 1000 == 3) {
				System.out.println(a);
			}
		}

	}

}
