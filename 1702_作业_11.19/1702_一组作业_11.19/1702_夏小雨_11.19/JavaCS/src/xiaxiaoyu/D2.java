package xiaxiaoyu;

import java.util.Scanner;

public class D2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个数比大小");
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		if (a > b) {
			System.out.println(a + "大" + b + "小");
		}
		if (a < b) {
			System.out.println(a + "小" + b + "大");
		}
		if (a == b) {
			System.out.println("两数一样大");
		}
	}
}