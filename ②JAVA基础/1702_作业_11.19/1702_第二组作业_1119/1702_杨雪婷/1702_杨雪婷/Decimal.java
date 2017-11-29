package yangxueting;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		//第二题
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int j = sc.nextInt();
		System.out.println("请输入第二个数：");
		int k = sc.nextInt();

		if (j < k) {
			System.out.println(j + "<" + k);
		}
		if (j > k) {
			System.out.println(j + ">" + k);

		}
		if (j == k) {
			System.out.println(j + "==" + k);
		}
		sc.close();
	}
}
