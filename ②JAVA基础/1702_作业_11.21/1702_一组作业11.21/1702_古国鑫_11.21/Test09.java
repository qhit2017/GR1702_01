package com.qhit.guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��21�� ����4:34:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test09 {

	//��дJAVA����ͨ������̨����һ������N����N������10000���������7�ı����Ͱ���7�����֡�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������10000����:");
		
		int N = sc.nextInt();
		
		if(N>10000){
				
			System.out.println("��������ֳ�����Χ��");
			
		}
		
		for (int i = 1; i <= 10000; i++) {
			
			if (i / 1000 == 7 || i / 100 == 7 ||i / 10 % 10 == 7 || i % 10 == 7 || i % 7 == 0 ) {
				
				System.out.println(i);
			}
		}
		sc.close();
	}
}
