package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月13日 

下午9:03:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Result {
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
		   
		System.out.println("请输入学生成绩:");
		
		int result =sc.nextInt();
		
		if(result>=90){
			System.out.println("该同学等级为A");
		}
		if(result>=60 && result<=89){
			System.out.println("该同学等级为B");
		}
		if(result<60){
			System.out.println("该同学等级为C");
		}
		sc.close();
		
		
	}
	   
	
	   

}
