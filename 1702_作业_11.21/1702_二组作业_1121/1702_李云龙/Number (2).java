package com.zk.qhit;

import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	//
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.println("������һ������");
	if (i%10==i/10000 && i/1000%10==i/10%10) {
		System.out.println(i+"�ǻ�������");
		
	}else{
		System.out.println(i+"���ǻ�����");
	}
	sc.close();
}
}
