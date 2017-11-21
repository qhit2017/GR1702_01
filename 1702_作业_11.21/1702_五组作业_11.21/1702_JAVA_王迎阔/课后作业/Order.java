package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月20日 下午6:16:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Order {
	public static void main(String[] args) {
		
		System.out.println("第三题:");
		//输入三个整数x,y,z，请把这三个数由小到大输出。
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入第一个整数:");
		int x=sc.nextInt();
		System.out.println("输入第二个整数:");
		int y=sc.nextInt();
		System.out.println("输入第三个整数:");
		int z=sc.nextInt();
		int t;
		
		if(x>y){
			t=x;
			x=y;
			y=t;
		}
		if(x>z){
			t=x;
			x=z;
			z=t;
		}
		if(y>z){
			t=y;
			y=z;
			z=t;
		}
		
	 	
		System.out.println(x+"<"+y+"<"+z);
	}
	
}
