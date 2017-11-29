package shape01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的数字");
		int a = sc.nextInt();
		if (a > 0 && a < 1000) {
			System.out.println("该数的十位是" + a / 10 % 10);
		}
		sc.close();
	}
}
