package shape01;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int a = sc.nextInt();
		if (a > 0 && a < 1000) {
			System.out.println("������ʮλ��" + a / 10 % 10);
		}
		sc.close();
	}
}
