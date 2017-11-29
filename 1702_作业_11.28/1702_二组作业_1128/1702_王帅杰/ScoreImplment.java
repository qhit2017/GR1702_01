package com.qhit;

import java.util.Arrays;

public class ScoreImplment implements Score {

	@Override
	public void help() {
		System.out.println("分数管理系统帮助信息");
		System.out.println("求平均分请输入Average");
		System.out.println("求总分请输入sum");
		System.out.println("求最大值请输入max");
		System.out.println("求最小值请输入min");
		System.out.println("求不及格人数请输入Not60");
		System.out.println("退出请输入Quit");
		System.out.println("浏览各科成绩请输入Info");
		System.out.println("按升序排列成绩请输入Sort");
	}

	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}

	@Override
	public int getSum(int[] a) {
		if (a.length > Score.NUMBER) {
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		int l = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				l++;
			}
		}
		System.out.println(l);
		return l;
	}

	@Override
	public int[] sort(int[] a) {
		// 冒泡法排序

		boolean isSort;
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
		}
		System.out.println(Arrays.toString(a));

		return a;
	}

	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));

	}

}
