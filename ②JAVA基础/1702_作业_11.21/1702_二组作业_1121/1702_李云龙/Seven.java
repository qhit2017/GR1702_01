package com.zk.qhit;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输出一个数：");
		int a = sc.nextInt();

		for (int a1 = 1; a1 < a; a1++) {

			if (a1 % 7 == 0 || a1 % 10 == 7 || a1 % 100 == 7 || a1 % 1000 == 7) {

				System.out.println(a1);

			}

		}
		sc.close();
	}

}
