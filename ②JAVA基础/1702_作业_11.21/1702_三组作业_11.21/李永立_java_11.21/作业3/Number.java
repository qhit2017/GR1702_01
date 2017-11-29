package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午7:06:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {
	//输入三个整数x,y,z，请把这三个数由小到大输出
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		int w = 0;
		if(x<y){
			w = x;
			x = y;
			y = w;
		}
		if (x<z){
			w = z;
			z = x; 
			x = w;
		}
		if (y<z){
			w = y;
			y = z;
			z = w;
			
		}
		System.out.println("输出顺序为：");
		System.out.print(z+"\t");
		System.out.print(y+"\t");
		System.out.print(x+"\t");
		
		
	}

}
