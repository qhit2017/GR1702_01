package kyh;

import java.util.Arrays;

public class ScoreImplment implements Sore {

	@Override
	public void help() {
		System.out.println("-------学生成绩信息管理系统-------");
		System.out.println("【1】求平均值请输入Average");
		System.out.println("【2】求总分请输入Sum");
		System.out.println("【3】求最大值请输入Max");
		System.out.println("【4】求最小值请输入Min");
		System.out.println("【5】求不及格人数请输入Not60");
		System.out.println("【6】浏览成绩请输入Info");
		System.out.println("【7】按升序排列成绩请输sort");
		System.out.println("【8】退出请输入isQuit");
	}

	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");

		}

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
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < 60) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int[] sort(int[] a) {
		boolean issort;
		int tempe;
		for (int i = 0; i < a.length - 1; i++) {
			issort = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					tempe = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tempe;
					issort = false;
				}

			}
			if (issort) {
				break;

			}
			System.out.println(Arrays.toString(a));
		}

		return a;
	}

}
