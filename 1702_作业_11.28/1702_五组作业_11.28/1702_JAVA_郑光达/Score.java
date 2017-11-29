/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月27日 下午4:22:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.score;

public interface Score {

	public static final int people = 10;

	void help();

	double getMean(double[] a);

	double getMax(double[] a);

	double getMin(double[] a);

	double getSum(double[] a);

	int Not60(double[] a);

	double[] sort(double[] a);

}
