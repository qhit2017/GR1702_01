package Guo;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		// ͨ������̨��������С�����ж�����С���Ƿ���ȣ�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������������Ƿֱ��ǣ�");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println(a + ">" + b);
		}
		if (a == b) {
			System.out.println(a + "=" + b);
		}
		if (a < b) {
			System.out.println(a + "<" + b);
		}
	}

}
