package com.qhit.score;

import java.util.Arrays;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����4:28:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Scoremanagement implements Score {

	@Override
	public void help() {
		System.out.println("---�ɼ�������Ϣ����---");
		System.out.println("��0��ƽ����������average");
		System.out.println("��1�����ܷ�������sum");
		System.out.println("��2�������ֵ������max");
		System.out.println("��3������Сֵ������min");
		System.out.println("��4���󲻼�������������not");
		System.out.println("��5���˳�������Quit");
		System.out.println("��6��������Ƴɼ�������info");
		System.out.println("��7�����������гɼ�������sort");
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
		System.out.println("���ֵ��:" + max);
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
		System.out.println("��Сֵ��:" + min);
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		System.out.println("���������:");
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
		// ����������
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
