package guo;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		// �ӿ���̨����һ������,�жϸ��������������Ǹ���,��������.
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������");

		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("��������");
		}
		if (a < 0) {
			System.out.println("���Ǹ���");
		}
	}
}