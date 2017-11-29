package com.zk.qhit.statictest;

import java.util.Scanner;


 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 上午11:22:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class number {
//输入三个整数x,y,z，请把这三个数由小到大输出。
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入三个数");
	int x =sc.nextInt();
	int y =sc.nextInt();
	int z =sc.nextInt();
	int q ;
	if (x<y) {
		q=x;
		x=y;
		y=q;
	}
	if (x<z) {
		q=x;
		x=z;
		z=q;
	}
	if (y<z) {
		q=y;
		y=z;
		z=q;
	}
	System.out.println("由小到大输出"+z+"<"+y+"<"+x);
	
	
	
}
}
