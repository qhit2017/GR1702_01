package com.chen;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:chenglong271406@163.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:11:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreImplment implements Score {

	@Override
	public  void help() {
		System.out.println("---��������ϵͳ������Ϣ---");
		System.out.println("��0����ƽ��ֵ������Average");
		System.out.println("��1�����ܷ�������Sum");
		System.out.println("��2�������ֵ������Max");
		System.out.println("��3������Сֵ������Min");
		System.out.println("��4���󲻼�������������Not");
		System.out.println("��5���˳�������Quit");
		System.out.println("��6��������Ƴɼ�������Info");
		System.out.println("��7�����������гɼ�������Sort");
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMin(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNot60(int[] a) {
		// TODO Auto-generated method stub
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
		//ð�ݷ�����
		//{58,66,79,89,22,99,65,36,95,77};
		//{58,66,79,22,89,99,65,36,95,77};
		//{58,66,79,22,89,65,36,95,77,99};
		
	    //{58,66,22,79,65,36,89,77,95,99};
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
