package com.sum;

import java.util.Scanner;

/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 下午7:16:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Exem9 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = sc.nextInt();
		
		if(n>10000||n<0){
			System.out.println("输入有误！");
		}else{
		for(int a=1; a<=n; a++){
			if(a%7==0||a/1000==7||a/100%10==7||a/10%10==7||a%10==7){
				System.out.println(a);
			}
		}
		}
	}

}
