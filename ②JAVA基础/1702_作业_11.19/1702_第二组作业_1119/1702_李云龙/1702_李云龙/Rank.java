package com.zk.qhit;

public class Rank {
	public static void main(String[] args) {
		/**
		 * ��1,2,3,4,5�����������ȡ��������,�г��������
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
