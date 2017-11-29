package com.test;

//作业六；
//作者：梁营营；
public class Accumulation {
	public static void main(String[] args) {
		// 1~10之间的整数相加，得到累加值大于20的当前数字，将该数字输出。
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum = sum + i;
			
			if (sum > 20) {
				System.out.println("当加到"+i+"时");
				System.out.println("此时的累加值为"+sum);
				break;
			}
			i++;
		}

	}
}
