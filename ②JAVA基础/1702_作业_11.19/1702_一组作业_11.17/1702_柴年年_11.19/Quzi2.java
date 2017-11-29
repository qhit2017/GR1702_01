
package com.qhit.Work;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月18日 下午12:54:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一小数");
		float a = sc.nextFloat();
		System.out.println("输入第二小数");
		float b = sc.nextFloat();
		if (a<b){
			System.out.println(a+"<"+b);
		}else {
			System.out.println(a+">"+b);
		}
	}
}
