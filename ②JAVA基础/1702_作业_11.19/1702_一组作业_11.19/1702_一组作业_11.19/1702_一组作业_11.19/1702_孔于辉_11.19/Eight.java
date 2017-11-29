package com;

public class Eight {
	public static void main(String[] args) {

		for (int a = 100; a < 1000; a++) {

			if (a % 10 == 6 && a % 3 == 0) {

				System.out.println("个位数是6且能被3整除的3位数是："+a);
			}

		}
	}

}
