package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午3:30:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {
	
	//编写JAVA程序，输入三个整数x,y,z,请把这三个数由小到大输出。
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数x:");
		int x = sc.nextInt();
		System.out.println("请输入整数y:");
		int y = sc.nextInt();
		System.out.println("请输入整数z：");
		int z = sc.nextInt();
		
		int a = 0;
		
		if(x<y){
			a=x;
            x=y;
            y=a;
		}
		if(x<z){
			a=x;
			x=z;
			z=a;
		}
		if(y<z){
			a=y;
			y=z;
			z=a;
		}
		System.out.println("x,y,z由小到大排列为："+z+" "+y+" "+x);
	}

}
