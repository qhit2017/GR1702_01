package Guo;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		// 通过控制台输入两个小数，判断两个小数是否相等，并输出结果。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数字它们分别是：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println(a + ">" + b);
		}
		if (a == b) {
			System.out.println(a + "=" + b);
		}
		if (a < b) {
			System.out.println(a + "<" + b);
		}
	}

}
