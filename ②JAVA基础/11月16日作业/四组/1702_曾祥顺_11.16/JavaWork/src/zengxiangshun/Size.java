package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月16日 下午8:45:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Size {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("第1个数");
		int a=sc.nextInt();
		System.out.println("第2个数");
		int b=sc.nextInt();
		System.out.println("第3个数");
		int c=sc.nextInt();
		System.out.println("第4个数");
		int d=sc.nextInt();
		int l=0;
		if(a>b){
			l=a;
			a=b;
			b=l;
		}
		if (a>c) {
			l=a;
			a=c;
			c=l;
		}
		if (a>d) {
			l=a;
			a=d;
			d=l;
		}
		if (b>c) {
			l=b;
			b=c;
			c=l;	
		}
		if (b>d) {
			l=b;
			b=d;
			d=l;
		}
		if (c>d) {
			l=c;
			c=d;
			d=l;
		}
		
		System.out.println(d+"\t"+c+"\t"+b+"\t"+a);		
		}
		
		}



