package com.test;

import java.util.Scanner;

//��һ�⣻
//���ߣ���ӪӪ��
public class Value {
	public static void main(String[] args) {
		// ͨ������̨����һ�����֣��жϸ��������������Ǹ���������������
		System.out.println("��������ֵ��");
		Scanner number = new Scanner (System.in);
		int a = number.nextInt();
		System.out.println("���������ֵ�ǣ�"+a);
		if(a>0){
			System.out.println("�����ֵ������");
		}else if (a<0){
			System.out.println("�����ֵ�Ǹ���");
		}else if (a==0){
			System.out.println("�����ֵ�Ƿ����Ǹ�");
		}
		number.close();
	}
}
