package guo;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		// �ӿ���̨�������С��,�ж�����С���Ĵ�С����������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��С��:");
		double a = sc.nextDouble();
		System.out.println("������ڶ���С��:");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println("��������a");

		} else {
			System.out.println("��������b");
		}
	}
}