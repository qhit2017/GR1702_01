package xiaxiaoyu;

import java.util.Scanner;

public class D9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数N(N<10000)");
		int N = sc.nextInt();
		if (N <= 10000) {
			for (int a = 1; a <= N; a++) {
				if ((a % 7 == 0)&& ((a % 10 == 7) || (a / 10 % 10 == 7)|| (a / 100 % 10 == 7) || (a / 10000 == 7))) {
					System.out.println(a);
				}
			}
		}
	}
}
