package xiaxiaoyu;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		// 判断一个五位数是否是回文数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int a = sc.nextInt();

		if (a % 10000 == a % 10 || a / 1000 % 10 == a / 10 % 10) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}
	}
}
