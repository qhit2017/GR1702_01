package guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
	public static void main(String[] args) {
		//  从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数：");
		int b=sc.nextInt();
		System.out.println("请输入第三个数：");
		int c=sc.nextInt();
		System.out.println("请输入第四个数：");
		int d =sc.nextInt();
		//
		int e;
		if(a>b){
			e=a;
			a=b;
			b=e;
	}
		int f;
		if(b>c){
			f=b;
			b=c;
			c=f;
		}
		int g;
		if(c>d){
			g=c;
			c=d;
			d=g;
	}
		int h;
		if(a>c){
			h=a;
			a=c;
			c=h;
	}
		int j;
		if(a>d){
			j=a;
			a=d;
			d=j;
	}
		int k;
		if(b>d){
			k=b;
			b=d;
			d=k;
	}
		int l;
		if(c>d){
			l=c;
			c=d;
			d=l;
			
		}
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
	}

}
