package com.zk.qhit;

public class Sum {

	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while (a <= 10) {
			sum += a;

			if (sum > 20) {
				System.out.println(a);
				break;
			}
			a++;
		}

	}
}
