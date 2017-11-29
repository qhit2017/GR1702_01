
package com.qhit;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月23日 下午7:04:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你的成绩");
		int a = sc.nextInt();
		if(a>=90){
			System.out.println("A");			
		}else if (a>=60){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}
}
