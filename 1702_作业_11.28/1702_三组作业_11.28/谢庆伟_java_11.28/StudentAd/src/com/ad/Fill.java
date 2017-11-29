package com.ad;

import java.util.Arrays;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:27:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fill implements INum {

	@Override
	public void help() {
		System.out.println("���롾1�������ֵ");
		System.out.println("���롾2������Сֵ");
		System.out.println("���롾3�����");
		System.out.println("���롾4����ƽ��ֵ");
		System.out.println("���롾5��������гɼ�");
		System.out.println("���롾6�����С��60�ĳɼ�");
		System.out.println("���롾7����������");
		System.out.println("���롾9���˳�");
	}

	@Override
	public int max(int[] a) {
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}

	@Override
	public int min(int[] a) {
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}

	@Override
	public int sum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}

	@Override
	public int average(int[] a) {
		return sum(a)/a.length;
	}

	@Override
	public String info(int[] a) {
		return Arrays.toString(a);
	}

	@Override
	public void less60(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				System.out.println("��"+(i+1)+"����"+a[i]);
			}
		}
		
	}

	@Override
	public String sort(int[] a) {
		int tem;
		boolean is;
		for (int i = 0; i < a.length-1; i++) {
			is=true;
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]){
					tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
					is=false;
				}
			}
			if(is){
				break;
			}
		}
		return Arrays.toString(a);
	}

	

}
