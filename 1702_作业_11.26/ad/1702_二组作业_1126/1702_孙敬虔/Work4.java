package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��25�� ����1:00:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ɼ�;");
		int a =sc.nextInt();
		
		if(a>=90){
			System.out.println("A");
		}else if(a<90&&a>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
	}

}
