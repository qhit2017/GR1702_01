package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��19�� ����7:22:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��С��10000������");
		int a = sc.nextInt();
		if(a>10000){
			
			System.out.println("���ֲ��ܴ���10000");
			
		}else{
			for(int b =1;b<a;b++){
				
			if(b%7 == 0 || b%10 == 7 || b/10%10 == 7 || b/100 == 7 || b/1000 == 7){
				
			System.out.println(b);
		}
		}
		}
		sc.close();
	}

}
