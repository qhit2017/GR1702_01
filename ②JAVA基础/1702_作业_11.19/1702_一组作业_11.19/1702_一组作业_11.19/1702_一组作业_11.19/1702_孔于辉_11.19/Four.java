package com;

public class Four {
	public static void main(String[] args) {

		int sum = 0;

		for (int a = 1; a < 1000; a++) {

			if (a % 8 == 0) {
				sum += a;
			}

		}
		System.out.println("1000以内所有8的倍数和是：" + sum);
	}

}
