package com.zk.smc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < a.length; j++) {
			System.out.println("������" + (j + 1) + "����");
			a[j] = sc.nextInt();
		}
		ScoreTest scoreTest = new ScoreTest();
		boolean isQuit = true;
		String s;
		scoreTest.help();
		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ������س���");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = scoreTest.getSum(a);
				System.out.println("�ܷ���" + sum);
				break;
			case "Average":
				int Average = scoreTest.getAverage(a);
				System.out.println("ƽ��ֵ��" + Average);
				break;
			case "Max":
				int Max = scoreTest.getMax(a);
				System.out.println("���ֵ��" + Max);
				break;
			case "Info":
				scoreTest.Info(a);
				break;
			case "Min":
				int Min = scoreTest.getMin(a);
				System.out.println("��С��" + Min);
				break;

			case "Sort":
				scoreTest.sort(a);
				break;
			case "Not":
				scoreTest.getNot60(a);
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
