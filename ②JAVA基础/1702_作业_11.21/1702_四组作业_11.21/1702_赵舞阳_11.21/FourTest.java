package com.zk.qhit.statictest;

import java.util.Scanner;

//4��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�������
//��λ����λ��ͬ��ʮλ��ǧλ��ͬ��
public class FourTest {
	public static void main(String[] args) {
		System.out.println("������:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a / 10000 == a % 10 && a / 1000 % 10 == a / 10 % 10) {
			System.out.println(a + "�ǻ�����");
		} else {
			System.out.println(a + "���ǻ�����");
		}
		sc.close();
	}
}
