package com.xxy;

public interface Score {

	public static final int number =10;
	
	void help();
	
	int getAverage(int[] a);

	int getSum(int[] a);
	
	int getMax(int[] a);
	
	int getMin(int[] a);
	
	int getNot(int[] a);

	int[] sort(int[] a);

	void info(int[] a);
}
