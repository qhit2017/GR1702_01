package com.qh;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��21�� ����7:13:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Huiwenshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		System.out.println();
		int i = sc.nextInt();
		if (i > 1000 && i <= 99999) {
			int a = (int) (i / 10000);
			int b = (int) ((i % 10000) / 1000);
			int c = (int) (i / 10 % 10);
			int d = (int) (i % 10);
			if (a == d && b == c) {
				System.out.println("i�ǻ�����");
			} else {
				System.out.println("i���ǻ�����");
			}
		}
		sc.close();
	}

}
