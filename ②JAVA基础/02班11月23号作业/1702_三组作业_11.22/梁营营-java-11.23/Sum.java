package com.test;
//作业五：
//作者：梁营营；
public class Sum {

	public static void main(String[] args) {
		// 用for方法计算1~100之间奇数的和
		int sum = 0;
		for (int i = 1; i < 100; i++) {

			if (i % 2 != 0) {
				sum = sum + i;

			}
		}
		System.out.println(sum);
	}
}
