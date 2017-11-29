package com.zk.qhit.statctest;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月1日 下午10:27:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a%10==a/10000&&a/10%10==a/1000%10){
			System.out.println(a+"是回文字数");
		}else{
			System.out.println("不是回文字数");
		}
		sc.close();
	}
}
