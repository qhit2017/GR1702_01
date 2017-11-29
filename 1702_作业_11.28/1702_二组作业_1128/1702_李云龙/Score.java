
public interface Score {
//管理十个人的成绩
	public static final int NUMBER = 10;
	//告知用户怎么用这个系统
	void help();
	//遍历信息
	void info(int[] a);
	//求平均值
	int getArerage(int[] a);
	//求总分
	int getSum(int[] a);
	//求最大值
	int getMax(int[] a);
	//求最小值
	int getMin(int[] a);

	// 求不及格人数
	int getNot(int[] a);
	//升序排序
	int[] sort(int[] a);
	
}
