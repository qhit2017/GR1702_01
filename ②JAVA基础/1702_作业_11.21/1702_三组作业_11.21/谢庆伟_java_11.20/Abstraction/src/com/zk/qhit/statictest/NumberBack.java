package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午8:46:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class NumberBack {

	public static void main(String[] args) {
		//输出题目
		System.out.println("四、判断是否回文数。\n");
		//监控控制台
		Scanner sc=new Scanner(System.in);
		//获取用户输入值
		System.out.println("请输入整数值：");
		int a=sc.nextInt();
		//布尔存储是或否
		boolean or=true;
		//将int简转为String
		String s=""+a+"";
		//将String转为char数组
		char a1[] =s.toCharArray();
		//判断首尾对应元素是否相等
		for(int i=0;i<=a1.length/2;i++){
			if(a1[i]==a1[a1.length-1-i]){
				continue;
			}
			else{
				or=false;
				break;
			}
		}
		//输出结果
		if(or){
			System.out.println(a+"是回文数");
		}
		else{
			System.out.println(a+"不是回文数");
		}
		//退出控制台		
		sc.close();

	}

}
