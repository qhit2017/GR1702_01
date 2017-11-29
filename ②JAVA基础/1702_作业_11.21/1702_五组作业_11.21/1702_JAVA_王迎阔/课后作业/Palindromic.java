package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月20日 下午6:18:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Palindromic {
	public static void main(String[] args) {
		
		System.out.println("第四题:");
		//一个5位数，判断它是不是回文数。
		//即12321是回文数，个位与万位相同，十位与千位相同。

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个回文数:");
		int a =sc.nextInt();
		
		if((a/10000==a%10)&&(a%10000/1000==a%100/10)&&a>=10000&&a<=99999){
			
			System.out.println("此数就是回文数");
		}else{
			System.out.println("此数不是回文数或者输入错误");
		}
	}
	
}
