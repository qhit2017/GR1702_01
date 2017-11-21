package com.test;

//作业四；
//作者：梁营营；
public class Sum {
	public static void main(String[] args) {
		// 求1000以内所有8的倍数之和；
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {

			if (i % 8 == 0) {

				sum = sum + i;

			}

		}
		System.out.println("1000以内所有8的倍数之和是："+sum);
	}
}
