package guo;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		// 从控制台输入一个数字,判断该数字是正数还是负数,并输出结果.
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数：");

		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("它是正数");
		}
		if (a < 0) {
			System.out.println("它是负数");
		}
	}
}