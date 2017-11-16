package com.XQW;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月13日 下午9:35:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeFor {

	public static void main(String[] args) {
		System.out.println("五、求累加值，但要求跳过个位为3的数。\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入最小范围：");
		int a=sc.nextInt();
		System.out.println("请输入最大范围：");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++){
			if(i%10!=3){
				sum=sum+i;
			}
		}
		System.out.println(a+"~"+b+"去除个位为3的累加值是："+sum);
		sc.close();

	}
	
}
