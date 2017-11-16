package com.XQW;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月13日 下午9:20:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeIf {

	public static void main(String[] args) {
		System.out.println("三、判断考试成绩等级。\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数表示成绩:");
		int a=sc.nextInt();
		if(a>150){
			System.out.println("撒谎是不对的哟~");
		}else if(a>=90){
			System.out.println("您的成绩是"+a+",判定为 A");
		}else if(a>=60&a<90){
			System.out.println("您的成绩是"+a+",判定为 B");
		}else if(a<60){
			System.out.println("您的成绩是"+a+",判定为 C");
		}
		sc.close();
		

	}

}
