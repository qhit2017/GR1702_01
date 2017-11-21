package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午7:24:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {

	//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个五位数：");
		
		int a = sc.nextInt();
		
			if(a/10000==a%10 && a%10000/1000==a%100/10){
			
				System.out.println(a+"是回文数");
			}else{
			
			System.out.println(a+"不是回文数");
		}
		sc.close();
	}
}
