package com.zk.qhit.stattictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月21日 下午6:57:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入三个数：");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i;
		if(a>b){
			i=a;
			a=b;
			b=i;
		}
		if(a>c){
			i=a;
			a=c;
			c=i;
		}
		if(b>c){
			i=b;
			b=c;
			c=i;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}

}
