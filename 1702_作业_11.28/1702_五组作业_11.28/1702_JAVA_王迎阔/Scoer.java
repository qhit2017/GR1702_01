package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Scoer {

	public static final int NUMBER =10;
	//告知用户怎么使用这个系统
	void help();
	//遍历信息
	void info(int []a);
	//求平均分
	int getAverage(int[]a);
	//求总分
	int getsum(int[]a);
	//求最大值
	int getMax(int[]a);
	//求最小值
	int getmin(int[]a);
	//求不及格人数
	int getNot60(int[]a);
	//升序排序
	int[] sort(int[] a);
}
