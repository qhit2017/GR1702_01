package work;

import java.util.Scanner;

public class Topic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个小数：");
		double a = sc.nextInt();

		System.out.println("请输入第二个小数：");
		double b = sc.nextInt();

		if (a > b) {
			System.out.println("第一个数大于第二个数。");
		} else {
			System.out.println("第一个数小于第二个数。");
		}

	}

}
