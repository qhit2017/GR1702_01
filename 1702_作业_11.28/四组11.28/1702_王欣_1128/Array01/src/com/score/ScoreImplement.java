package com.score;

import java.util.Arrays;

/*�����ˣ�����
 *����ʱ�䣺2017��11��27������4:34:29
 *���䣺2408368509@qq.com
 */

public class ScoreImplement implements IScore {

	@Override
	public void help() {
		// TODO Auto-generated method stub
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
	public void info(int[] a) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
	}

	@Override
	public int getAverage(int[] a) {
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		// TODO Auto-generated method stub
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		
		// TODO Auto-generated method stub
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	@Override
	public int getNot60(int[] a) {
		int b=a[0];
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				c++;
			}
		}
		return c;
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
			
		}System.out.println(Arrays.toString(a));
		return a;
	}

}
