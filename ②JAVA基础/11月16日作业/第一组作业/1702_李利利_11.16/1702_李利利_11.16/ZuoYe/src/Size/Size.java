package Size;

import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�����һ������:");
		int a = sc.nextInt();

		System.out.println("����ڶ�������:");
		int b = sc.nextInt();

		System.out.println("�������������:");
		int c = sc.nextInt();

		System.out.println("������ĸ�����:");
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
			System.out.println("4�������Ӵ�С��˳�����������:" + d + ">" + c + ">" + b
					+ ">" + a);
		}
	}
}
