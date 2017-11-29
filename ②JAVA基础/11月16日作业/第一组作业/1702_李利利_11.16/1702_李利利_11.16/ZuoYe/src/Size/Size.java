package Size;

import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("输入第一个整数:");
		int a = sc.nextInt();

		System.out.println("输入第二个整数:");
		int b = sc.nextInt();

		System.out.println("输入第三个整数:");
		int c = sc.nextInt();

		System.out.println("输入第四个整数:");
		int d = sc.nextInt();

		int o = 0;
		if (a != 0 || b != 0 || c != 0 || d != 0) {

			if (a > b) {
				o = a;
				a = b;
				b = o;
			}
			if (a > c) {
				o = a;
				a = c;
				c = o;
			}
			if (a > d) {
				o = a;
				a = d;
				d = o;
			}
			if (b > c) {
				o = b;
				b = c;
				c = o;
			}
			if (b > d) {
				o = b;
				b = d;
				d = o;
			}
			if (c > d) {
				o = c;
				c = d;
				d = o;
			}
			System.out.println("4个整数从大到小的顺序排列输出是:" + d + ">" + c + ">" + b
					+ ">" + a);
		}
	}
}
