package work;

import java.util.Scanner;

public class Topic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ��С����");
		double a = sc.nextInt();

		System.out.println("������ڶ���С����");
		double b = sc.nextInt();

		if (a > b) {
			System.out.println("��һ�������ڵڶ�������");
		} else {
			System.out.println("��һ����С�ڵڶ�������");
		}

	}

}
