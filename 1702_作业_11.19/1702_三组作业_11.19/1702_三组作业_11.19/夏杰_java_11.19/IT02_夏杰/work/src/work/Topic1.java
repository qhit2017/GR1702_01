package work;

import java.util.Scanner;

public class Topic1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("������Ϊ������");
		} else if (a < 0) {
			System.out.println("������Ϊ������");
		} else {
			System.out.println("������Ϊ�㡣");
		}
	}
}
