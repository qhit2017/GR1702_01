package com.zk.qhit;
//��ҵ�ģ�
//���ߣ���ӪӪ��
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("������һ����λ������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 10000 && number >= 100000) {
			System.out.println("����Ĳ�����λ������!");
			return;
		}
		int a = number / 10000;
		int b = number / 1000 % 10;
		int c = number / 100 % 10;
		int d = number / 10 % 10;
		int e = number % 10;
		if (a == e && b == d) {
			System.out.println(number + "�ǻ�����");
		} else {
			System.out.println(number + "���ǻ�����");
		}sc.close();
	}
}