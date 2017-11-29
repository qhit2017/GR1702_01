package Grade;

import java.util.Arrays;

public class Manage implements Grade {

	@Override
	public void help() {
		System.out.println("---分数管理帮助---");
		System.out.println("【0】求和请输入sum");
		System.out.println("【1】求最大值请输入max");
		System.out.println("【2】求最小值输入min");
		System.out.println("【3】求不及格人数输入not");
		System.out.println("【4】求平均值请输入mean");
		System.out.println("【5】退出请输入Quit");
		System.out.println("【6】浏览各科成绩请输入info");
		System.out.println("【7】按升序排列请输入sort");
		
		
	}

	@Override
	public void info(int[] a) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}

	@Override
	public int getSum(int[] a) {
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			
			sum +=a[i];
			
		}
		
		return sum;
	}

	@Override
	public int getMax(int[] a) {
		// TODO Auto-generated method stub
		
		int Max = a[0];
		for (int i = 0; i < a.length; i++) {
			
				if(a[i]>Max){
					
					Max=a[i];
				}
			}
		
		return Max;
	}

	@Override
	public int getMin(int[] a) {
		// TODO Auto-generated method stub
		int Min= a[0];
		for (int i = 0; i < a.length; i++) {
			
				if(a[i]<Min){
					
					Min = a[i];
					
				}
			}
		
		return Min;
	}

	@Override
	public int getNot(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<60){
				sum++;
			}
		}
		return sum;
	}

	@Override
	public int getMean(int[] a) {
		// TODO Auto-generated method stub
		return getSum(a)/a.length;
	}

	@Override
	public int[] Sort(int[] a) {
		// TODO Auto-generated method stub
		boolean isSort;
		int c ;
		for (int i = 0; i < a.length-1; i++) {
			isSort = true;
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1]){
					
					c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
					isSort = false;
					
				}
			}if(isSort){
				
				break;
			}
			
			
		}
		System.out.println(Arrays.toString(a));
		return a;
	}

	
	

	
}
