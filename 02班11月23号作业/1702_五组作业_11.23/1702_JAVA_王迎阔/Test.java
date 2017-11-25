package com.qhit.wyk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月23日 上午8:07:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("第九题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数:");
		long N = sc.nextLong();
		if(N>10000){
			System.out.println(N);
		}else{
		
		for(int a=1;a<N;a++){
			if(a%7==0||a/1000==7||a/100==7||a%10/10==7||a%10==7){
				System.out.println(a);
			}
			}
			
		}
	}

}
