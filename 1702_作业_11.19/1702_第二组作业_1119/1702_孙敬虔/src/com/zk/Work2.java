package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月18日 下午12:58:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work2 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in); 
 		System.out.println("请输入两个小数：");
 		double a = sc.nextDouble();
 		double b = sc.nextDouble();
 		
 		if(a>b){
 			boolean c =false;
 			System.out.println("a<b的判断结果为："+c);
 		}else if(a<b){
 			boolean d =true;
 			System.out.println("a<b的判断结果为:"+d);
 		}
 		
	}
}
