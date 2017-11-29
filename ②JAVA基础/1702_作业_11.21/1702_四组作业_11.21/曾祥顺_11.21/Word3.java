package com.zk.qhit.statctest;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月1日 上午1:33:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		int a=0;
		if (x>y) {
			a=x;
			x=y;
			y=a;
		}
		if (x>z) {
			a=x;
			x=z;
			z=a;
		}
		if (y>z) {
			a=y;
			y=z;
			z=a;
		}
		System.out.println(x+"\t"+y+"\t"+z);
		sc.close();
	}
}
