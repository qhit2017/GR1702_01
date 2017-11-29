/**
 * 
 */
package com;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕 /贾慧波  E-mail:2570804732@qq.com
 * @date 创建时间：27 Nov 2017 4:28:04 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Score02 implements Score {

	 
	public void help() {
		 System.out.println("---分数管理系统帮助信息---");
			System.out.println("【0】求平均值请输入Average");
			System.out.println("【1】求总分请输入Sum");
			System.out.println("【2】求最大值请输入Max");
			System.out.println("【3】求最小值请输入Min");
			System.out.println("【4】求不及格人数请输入Not");
			System.out.println("【5】退出请输入Quit");
			System.out.println("【6】浏览各科成绩请输入Info");
			System.out.println("【7】按升序排列成绩请输入Sort");
		 
	}

	 
	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	 
	@Override
	public int getAverage(int[] a) {
		// TODO Auto-generated method stub
		
		return getSum(a)/a.length;
	}

	 
	@Override
	public int getSum(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

	 
	@Override
	public int getMax(int[] a) {
		  int max =a[0];
		  for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
			max=a[i];	
			}
		}
		return max;
	}

	 
	@Override
	public int getMin(int[] a) {
		int min =a[0];
		  for (int i = 0; i < a.length; i++) {
			if (a[i]>min) {
			min=a[i];	
			}
		}
		
		return min;
	}

	 
	@Override
	public int getNot60(int[] a) {
		 int b=0;
		 System.out.println("成绩不及格有");
		 
		  for (int i = 0; i < a.length; i++) {
			if (a[i]>60) {
			 System.out.println(a[i]+" ");
			b++;
			}
		}
		
		
		
		
		
		return b;
	}


	 
	@Override
	public int getInfo(int[] a) {
		 
		return 0;
	}


	 
	@Override
	public int[] sort(int[] a) {
		boolean isSort =false; 
		int empty;
		for (int i = 0; i < a.length-1; i++) {
			isSort =true; 
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1] ) {
				empty=a[j];
				a[j]=a[j+1];
				a[j+1]=empty;
				 isSort =false;
				}
			}
			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		int b[]=a;
		
		
		return b;
	}


	 
	@Override
	public void info(int[] a) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
	}
  
	 


	 
	 
	

 
	 
	
	
}
