package com.zk;

import java.util.Scanner;

public class Test3 {
	// ��ҵ�ţ�
	// ���ߣ���ӪӪ��

	public static void main(String[] args) {
		// ͨ������̨����һ������N����N������10000�����������7�ı����Ͱ���7�����֡�
		System.out.println("����һ��������10000�����֣�");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		if (n > 10000) {
			System.out.println("���ֲ��ܴ���10000");
		} else {
			for (int i = 1; i < n; i++) {
				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
			number.close();
		}

	}
}
