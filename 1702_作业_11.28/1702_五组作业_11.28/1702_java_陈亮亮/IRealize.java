package Sqare;

import java.util.Arrays;

/**
 * 制作者：陈亮亮 制作时间：2017年11月27日下午5:03:55 邮箱：2507147605@qq.com
 */
public class IRealize implements Sharpe {

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("---成绩管理系统---");
		System.out.println("求平均值请输入Average");
		System.out.println("求最大值请输入Max");
		System.out.println("求最小值请输入Min");
		System.out.println("求总分请输入TotalPoints");
		System.out.println("退出请输入Quit");
		System.out.println("浏览各科成绩请输入Info");
		System.out.println("按升序排列成绩请输入Sort");
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
			System.out.println("您输入的个数有误，请重新输入");
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