package com.zk.qhit.statictest;

import java.util.Scanner;

public class judge {
public static void main(String[] args) {
	
	//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
	
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ����λ��");
	int a = sc.nextInt();
	if(a/10000==a%10&&a%10000/1000==a%100/10){
		System.out.println(a+"������");
	}else{
		System.out.println(a+"���ǻ�����");
	}
}
}
