package com.zk.smc;

public interface score {
	public static final int NUMBER = 10;

	void help();

	void Info(int[] a);// 信息

	int getSum(int[] a);// 求和

	int getAverage(int[] a);// 求平均值

	int getMax(int[] a);// 求最大值

	int getMin(int[] a);// 求最小值

	int getNot60(int[] a);// 不及格人数

	int[] sort(int[] a);// 升序排序

}
