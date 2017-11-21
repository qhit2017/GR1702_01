package com.zk.qhit;

public class MultiplicationTable {
	public static void main(String[] args) {
		int a = 1;
		while (a < 10) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
