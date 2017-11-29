package com.score;
/*制作人：王欣
 *制作时间：2017年11月27日下午4:22:40
 *邮箱：2408368509@qq.com
 */

public interface IScore {
	public static final int NUMBER = 10;
	//用户帮助
		void help();
		
		void info(int[]a);
		//求平均值
		int getAverage(int[]a);
		//求总分
		int getSum(int[]a);
		//求最大值
		int getMax(int[]a);
		//求最小值
		int getMin(int[]a);
		//求不及格
		int getNot60(int[]a);
		
		//升序排序
		
		int[] sort(int[] a);
		
		
	}


