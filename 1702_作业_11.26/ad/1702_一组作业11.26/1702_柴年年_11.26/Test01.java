
package com.qhit;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����6:29:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������С��");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a<b){
			System.out.println(a+"<"+b+"�����");
		}else if(a>b){
			System.out.println(a+">"+b+"�����");
		}else{
			System.out.println(a+"="+b+"���");
		}
	}
}
