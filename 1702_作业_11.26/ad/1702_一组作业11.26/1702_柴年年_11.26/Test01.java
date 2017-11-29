
package com.qhit;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月23日 下午6:29:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a<b){
			System.out.println(a+"<"+b+"不相等");
		}else if(a>b){
			System.out.println(a+">"+b+"不相等");
		}else{
			System.out.println(a+"="+b+"相等");
		}
	}
}
