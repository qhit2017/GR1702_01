package com.zk.smc;

import java.util.Arrays;

public class ScoreTest implements score {
	public void help() {
		System.out.println("---分数管理系统帮助---");
		System.out.println("[0]求和Sum");
		System.out.println("[1]求平均值Average");
		System.out.println("[2]求最大值Max");
		System.out.println("[3]求最小值Min");
		System.out.println("[4]求不及格人数请输入Not");
		System.out.println("[5]按升序排列成绩请输入Sort");
		System.out.println("[6]浏览各科成绩请输入Info");
		System.out.println("[7]退出请输入Quit");
	}

	public void Info(int[] a) {
		System.out.println(Arrays.toString(a));

	}

	public int getSum(int[] a) {
		if (a.length > ScoreTest.NUMBER) {
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		return sum;
	}

	public int getAverage(int[] a) {
		return getSum(a) / a.length;
	}

	public int getMax(int[] a) {
		int Max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Max) {
				Max = a[i];
			}
		}
		return Max;

	}

	public int getMin(int[] a) {
		int Min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < Min) {
				Min = a[i];
			}
		}
		return Min;
	}

	public int getNot60(int[] a) {
		int n = 0;
		System.out.println("不及格的人数");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				System.out.println(a[i] + " ");
				n++;
			}
		}
		return n;
	}

	public int[] sort(int[] a) {
		boolean isSort = false;
		int temp;
		for (int j = 0; j < a.length - 1; j++) {
			isSort = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSort = false;
				}
			}

			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		int b[] = a;
		return b;
	}
}
