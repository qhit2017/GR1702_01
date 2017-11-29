
package com.qhit.Work;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月18日 下午12:49:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = sc.nextInt();
		if (a<0){
			System.out.println("为负数");
		}else {
			System.out.println("为正数");
		}
	}
}
