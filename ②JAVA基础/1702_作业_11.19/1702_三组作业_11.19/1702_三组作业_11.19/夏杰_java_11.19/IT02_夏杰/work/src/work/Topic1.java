package work;

import java.util.Scanner;

public class Topic1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("该数字为正数。");
		} else if (a < 0) {
			System.out.println("该数字为负数。");
		} else {
			System.out.println("该数字为零。");
		}
	}
}
