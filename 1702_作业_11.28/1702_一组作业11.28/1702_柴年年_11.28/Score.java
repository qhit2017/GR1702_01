
package com.qhit.score;
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月27日 下午4:22:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {

	public static final int NUMBER = 10;
	
	public void help();
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
	
	//遍历信息
	void  info(int[] a);
	
	//升序排序
	int[] sort(int[] a);
	
	
	
	
	
	
	
	
	
	
	
	
}
