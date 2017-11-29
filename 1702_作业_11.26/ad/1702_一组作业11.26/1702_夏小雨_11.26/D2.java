package xiaxiaoyu;

import java.util.Scanner;

public class D2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int a = sc.nextInt();

		if (a < 100 || a > 999) {
			System.out.println("你输入的有误，请输入一个三位数");
		} else {
			System.out.println(a / 10 % 10);
		}

	}
}
