package guo;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// 通过一个控制台输入一个整数N(N不大于10000)输出所有7的倍数包括7的数字。
		Scanner sc = new Scanner(System.in);

		for (int a = 7; a < 10000; a++) {

			if (a % 7 == 0) {

				System.out.println(a);
			}
		}

	}
}