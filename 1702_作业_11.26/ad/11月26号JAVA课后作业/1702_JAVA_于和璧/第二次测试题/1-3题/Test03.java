package com.zk;

import java.util.Scanner;

public class Test03 {
	
	//�༭JAVA����ͨ������̨����һ������N(N������10000)���жϸ����Ǽ�λ��������������
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������10000����N��");
		
		int N = sc.nextInt();
		
		if(N>0 && N<10){
			
			System.out.println("����Ϊһλ��");
		}else if(N>=10 && N<100){
			
			System.out.println("����Ϊ��λ��");
		}else if(N>=100 && N<1000){
			
			System.out.println("����Ϊ��λ��");
		}else if(N>=1000 && N<10000){
			
			System.out.println("����Ϊ��λ��");
		}else if(N==10000){
			
			System.out.println("����Ϊ��λ��");
		}
		
		
	}

}
