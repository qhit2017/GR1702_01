package com.qhit;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ScoreImplment scoreImplment = new ScoreImplment();
		int[] a = { 50, 60, 70, 80, 90 };
		Scanner sc = new Scanner(System.in);

		boolean isQuit = true;
		String s;
		scoreImplment.help();
		while (isQuit) {
			s = sc.next();

			switch (s) {
			case "sum":
				int sum = scoreImplment.getSum(a);
				System.out.println("�ܷ���" + sum);
				break;
			case "Average":
				int average = scoreImplment.getAverage(a);
				System.out.println("��ƽ������" + average);
				break;
			case "max":
				int max = scoreImplment.getMax(a);
				System.out.println("���ֵ��" + max);
				break;
			case "min":
				int min = scoreImplment.getMin(a);
				System.out.println("��Сֵ��" + min);
				break;

			case "Info":
				scoreImplment.info(a);

				break;

			case "Sort":
				scoreImplment.sort(a);

				break;
			case "Not60":
				int Not60 = scoreImplment.getNot60(a);
				System.out.println("����������" + Not60);
				break;

			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("�ݰ�");
		sc.close();
	}

}
