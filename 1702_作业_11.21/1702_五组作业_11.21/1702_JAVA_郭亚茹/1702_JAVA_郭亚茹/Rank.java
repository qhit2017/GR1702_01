package com.zk.qhit.statictest;

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
public class Rank {
	public static void main(String[] args) {
		//、输入三个整数x,y,z，请把这三个数由小到大输出.
		System.out.println("第三题");
		Scanner sc=new Scanner(System.in);
		System.out.println("请依次输入三个整数它们分别是：");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int a;
		if(x>y){
			a=x;
			x=y;
			y=a;
	}
		if(x>z){
			a=x;
			x=z;
			z=a;
		}
		if(y>z){
			a=y;
			y=z;
			z=a;
		}
		System.out.println(x+"\t"+y+"\t"+z);
	}
	
				
		
	}

