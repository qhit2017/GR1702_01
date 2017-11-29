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
public class PalindromicNumber {
	public static void main(String[] args) {
		System.out.println("第四题");
		//一个5位数，判断它是不是回文数。
		//即12321是回文数，个位与万位相同，十位与千位相同。 
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个回文数：");
		int a=sc.nextInt();
		if(a%10 == a/10000 && a%10000/1000 == a%100/10){
			System.out.println(a+"它是回文数");
		}else {
			System.out.println(a+"它不是一个回文数");
		}
		
		
		
		
		
		
		
	}

}
