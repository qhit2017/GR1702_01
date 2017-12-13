package com.test;

public class Test003 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10000; i < 100000; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				sum++;
			}
		}
		System.out.println("个位数为6且能被3整除的五位数共有" + sum + "个");
	}

}
