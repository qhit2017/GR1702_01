package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��14�� ����5:18:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work3 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("������ɼ���");
	int a =sc.nextInt();
	if(a<=100&&a>=90){
		System.out.println("A");
	}else if(a>=60){
		System.out.println("B");
	}else{
		System.out.println("C");
	}
		sc.close();
	}

}


