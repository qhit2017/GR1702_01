package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月18日 下午12:42:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入一个数：");
		int a = sc.nextInt();
		if(a>0){
			System.out.println("该数为正数");
		}else{
			System.out.println("该数为负数");
		}
}

}
