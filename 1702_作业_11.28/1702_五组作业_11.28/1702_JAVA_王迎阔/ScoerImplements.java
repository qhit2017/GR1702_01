package com.qhit.wyk;

import java.util.Arrays;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午4:29:38
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoerImplements implements Scoer {

	@Override
	public void help() {
		System.out.println("----分数管理系统帮助信息----");
		System.out.println("【0】查看平均分请输入Average");
		System.out.println("【1】查看总分请输入sum");
		System.out.println("【2】查看最大值请输入Max");
		System.out.println("【3】查看最小值请输入min");
		System.out.println("【4】查看不及格人数请输入Not60");
		System.out.println("【5】退出请输入Quit");
		System.out.println("【6】浏览各科成绩请输入Info");
		System.out.println("【7】按升序排列成绩请输入Sort");
	}

	@Override
	public void info(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

	@Override
	public int getAverage(int[] a) {

		return getsum(a) / a.length;
	}

	@Override
	public int getsum(int[] a) {
		if (a.length > Scoer.NUMBER) {
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		int Max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>Max){
				
				Max=a[i];
			}
		}
		return Max;
	}

	@Override
	public int getmin(int[] a) {
		int min =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				
				min=a[i];
			}
		}
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				sum++;
			}
		}
		return sum;
	}

	@Override
	public int[] sort(int[] a) {
		boolean isSort;
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			isSort = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]){
					
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				isSort = false;
				}
			}
			if (isSort) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		int b[] = a;
		return a;

	}

}
