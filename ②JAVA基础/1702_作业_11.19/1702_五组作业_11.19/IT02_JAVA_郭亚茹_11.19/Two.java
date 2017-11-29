package guo;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		// 从控制台输出两个小数,判断两个小数的大小并输出结果。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个小数:");
		double a = sc.nextDouble();
		System.out.println("请输入第二个小数:");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println("输出结果：a");

		} else {
			System.out.println("输出结果：b");
		}
	}
}