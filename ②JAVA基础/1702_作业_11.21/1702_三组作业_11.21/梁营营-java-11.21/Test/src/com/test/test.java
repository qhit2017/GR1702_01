package com.test;

import java.util.Scanner;

//���ߣ���ӪӪ��
//��ҵ����
public class test {

	public static void main(String[] args) {
		// ������������x,y,z���������������С���������
		Scanner number = new Scanner(System.in);
		System.out.println("�������һ��������");
		int x = number.nextInt();
		System.out.println("����ĵ�һ�������ǣ�" + x);
		int y = number.nextInt();
		System.out.println("����ĵڶ��������ǣ�" + y);
		int z = number.nextInt();
		System.out.println("����ĵ����������ǣ�" + z);
		int k;
		if (x < y) {
			k = x;
			x = y;
			y = k;
		}
		if (x < z) {
			k = x;
			x = z;
			z = k;
		}
		if (y < z) {
			k = y;
			y = z;
			z = k;
		}

		System.out.println(x + "<" + y + "<" + z);
		number.close();
	}
}
