package yangxueting;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		//�ڶ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int j = sc.nextInt();
		System.out.println("������ڶ�������");
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
