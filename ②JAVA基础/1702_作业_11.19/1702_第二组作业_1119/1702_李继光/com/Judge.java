package com;

import java.util.Scanner;

public class Judge {
public static void main(String[] args) {
	/**
	 * ��дJava���򣬼�������һ�������жϴ�С
	 */
	Scanner sc = new Scanner(System.in);
	System.out.println("������һ������");
	int a = sc.nextInt();
	if(a>0){
		System.out.println("����Ϊ������"+a);
	}else if(a<0){
		System.out.println("����Ϊ������"+a);
	}else{
		System.out.println("�����Ȳ�������Ҳ���Ǹ���");
	}
	sc.close();
}
}
