package Sqare;

import java.util.Arrays;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��27������5:03:55 ���䣺2507147605@qq.com
 */
public class IRealize implements Sharpe {

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("---�ɼ�����ϵͳ---");
		System.out.println("��ƽ��ֵ������Average");
		System.out.println("�����ֵ������Max");
		System.out.println("����Сֵ������Min");
		System.out.println("���ܷ�������TotalPoints");
		System.out.println("�˳�������Quit");
		System.out.println("������Ƴɼ�������Info");
		System.out.println("���������гɼ�������Sort");
	}

	@Override
	public int getAverage(int[] a) {
		// TODO Auto-generated method stub
		return getsum(a) / a.length;
	}

	@Override
	public int getsum(int[] a) {
		// TODO Auto-generated method stub
		if (a.length > Sharpe.NUMBER) {
			System.out.println("������ĸ�����������������");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum;
	}

	@Override
	public int getMin(int[] a) {
		int Min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < Min) {
				Min = a[i];
			}

		}
		return Min;
	}

	@Override
	public int getMax(int[] a) {
		int Max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Max) {
				Max = a[i];
			}
		}
		return Max;
	}

	@Override
	public int getNot60(int[] a) {
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
		int temp;
		boolean isSort;
		for (int i = 0; i < a.length; i++) {
			isSort = true;
			for (int j = 0; j < a.length; j++) {
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
		return null;
	}

	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}