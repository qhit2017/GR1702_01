package com.zk;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:25:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {
	public static final int NUMBER =10;
	void help();
	void info (int[] a);
	int getAverage(int[] a);
	int getSum(int[] a);
	int getMax(int[] a);
	int getMin(int[] a);
	int getNot60(int[] a);
	
	
	

}
