package com.qhit.score;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Scoreimplement implements Score {

	@Override
	public void getHelp(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("-----��������ϵͳ������Ϣ-----");
		System.out.println("��������������룺sum");
		System.out.println("�������ƽ���������룺average");
		System.out.println("����������ֵ�����룺max");
		System.out.println("���������Сֵ�����룺min");
		System.out.println("���󲻼������������룺not60");
		System.out.println("��������Ƴɼ������룺info");
		System.out.println("�߲鿴�������гɼ������룺sort");

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
