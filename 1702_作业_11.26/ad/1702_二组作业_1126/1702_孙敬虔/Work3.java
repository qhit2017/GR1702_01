package com.zk.sjq;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��25�� ����12:33:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����;");
		int N =sc.nextInt();
		
		int n =0;
		if(N<0 ||N>10000){
			System.out.println("�������");
			
		}else{
			while(N>0){
				N=N/10;
				n++;
			}
			System.out.println(n);
		}
		
		
	}

}
