package com.kong.qinghua;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1299394372@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:18:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Calculate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int a = sc.nextInt();
	if (a>=90){
		System.out.println("A");
	}else if(90>a&&a>=60){
		System.out.println("B");
	}else if(a<60){
		System.out.println("C");
	}
		
		sc.close();
	}

}
