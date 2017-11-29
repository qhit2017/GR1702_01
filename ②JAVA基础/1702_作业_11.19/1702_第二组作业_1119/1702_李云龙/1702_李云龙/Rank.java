package com.zk.qhit;

public class Rank {
	public static void main(String[] args) {
		/**
		 * 从1,2,3,4,5这五个数任意取出两个数,列出所有组合
		 */
		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a <= 5; a++) {
				if (i != a) {
					System.out.println(i +" " +a);
				}
			}
		}
	}
}
