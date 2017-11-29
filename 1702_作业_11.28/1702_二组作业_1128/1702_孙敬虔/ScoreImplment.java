package com.zk;

import java.util.Arrays;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月27日 下午4:29:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreImplment implements Score{
	

	public  void help() {
		System.out.println("------------");
		System.out.println("求平均值请输入Average");
		System.out.println("求总分请输入sum");
		System.out.println("求最大值请输入Max");
		System.out.println("求最小值请输入Min");
		System.out.println("求不及格人数请输入Not60");
		System.out.println("退出请输入isquit");
	}

	

	@Override
	public int getAverage(int[] a) {
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.NUMBER){
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		int max =a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}			
		}
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min =a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}	
			
		}
		System.out.println(min);
		return min;
	}

	

	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	@Override
	public int getNot60(int[] a) {
		int b =0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<60) {
				b++;
			}
		}
		System.out.println(b);
		return b;
	}



}
