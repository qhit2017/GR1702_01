
package com.qhit.Work;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����3:08:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��10000�ڵ�����");
		int a = sc.nextInt();
		for (int b= 1;b<=a ;b++){
			if (b%7==0 || b%1000==7 || b%100==7 || b%10==7){
				System.out.println(b);
			}
		}
	}
}
