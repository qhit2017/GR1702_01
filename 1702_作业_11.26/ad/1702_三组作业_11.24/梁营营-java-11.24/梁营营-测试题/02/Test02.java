package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i = sc.nextInt();
		System.out.println("���������λ���ǣ�" + i);
		if (i > 1000) {
			System.out.println("�����������������룡");
		} else {
			for (int j = 0; j <= 9; j++) {
				if (i / 10 % 10 == j) {
					System.out.println("�������λ����ʮλ����Ϊ��" + j);
				}
			}
			sc.close();
		}

	}

}
