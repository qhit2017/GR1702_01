package chenjunyi;

import java.util.Scanner;

public class One {
	// 通过控制输入一个数字，判断该数字是正数还是负数，并输出结果！
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a = Sc.nextInt();
		if (a > 0) {
			System.out.println(a + "是正数");
		} else if (a < 0) {
			System.out.println(a + "是负数");
		}

	}
}
