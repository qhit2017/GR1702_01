package com.xx;

import java.util.Arrays;

public class Scorell implements Score {

	void A() {
		System.out.println("--分数管理系统--");
	}

	@Override
	public void help() {
		System.out.println("---分数管理系统帮助信息---");
		System.out.println("【1】求平均值请输入Average");
		System.out.println("【2】求总分请输入Sum");
		System.out.println("【3】求最大值请输入Max");
		System.out.println("【4】求最小值请输入Min");
		System.out.println("【5】求不及格人数请输入Not60");
		System.out.println("【6】浏览各科成绩请输入Info");
		System.out.println("【7】按升序排列成绩请输入Sort");
		System.out.println("【8】退出请按Quit");
	}
	//平均值
	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}
	//求和
	@Override
	public int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	//求最大值
	@Override
	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
		return max;
	}
	//求最小值
	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(min);
		return min;
	}
	//求不及格人数
	@Override
	public int getNot60(int[] a) {
		int l=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				l++;
			}
		}
		System.out.println(l);
		return l;
	}
	//升序排列
	@Override
	public int[] sort(int[] a) {
		boolean isSort;
		int t;
		for (int j = 0; j < a.length - 1; j++) {
			isSort = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
					isSort = false;
				}
			}
			if(isSort){
				break;
			}
			}
		System.out.println(Arrays.toString(a));
		return a;
		
	}
	//打印所有
	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
	}

}
