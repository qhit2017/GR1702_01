/**
 * 
 */
package com.zk.qhit;

import java.util.Scanner;

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��21�� ����5:23:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����");
		int k = sc.nextInt();
		
			
			for (int i = 1; i < k; i++) {
				if(i%7==0 || i%1000==7 || i%100==7 || i%10==7){
					System.out.println(i);
				}
				
				
				
			
		}
	}

}
