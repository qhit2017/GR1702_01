package com.kyh;

public class Prime {

	public static void main(String[] args) {
		boolean as ;
		int b = 0;
		for (int i =101; i < 200; i++) {
			as = true;
			for (int j = 2; j < i; j++) {
				if (0==i%j) {
					as = false;
					b++;
					break;
				}
			}
			if (as) {
				System.out.println("�����ǣ�"+i);
			}
		}
		System.out.println("�������У�"+b+"��");
	}
}
