package test;

import java.util.Arrays;

public class ScoreImplements implements Score {

	@Override
	public void help() {
		System.out.println("---��������ϵͳ������Ϣ---");
		System.out.println("��0����ƽ����������Average");
		System.out.println("��1�����ܷ�������Sum");
		System.out.println("��2�������ֵ������Max");
		System.out.println("��3������Сֵ������Min");
		System.out.println("��4���󲻼�������������Not");
		System.out.println("��5���鿴���гɼ�������Info");
		System.out.println("��6������������Sort");
		System.out.println("��7���˳�������Quit");
	}

	@Override
	public int getAverage(int[] a) {
		int Average = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			Average = sum / a.length;
		}
		return Average;
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
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 60) {
				System.out.println(a[i]);
			}
		}
		return 0;

	}

	@Override
	public void Info(int[] a) {
		System.out.println(Arrays.toString(a));

	}

	@Override
	public int[] Sort(int[] a) {
		boolean isSort;
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			isSort = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
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
