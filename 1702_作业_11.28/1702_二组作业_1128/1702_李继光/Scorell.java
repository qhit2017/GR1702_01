package com.xx;

import java.util.Arrays;

public class Scorell implements Score {

	void A() {
		System.out.println("--��������ϵͳ--");
	}

	@Override
	public void help() {
		System.out.println("---��������ϵͳ������Ϣ---");
		System.out.println("��1����ƽ��ֵ������Average");
		System.out.println("��2�����ܷ�������Sum");
		System.out.println("��3�������ֵ������Max");
		System.out.println("��4������Сֵ������Min");
		System.out.println("��5���󲻼�������������Not60");
		System.out.println("��6��������Ƴɼ�������Info");
		System.out.println("��7�����������гɼ�������Sort");
		System.out.println("��8���˳��밴Quit");
	}
	//ƽ��ֵ
	@Override
	public int getAverage(int[] a) {

		return getSum(a) / a.length;
	}
	//���
	@Override
	public int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	//�����ֵ
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
	//����Сֵ
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
	//�󲻼�������
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
	//��������
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
	//��ӡ����
	@Override
	public void info(int[] a) {
		System.out.println(Arrays.toString(a));
		
	}

}
