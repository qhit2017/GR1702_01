package lishaoqing;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayc {
public static void main(String[] args) {
	//动态定义
	double[] a =new double[5];
	int[] b= new int[7];
	
	System.out.println(a.length);
	System.out.println(b.length);
	//数组长度从零到length
	a[0] = 18.4;
	a[1] = 18.4;
	a[2] = 18.4;
	a[3] = 18.4;
	a[4] = 18.4;

	b[0]=55;
	b[1]=6;
	b[2]=2;
	b[3]=23;
	b[4]=23;
	
	//静态定义
	int[] c={23,24,6,34,23,235,565,21};
	System.out.println(c.length);
	
	//遍历数组
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
	
	//默认定义
	int[] d;
	
	
	Car[] cars = new Car[5];
	cars[0]=new Car("红旗",23.5);

	
	
	//输入5个数到数组，并求出最大最小值
	int[] f = new int[5];
	Scanner sc = new Scanner(System.in);
	int sum=0;
	for (int i = 0; i < f.length; i++) {
		System.out.println("请输入第"+(i+1)+"个数");
		f[i]=sc.nextInt();
		sum+=f[i];
	}
	System.out.println(Arrays.toString(f));
	System.out.println(sum/f.length);
	
	
	int max=f[0];
	int min=f[0];
	for (int i = 0; i < f.length; i++) {
		if (f[i]>max) {
			max = f[i];
		}
		if (f[i]<min) {
			min = f[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
