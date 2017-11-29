package kk;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于10000的整数:");
		int n = sc.nextInt();

		for (int s = 1; s < n; s++) {
			if (s % 7 == 0 || s / 1000 == 7 || s / 1000 % 10 == 7
					|| s / 10 % 10 == 7 || s / 10 == 7) {

			}
			System.out.println(s);

		}
	sc.close();
	}

}
