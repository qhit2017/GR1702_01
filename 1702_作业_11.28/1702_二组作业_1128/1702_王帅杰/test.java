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
				System.out.println("总分是" + sum);
				break;
			case "Average":
				int average = scoreImplment.getAverage(a);
				System.out.println("求平均分是" + average);
				break;
			case "max":
				int max = scoreImplment.getMax(a);
				System.out.println("最大值是" + max);
				break;
			case "min":
				int min = scoreImplment.getMin(a);
				System.out.println("最小值是" + min);
				break;

			case "Info":
				scoreImplment.info(a);

				break;

			case "Sort":
				scoreImplment.sort(a);

				break;
			case "Not60":
				int Not60 = scoreImplment.getNot60(a);
				System.out.println("不及格人数" + Not60);
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
