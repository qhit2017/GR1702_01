package xiaxiaoyu;

import java.util.Scanner;

public class D1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		if (a > 0) {

			System.out.println(a + "为正数");
		} else if (a == 0) {
			System.out.println("0");
		} else {
			System.out.println(a + "为负数");
		}

	}
}
