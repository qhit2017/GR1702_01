package com.zk;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:29:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreImplment implements Score{
	

	public  void help() {
		System.out.println("------------");
		System.out.println("��ƽ��ֵ������Average");
		System.out.println("���ܷ�������sum");
		System.out.println("�����ֵ������Max");
		System.out.println("����Сֵ������Min");
		System.out.println("�󲻼�������������Not60");
		System.out.println("�˳�������isquit");
	}

	

	@Override
	public int getAverage(int[] a) {
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>Score.NUMBER){
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
