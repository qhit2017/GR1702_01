/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月20日 下午7:13:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if(a>b){
			a=d;
			a=b;
			b=d;
		}if(a>c){
			a=d;
			a=c;
			c=d;
		}if(b>c){
			b=d;
			b=c;
			c=d;
		}System.out.println(a+" "+b+" "+c);
		
	}
}
