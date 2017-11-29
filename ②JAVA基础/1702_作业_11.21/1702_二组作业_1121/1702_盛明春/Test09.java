package zuoye2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÊı×Ö");
		int N = sc.nextInt();
		if (N <= 10000) {
			for (int a = 1; a < N; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 % 10 == 7
						|| a / 10 % 10 == 7 || a % 10 == 7) {
					System.out.println(a);
				}
			}
		}
		sc.close();
	}
}
