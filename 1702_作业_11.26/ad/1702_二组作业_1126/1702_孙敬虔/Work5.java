package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午1:07:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数;");
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		
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
		System.out.println(x+"<"+y+"<"+z);
		sc.close();
	}

}
