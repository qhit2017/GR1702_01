package yangxueting;

import java.util.Scanner;

public class PositiveMinus {
	public static void main(String[] args) {
		//第一题
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数值：");
		int h = sc.nextInt();
		System.out.println("输入的数是：" + h);
		if (h > 0) {
			System.out.println("输入的数是正数");
		}
		if (h < 0) {
			System.out.println("输入的数是负数");
		}
		if (h == 0) {
			System.out.println("非正非负的数");
		}
		sc.close();
	}
}
