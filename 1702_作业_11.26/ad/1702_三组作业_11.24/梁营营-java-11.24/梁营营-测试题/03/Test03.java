package com.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000��������");
		int N = sc.nextInt();
		int a = 0;
		if(N>10000){
			System.out.println("�����������������룡");
		}else{
			for (int i =N; i>0; i=i/10) {
				a++;
			}
			System.out.println(N+"��"+a+"λ��");
		}sc.close();
	}
}
