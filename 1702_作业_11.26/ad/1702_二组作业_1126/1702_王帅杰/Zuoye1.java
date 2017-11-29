package Com.qhit;

import java.util.Scanner;

public class Zuoye1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == b) {
			System.out.println("两小数相等");
		} else if (a != b) {
			System.out.println("两小数不相等");
		}

		sc.close();

	}
}
