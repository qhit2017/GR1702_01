package com.zk;

import java.util.Scanner;

public class Test02 {

	//��дJAVA��������һ����λ�������������ʮλ�Ƕ��١�
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����λ��a��");
		
		int a = sc.nextInt();
		
		int b = a/10%10;
		
		System.out.println(b);
		
	}
}
