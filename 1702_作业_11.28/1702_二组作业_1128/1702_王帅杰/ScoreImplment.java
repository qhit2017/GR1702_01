package com.qhit;

import java.util.Arrays;

public class ScoreImplment implements Score {

	@Override
	public void help() {
		System.out.println("��������ϵͳ������Ϣ");
		System.out.println("��ƽ����������Average");
		System.out.println("���ܷ�������sum");
		System.out.println("�����ֵ������max");
		System.out.println("����Сֵ������min");
		System.out.println("�󲻼�������������Not60");
		System.out.println("�˳�������Quit");
		System.out.println("������Ƴɼ�������Info");
		System.out.println("���������гɼ�������Sort");
	}

	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}

	@Override
	public int getSum(int[] a) {
		if (a.length > Score.NUMBER) {
			System.out.println("������ĸ�����������������");
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
		// ð�ݷ�����

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
