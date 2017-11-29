package com.test;

//作业八；
//作者：梁营营；
public class Consult {
	public static void main(String[] args) {
		// 求个位数为6且能被3整除的3位整数共有多少？
		int number = 0;
		for (int a = 100; a <= 999; a++) {
			if (a % 3 == 10 || a % 10 == 6) {
				System.out.println("个位数为6且能被3整除的3位整有：" + a);
				number++;
			}
		}
		System.out.println("共有：" + number++ + "个");

	}
}
