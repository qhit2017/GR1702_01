/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��27�� ����4:26:41 
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
		System.out.println("--------�ɼ�����ϵͳ--------");
		System.out.println("��1����ƽ��ֵ������Mean");
		System.out.println("��2�����ܳɼ�������Sum");
		System.out.println("��3�������ֵ������Max");
		System.out.println("��4������Сֵ������Min");
		System.out.println("��5���󲻼�������������Not");
		System.out.println("��6���ɼ�����������Sort");
		System.out.println("��7���˳�����������Qure");

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
