package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午1:00:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩;");
		int a =sc.nextInt();
		
		if(a>=90){
			System.out.println("A");
		}else if(a<90&&a>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
	}

}
