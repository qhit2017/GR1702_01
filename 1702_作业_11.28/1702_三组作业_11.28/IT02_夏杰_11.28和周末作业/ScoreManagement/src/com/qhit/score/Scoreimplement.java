package com.qhit.score;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Scoreimplement implements Score {

	@Override
	public void getHelp(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("-----分数管理系统帮助信息-----");
		System.out.println("①求分数和请输入：sum");
		System.out.println("②求分数平均数请输入：average");
		System.out.println("③求分数最大值请输入：max");
		System.out.println("④求分数最小值请输入：min");
		System.out.println("⑤求不及格人数请输入：not60");
		System.out.println("⑥浏览各科成绩请输入：info");
		System.out.println("⑦查看升序排列成绩请输入：sort");

	}

	@Override
	public void getInfo(int[] a) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));

	}

	@Override
	public int getSum(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	@Override
	public int getAverage(int[] a) {
		// TODO Auto-generated method stub
		return getSum(a) / a.length;
	}

	@Override
	public int getMax(int[] a) {
		// TODO Auto-generated method stub
		int Max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Max) {
				Max = a[i];

			}
		}
		return Max;
	}

	@Override
	public int getMin(int[] a) {
		// TODO Auto-generated method stub
		int Min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < Min) {
				Min = a[i];
			}
		}
		return Min;
	}

	@Override
	public int getOut60(int[] a) {
		// TODO Auto-generated method stub
		int p = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				p++;
			}
		}
		return p;
	}

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		boolean isSort;
		for (int i = 0; i < a.length - 1; i++) {
			isSort = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
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

}
