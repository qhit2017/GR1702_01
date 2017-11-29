package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月16日 下午9:15:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work6 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数：");
	int a = sc.nextInt();
	System.out.println("您输入的第一个数是："+a);
	
	System.out.println("请输入第二个数：");
	int b = sc.nextInt();
	System.out.println("您输入的第二个数是："+b);
	
	System.out.println("请输入第三个数：");
	int c = sc.nextInt();
	System.out.println("您输入的第三个数是："+c);
	
	System.out.println("请输入第四个数：");
	int d = sc.nextInt();
	System.out.println("您输入的第四个数是："+d);
	int i;
	if(a<b){
		i=a;
		a=b;
		b=i;
		
	}
	if(a<c){
		i=a;
		a=c;
		c=i;
	}
	if(a<d){
		i=a;
		a=d;
		d=i;
	}
	
	if(b<c){
		i=b;
		b=c;
		c=i;
	}
	if(b<d){
		i=b;
		b=d;
		d=i;
	}
	if(c<d){
		i=c;
		c=d;
		d=i;
	}
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}
