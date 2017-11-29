package com.ad;

import java.util.Arrays;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月27日 下午4:27:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fill implements INum {

	@Override
	public void help() {
		System.out.println("输入【1】求最大值");
		System.out.println("输入【2】求最小值");
		System.out.println("输入【3】求和");
		System.out.println("输入【4】求平均值");
		System.out.println("输入【5】输出所有成绩");
		System.out.println("输入【6】输出小于60的成绩");
		System.out.println("输入【7】升序排列");
		System.out.println("输入【9】退出");
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
				System.out.println("第"+(i+1)+"个："+a[i]);
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
