package com.test;

//作业五；
//作者：梁营营；
public class Consult {
	public static void main(String[] args) {
		// 求1000以内既能被5整除，又能被3整除的所有整数，并打印出来。（使用do while循环）
		int i = 1;
		do {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;

		} while (i <= 1000);
	}
}
