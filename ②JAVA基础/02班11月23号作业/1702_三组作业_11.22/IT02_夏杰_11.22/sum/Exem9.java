package com.sum;

import java.util.Scanner;

/**
 * @author  ����  E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date    ����ʱ��: 2017��11��23�� ����7:16:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Exem9 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int n = sc.nextInt();
		
		if(n>10000||n<0){
			System.out.println("��������");
		}else{
		for(int a=1; a<=n; a++){
			if(a%7==0||a/1000==7||a/100%10==7||a/10%10==7||a%10==7){
				System.out.println(a);
			}
		}
		}
	}

}
