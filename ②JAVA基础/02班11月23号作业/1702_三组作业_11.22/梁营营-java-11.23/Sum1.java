package com.test;
//作业五；
//作者：梁营营；
public class Sum1 {

	public static void main(String[] args) {
		// 用while方法计算1~100之间奇数的和
		int i = 1;
		int sum = 0;
		while (i < 100) {
			if (i % 2 != 0) {
				sum = sum + i;

			}

			i++;
		}
		System.out.println(sum);
	}
}
