package com.zk.qhit.stattictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��21�� ����7:14:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		
		if(i>1000 && i<=99999){
			int a =(int)(i/10000);
			int b =(int)((i%10000)/1000);
			int c =(int)((i/10)%10);
			int d =(int)(i%10);
			
		if(a==d && b==c){
			System.out.println("ture");
		}else{
			System.out.println("false");
		}
			System.out.println();		
			sc.close();		
					
		}
	}

}
