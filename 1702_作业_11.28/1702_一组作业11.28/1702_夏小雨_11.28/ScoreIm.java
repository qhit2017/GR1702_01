package com.xxy;

import java.util.Arrays;

public class ScoreIm implements Score {
	public static void main(String[] args) {
		
	}

	public  void help() {
		System.out.println("分数管理系统");
		System.out.println("求平均分请输入Average");
		System.out.println("求总分请输入sum");
		System.out.println("求最高分请输入Max");
		System.out.println("求最低分请输入Min");
		System.out.println("求不及格请输入Not");
		System.out.println("浏览各科成绩请输入Info");
		System.out.println("按升序排列成绩请输入Sort");

	}
	@Override
	public int getAverage(int[] a) {

		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.number){
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
		int Max =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>Max){
			Max = a[i];
			
		}
		
	}
		return Max;
	}
	
	@Override
	public int getMin(int[] a) {
		int Min =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<Min){
			Min = a[i];
			
		}
		
	}
		return Min;
	}

	@Override
	public int getNot(int[] a) {
		int Not =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				Not = a[i];
			
		}
		
	}
		return 0;
	}
	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	@Override
	public int[] sort(int[] a) {

		boolean isSort;
		int temp;
		for (int j = 0; j < a.length-1; j++) {
			isSort = true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSort = false;
				}
			}
			
			if(isSort){
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		int b[] = a;
		return a;
	}

}
