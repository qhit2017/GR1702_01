package lijingjing;

import java.util.Arrays;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月28日 下午5:52:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreShiXian implements IScore {

	@Override
	public void help() {
		System.out.println("---分数管理系统帮助信息---");
		System.out.println("【0】求平均值请输入Average");
		System.out.println("【1】求总分请输入Sum");
		System.out.println("【2】求最大值请输入Max");
		System.out.println("【3】求最小值请输入Min");
		System.out.println("【4】求不及格人数请输入Not");
		System.out.println("【5】退出请输入Quit");
		System.out.println("【6】浏览各科成绩请输入Info");
		System.out.println("【7】按升序排列成绩请输入Sort");
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAverage(int[] a) {
		// TODO Auto-generated method stub
		return  getSum(a)/a.length;
	}

	@Override
	public int getSum(int[] a) {
		if(a.length>IScore.renshu){
			System.out.println("您输入的个数有误，请重新输入");
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
		
	

	@Override
	public int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNot(int[] a) {
		int Not60 = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 60) {
				sum++;
			}
		}
		return sum;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] sort(int[] a) {
		//冒泡法排序
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
		// TODO Auto-generated method stub
		
		}
		
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	@Override
	public void info(int[] a) {
System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub
		
	}

}
