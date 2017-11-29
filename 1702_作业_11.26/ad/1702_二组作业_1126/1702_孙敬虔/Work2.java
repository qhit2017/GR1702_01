package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午12:25:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数;");
		int a =sc.nextInt();
		
		int Tens =a/10%10;
		System.out.println(Tens);
		sc.close();
	}
}
