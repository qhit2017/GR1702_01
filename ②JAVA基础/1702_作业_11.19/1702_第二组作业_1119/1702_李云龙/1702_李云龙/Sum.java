package com.zk.qhit;

public class Sum {
	public static void main(String[] args) {
		/**
		 * 1至10之间的整数相加，得到累加值大于20的当前数字
		 */
		int a = 1;
		int sum = 0;
		while (a <= 10) {
			sum += a;
			a++;
			if (sum >= 20) {
				System.out.println(sum);
				break;
			}
		}
	}
}
