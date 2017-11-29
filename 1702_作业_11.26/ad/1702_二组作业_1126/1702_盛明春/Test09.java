package shape01;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄÊý×Ö");
		int N = sc.nextInt();
		if (N > 0 && N <= 1000) {
			if (N % 2 != 0) {
				int sum = 0;
				for (int a = 1; a < N; a++) {
					if (a % 2 != 0) {
						sum += a;
					}
				}
				System.out.println(sum);
			} else {
				int sum1 = 0;
				for (int b = 1; b < N; b++) {
					if (b % 2 == 0) {
						sum1 += b;
					}
				}
				System.out.println(sum1);
			}
		}
		sc.close();
	}
}
