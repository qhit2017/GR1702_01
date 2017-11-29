package com.zk.smc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < a.length; j++) {
			System.out.println("请输入" + (j + 1) + "个数");
			a[j] = sc.nextInt();
		}
		ScoreTest scoreTest = new ScoreTest();
		boolean isQuit = true;
		String s;
		scoreTest.help();
		while (isQuit) {
			System.out.println("请输入你要执行的指令，并按回车键");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = scoreTest.getSum(a);
				System.out.println("总分是" + sum);
				break;
			case "Average":
				int Average = scoreTest.getAverage(a);
				System.out.println("平均值是" + Average);
				break;
			case "Max":
				int Max = scoreTest.getMax(a);
				System.out.println("最大值是" + Max);
				break;
			case "Info":
				scoreTest.Info(a);
				break;
			case "Min":
				int Min = scoreTest.getMin(a);
				System.out.println("最小是" + Min);
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
		System.out.println("拜拜");
		sc.close();
	}
}
