package chenjuniy;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		System.out.println("三、判断考试成绩等级。\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数表示成绩:");
		int a = sc.nextInt();
		if (a >= 90) {
			System.out.println("您的成绩是" + a + ",判定为 A");
		} else if (a >= 60 & a < 90) {
			System.out.println("您的成绩是" + a + ",判定为 B");
		} else if (a < 60) {
			System.out.println("您的成绩是" + a + ",判定为 C");
		}
		sc.close();

	}
}
