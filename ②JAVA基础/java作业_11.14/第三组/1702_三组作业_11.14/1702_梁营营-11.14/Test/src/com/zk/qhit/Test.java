package com.zk.qhit;

import java.util.Scanner;

//���ߣ���ӪӪ��
public class Test {

	public static void main(String[] args) {
		System.out.println("��ҵ����");
		System.out.println("\n");
		// ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
		// ���������(a>b)?a:b��������������Ļ������ӡ�
		Scanner sc = new Scanner(System.in);
		char A = 'A';
		char B = 'B';
		char C = 'C';
		System.out.println("������ѧϰ�ɼ���");
		int i = sc.nextInt();
		if (i >= 90) {
			System.out.println(A);
		} else {
			if ((i >= 60) && (i <= 89)) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		}
	}

}
