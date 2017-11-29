package test;

public interface Score {

	public static final int NUMBER = 15;

	// 帮助；
	void help();

	// 所有成绩；
	void Info(int[] a);

	// 平均值；
	int getAverage(int[] a);

	// 总分；
	int getSum(int[] a);

	// 最大值；
	int getMax(int[] a);

	// 最小值；
	int getMin(int[] a);

	// 不及格；
	int getNot60(int[] a);

	// 排序；
	int[] Sort(int[] a);
}
