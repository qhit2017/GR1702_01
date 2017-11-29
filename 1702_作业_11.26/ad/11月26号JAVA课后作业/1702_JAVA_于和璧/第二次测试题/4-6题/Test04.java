package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午3:17:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {
	
  //成绩>=90分用A表示,60-89分之间的用B表示，
  //60分以下的用C表示，编写JAVA程序，输入成绩，输出相应的结果(A或者B或者C)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入考试成绩：");
		
		int a = sc.nextInt();
		
		if(a>=90){
			
			System.out.println("A级！");
			
		}else{
			
			if(a>=60 && a<=89){
				
				System.out.println("B级！");
				
			}else{
				
				System.out.println("C级！");
			}
			
		}
		sc.close();
	}
}
