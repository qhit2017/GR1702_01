package com.zk.qhit;

public class MultiplicaTion {
	public static void main(String[] args) {
		/**
		 * �žų˷��ھ���
		 */
		int a = 1;
		do {
			int b = 1;
			do {
				System.out.print(b + "*" + a + "=" + b * a + "\t");
				b++;
			} while (b <= a);
			a++;
			System.out.println();

		} while (a <= 9);
	}
}
