/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月13日 下午8:51:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		/*
		 * 利用三元条件运算符的嵌套或选择结构来完成此题： 学习成绩>=90分的同学用A表示. 60-89分之间的用B表示. 60分以下的用C表示。
		 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
		 */
		  Scanner sc = new Scanner(System.in);
		   
			System.out.println("请输入学生成绩:");
			
			int a =sc.nextInt();
			
			if(a>=90){
				System.out.println("该同学等级为A");
			}
			if((a>=60) && (a<=89)){
				System.out.println("该同学等级为B");
			}
			if(a<60){
				System.out.println("该同学等级为C");
			}
			sc.close();
			
			
		}
		   
		

}
