package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午12:33:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数;");
		int N =sc.nextInt();
		
		int n =0;
		if(N<0 ||N>10000){
			System.out.println("输入错误");
			
		}else{
			while(N>0){
				N=N/10;
				n++;
			}
			System.out.println(n);
		}
		
		
	}

}
