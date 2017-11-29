/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月27日 下午4:26:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.score;

import java.util.Arrays;

public class ScorePractice implements Score {

	private static final String Sum = null;

	@Override
	public void help() {
		System.out.println("--------成绩管理系统--------");
		System.out.println("【1】求平均值请输入Mean");
		System.out.println("【2】求总成绩请输入Sum");
		System.out.println("【3】求最大值请输入Max");
		System.out.println("【4】求最小值请输入Min");
		System.out.println("【5】求不及格人数请输入Not");
		System.out.println("【6】成绩排列请输入Sort");
		System.out.println("【7】退出程序请输入Qure");

	}

	@Override
	public double getMean(double[] a) {

		return getSum(a) / a.length;
	}

	@Override
	public double getMax(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			}
		}
		return max;
	}

	@Override
	public double getMin(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}
		}
		return min;
	}

	@Override
	public double getSum(double[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	@Override
	public int Not60(double[] a) {
		int not = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				not++;
			}
		}
		return not;
	}

	@Override
	public double[] sort(double[] a) {
		boolean isSort;
		double temp;
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
}
