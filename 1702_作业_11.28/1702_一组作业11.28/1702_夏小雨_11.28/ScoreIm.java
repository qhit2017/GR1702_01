package com.xxy;

import java.util.Arrays;

public class ScoreIm implements Score {
	public static void main(String[] args) {
		
	}

	public  void help() {
		System.out.println("��������ϵͳ");
		System.out.println("��ƽ����������Average");
		System.out.println("���ܷ�������sum");
		System.out.println("����߷�������Max");
		System.out.println("����ͷ�������Min");
		System.out.println("�󲻼���������Not");
		System.out.println("������Ƴɼ�������Info");
		System.out.println("���������гɼ�������Sort");

	}
	@Override
	public int getAverage(int[] a) {

		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.number){
			System.out.println("������ĸ�����������������");
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
