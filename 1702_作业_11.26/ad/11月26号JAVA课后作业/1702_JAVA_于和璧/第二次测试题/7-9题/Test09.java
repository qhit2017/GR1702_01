package com.zk;

import java.util.Scanner;

/**
 * @author 作者 于和璧
 * @date 创建时间：2017年11月26日 下午6:59:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {

	// 编写JAVA程序，输入一个整数N(0<N<=1000)，当N为奇数时，输出1到N之间的奇数和，
	// 当N为偶数时，输出1到N之间的偶数和。

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数N(0<N<=1000)：");
		int N = sc.nextInt();
		int sum = 0;

		int a = 1;
		int b = 1;

		if (N % 2 != 0) {

			while (a <= N) {
				if (a % 2 != 0) {

					sum = sum + a;

				}
				a++;
			}

			System.out.println("1到N之间的奇数和为:" + sum);
		}

		if (N % 2 == 0) {
			while (b <= N) {
				if (b % 2 == 0) {
					sum = sum + b;

				}
				b++;
			}

			System.out.println("1到N之间的偶数和为：" + sum);

		}

		sc.close();
	}

}
