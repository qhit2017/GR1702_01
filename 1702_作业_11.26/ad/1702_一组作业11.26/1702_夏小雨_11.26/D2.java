package xiaxiaoyu;

import java.util.Scanner;

public class D2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a = sc.nextInt();

		if (a < 100 || a > 999) {
			System.out.println("�����������������һ����λ��");
		} else {
			System.out.println(a / 10 % 10);
		}

	}
}
