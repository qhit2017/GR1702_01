package work;

import java.util.Scanner;

public class Topic9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入1来执行程序。");

		int i = sc.nextInt();

		for (int a = 1; a <= 10000; a++) {
			if (a / 1000 == 7) {
				System.out.println(a);
			} else if (a / 100 % 10 == 7) {
				System.out.println(a);
			} else if (a / 10 % 10 == 7) {
				System.out.println(a);
			} else if (a % 10 == 7) {
				System.out.println(a);
			} else if (a % 7 == 0) {
				System.out.println(a);
			}
		}
	}

}
