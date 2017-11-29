package com.test;

//作业十；
//作者：梁营营；
public class Haskell {
	public static void main(String[] args) {
		// 输出乘法口诀表。（使用white循环实现）；
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
