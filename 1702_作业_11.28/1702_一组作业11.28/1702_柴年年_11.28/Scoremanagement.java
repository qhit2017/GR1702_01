package com.qhit.score;

import java.util.Arrays;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月27日 下午4:28:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Scoremanagement implements Score {

	@Override
	public void help() {
		System.out.println("---成绩管理信息帮助---");
		System.out.println("【0】平均分请输入average");
		System.out.println("【1】求总分请输入sum");
		System.out.println("【2】求最大值请输入max");
		System.out.println("【3】求最小值请输入min");
		System.out.println("【4】求不及格人数请输入not");
		System.out.println("【5】退出请输入Quit");
		System.out.println("【6】浏览各科成绩请输入info");
		System.out.println("【7】按升序排列成绩请输入sort");
	}

	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}

	@Override
	public int getSum(int[] a) {
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
		System.out.println("最大值是:" + max);
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[0]) {
				min = a[0];
			}
		}
		System.out.println("最小值是:" + min);
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		System.out.println("不及格的有:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		return 0;
	}

	@Override
	public void info(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int[] sort(int[] a) {
		// 按升序排列
		boolean isScort;
		int temp;
		for (int j = 0; j < a.length - 1; j++) {
			isScort = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isScort = false;
				}
			}
			if (isScort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		return a;
	}

}
