package com.qhit.score;

public interface Score {
	
	public static final int NUMBER = 10;
	
	void getHelp(int[] a) ;
	
	void getInfo(int[] a);
	
	int getSum(int[] a);
	
	int getAverage(int[] a);
	
	int getMax(int[] a);
	
	int getMin(int[] a);
	
	int getOut60(int[] a);
	
	int[] sort(int[] a);

}
