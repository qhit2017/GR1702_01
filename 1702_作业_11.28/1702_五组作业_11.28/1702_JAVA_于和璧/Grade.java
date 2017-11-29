package Grade;

public interface Grade {
	
	public static final int NUMBER =10;
	
	void help();
	
	void info(int[] a);
	
	//求和
	int getSum (int[] a);
	
	//求最大值
	int getMax (int[] a);
	
	//求最小值
	int getMin (int[] a);
	
	//求不及格人数
	int getNot(int[] a);
	
	//求平均值
	int getMean(int[] a);
	
	
	int[]  Sort(int[] a);

}
