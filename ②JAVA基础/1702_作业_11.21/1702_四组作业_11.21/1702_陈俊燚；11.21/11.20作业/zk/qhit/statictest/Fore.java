package com.zk.qhit.statictest;

import java.util.Scanner;

//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
public class Fore {
	public static void main(String[] args) {
		System.out.println("������");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int a = sc.nextInt();
		if ((a % 10 == a / 10000) && (a / 1000 % 10 == a / 10 % 10)) {
			System.out.println("�����ǻ�����");
		} else {
			System.out.println("�������ǻ�����");
		}

	}
}