package Score;

import java.util.Arrays;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月27日 下午4:30:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Implment implements Score{

	@Override
	public void help() {
		System.out.println("---分数管理系统---");
		System.out.println("求總分请输入:1");
		System.out.println("求平均分请输入:2");
		System.out.println("求最高分请输入:3");
		System.out.println("求最低分请输入:4");
		System.out.println("求不及格数请输入:5");
		System.out.println("查看全部成绩请输入:6");
		System.out.println("排序请输入：7");
		System.out.println("退出请输入:8 ");

		
	}

	@Override
	public void info(int[] a) {
		
		System.out.println(Arrays.toString(a));
		//for (int i = 0; i < a.length; i++) {
		//	System.out.print(a[i]+"  ");
		//}
	}

	@Override
	public int getAverage(int[] a) {

 
		
		return getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
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
			if (a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[0]<min) {
				min = a[0];
			}
		}
		
		return min;
	}

	@Override
	public int getNot(int[] a) {
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<60) {
				
				z= z+1;
			}
			
		}
		
		return z;
	}

	@Override
	public int[] sort(int[] a) {
		boolean isSort;
		int m ;
		for (int i = 0; i < a.length-1; i++) {
			isSort = true;
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]>a[i+1]) {
					m = a[i];
					a[i] = a[i+1];
					a[i+1] = m;
					isSort = false;
				}
			}
			if (isSort) {
				break;
			}
			
		}
		System.out.println(Arrays.toString(a));

		return a  ;
	}
	
}
