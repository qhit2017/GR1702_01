package com.test;

//��ҵ�ģ�
//���ߣ���ӪӪ��
public class Sum {
	public static void main(String[] args) {
		// ��1000��������8�ı���֮�ͣ�
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {

			if (i % 8 == 0) {

				sum = sum + i;

			}

		}
		System.out.println("1000��������8�ı���֮���ǣ�"+sum);
	}
}
