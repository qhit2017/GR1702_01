package com.ggx;

public interface Score {

	public static final int NUMBER=10;
	
	//帮助
	void help();
	
	//遍历
	void info(int[] a);
	
	//平均分
	int getAverage(int[] a);
	
	//总分
	int getSum(int[] a);
	
	//最大值
	int getMax(int[] a);
	
	//最小值
	int getMin(int[] a);
	
	//不及格
	int getNot60(int[] a);
	
	//升序
	int[] sort(int[] a);

}
