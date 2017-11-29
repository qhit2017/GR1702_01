package com.qhit.wyk;

import java.util.Arrays;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����4:29:38
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoerImplements implements Scoer {

	@Override
	public void help() {
		System.out.println("----��������ϵͳ������Ϣ----");
		System.out.println("��0���鿴ƽ����������Average");
		System.out.println("��1���鿴�ܷ�������sum");
		System.out.println("��2���鿴���ֵ������Max");
		System.out.println("��3���鿴��Сֵ������min");
		System.out.println("��4���鿴����������������Not60");
		System.out.println("��5���˳�������Quit");
		System.out.println("��6��������Ƴɼ�������Info");
		System.out.println("��7�����������гɼ�������Sort");
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
			System.out.println("������ĸ�����������������");
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
