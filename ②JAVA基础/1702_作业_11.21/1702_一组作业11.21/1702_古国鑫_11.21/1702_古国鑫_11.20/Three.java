package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午7:22:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Three {

	//输入三个整数x,y,z，请把这三个数由小到大输出。
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in); 
		
		System.out.println("请输入x:");
		
		int x = sc.nextInt();
		
		System.out.println("请输入y:");
		
		int y = sc.nextInt();
		
		System.out.println("请输入z:");
		
		int z = sc.nextInt();
		
		int r;
		
		if(x>y){
			r=x;
			x=y;
			y=r;
		}
		if(x>z){
			r=x;
			x=z;
			z=r;
		}
		if(y>z){
			r=y;
			y=z;
			z=r;
		}
		System.out.println(x+""+y+""+z);
		sc.close();
	}
}
