package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午7:21:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number_1 {
	//一个5位数，判断它是不是回文数。
	//即12321是回文数，个位与万位相同，十位与千位相同。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int i = sc.nextInt();
		if(i<10000||i>99999){
			System.out.println("输入有误，请重新输入");
		}
		
		else if((i%10==i/10000)&&(i/1000%10==i/10%10)){
				System.out.println("该数是回文数");
			}else{
				System.out.println("不是回文数");
			}
				
			}
			
		}



