package com.qhit;

public class shu {
	public static void main(String[] args) {
		for (int i = 3; i <= 10000; i++) {
			if (i / 1000 == 3 || i / 100 == 3 || i / 10 == 3 || i / 1 == 3) {
				System.out.println(i);
			}

		}

	}
}
