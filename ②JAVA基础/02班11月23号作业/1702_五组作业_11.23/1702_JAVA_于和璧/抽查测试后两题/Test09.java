package com.qhit;

import java.util.Scanner;

public class Test09 {
	//��дJAVA����ͨ������̨����һ������N����N������10000���������7�ı����Ͱ���7�����֡�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������N��");
		
		int N =sc.nextInt();
		if(N>10000){
			
			System.out.println("��Ǹ������������ֳ�����Χ��");
			
		}else{
			System.out.println("�˷�Χ������7�ı����Ͱ���7�������У�");
			for(int a=1;a<=N;a++){
			
			if(a%7==0 || a/1000==7 || a/100%10==7 || a/10%10==7 || a%10==7){
				
				System.out.println(a);
			}
		}
		}
		sc.close();
	}
}
