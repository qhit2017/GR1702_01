package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月25日 下午1:44:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数;");
		int a =sc.nextInt();
		
		int sum =0;
		if(a%2==0&&a<=1000){
			for(int b=1;b<=a;b++){
				if (b%2==0) {
					sum+=b;
					
				}
			}
		}
		System.out.println("偶数和为："+sum);
		
		
		int sun=0;
		if(a%2!=0&&a<=1000){
			for(int b=1;b<=a;b++){
				if(b%2!=0){
					sun+=b;
				}
			}
		}
		System.out.println("奇数和为："+sun);
	}

}
