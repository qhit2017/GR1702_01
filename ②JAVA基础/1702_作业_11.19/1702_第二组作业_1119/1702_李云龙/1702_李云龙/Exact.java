package com.zk.qhit;

public class Exact {
	public static void main(String[] args) {
		/**
		 * 求1000以为，既能被5整除，又能被3整除
		 * 的所有整数
		 */
		int a = 1;
		do{if(a % 5 == 0 && a % 3 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 1000);

	}
}
