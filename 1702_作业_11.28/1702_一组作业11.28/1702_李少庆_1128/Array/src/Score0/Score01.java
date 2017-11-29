package Score0;

import java.util.Arrays;

public class Score01 implements Score {

	@Override
	public void help() {
		System.out.println("---帮助---");
		System.out.println("（1）求和请输入Sum");
		System.out.println("（2）求平均值请输入Average");
		System.out.println("（3）求最大值请输入Max");
		System.out.println("（4）求最小值请输入Min");
		System.out.println("（5）从小到大排序请输入Sort");
		System.out.println("（6）查看分数请输入Info");
		System.out.println("（7）查看未及格人数请输入Not");
		System.out.println("（8）退出请输入Quit");
	}

	@Override
	public double getAverage(double[] a) {
		return getSum(a)/a.length;
		// TODO Auto-generated method stub

	}

	@Override
	public double getSum(double[] a) {
	double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;

	}

	@Override
	public double Max(double[] a) {
		double max=a[0];
		for (int m = 0; m < a.length; m++) {
			if(a[m]>max){
				max=a[m];
			}
		}
		return max;
		// TODO Auto-generated method stub

	}

	@Override
	public double Min(double[] a) {
		double min=a[0];
		for (int m = 0; m < a.length; m++) {
			if(a[m]<min){
				min=a[m];
			}
		}
		return min;
		// TODO Auto-generated method stub

	}

	@Override
	public double Not60(double[] a) {
		double b=a[0];
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<60){
				c++;
			}
		}
		//    c为整形
		System.out.println(c);
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public int info(double[] a) {
		System.out.println(Arrays.toString(a));
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double[] sort(double[] a) {
		boolean isSort;
		double r;
		for (int j = 0; j < a.length-1; j++) {
			isSort=true;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					r=a[i];
					a[i]=a[i+1];
					a[i+1]=r;
					isSort=false;
					}
				}
				if(isSort){
					break;
			}
		}
		System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub
		
		return a;
	}

}
