
package com.qhit.Work;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����12:54:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һС��");
		float a = sc.nextFloat();
		System.out.println("����ڶ�С��");
		float b = sc.nextFloat();
		if (a<b){
			System.out.println(a+"<"+b);
		}else {
			System.out.println(a+">"+b);
		}
	}
}
