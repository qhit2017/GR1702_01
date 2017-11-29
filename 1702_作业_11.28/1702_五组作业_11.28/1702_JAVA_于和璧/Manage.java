package Grade;

import java.util.Arrays;

public class Manage implements Grade {

	@Override
	public void help() {
		System.out.println("---�����������---");
		System.out.println("��0�����������sum");
		System.out.println("��1�������ֵ������max");
		System.out.println("��2������Сֵ����min");
		System.out.println("��3���󲻼�����������not");
		System.out.println("��4����ƽ��ֵ������mean");
		System.out.println("��5���˳�������Quit");
		System.out.println("��6��������Ƴɼ�������info");
		System.out.println("��7������������������sort");
		
		
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
