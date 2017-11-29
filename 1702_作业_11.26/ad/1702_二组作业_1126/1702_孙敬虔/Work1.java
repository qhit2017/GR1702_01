package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午12:17:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数;");
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		
		if(a==b){
			System.out.println("两个小数相等");
		}else{
			System.out.println("两个小数不等");
		}
	}

}
