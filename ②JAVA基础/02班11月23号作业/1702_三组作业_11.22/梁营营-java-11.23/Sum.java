package com.test;
//��ҵ�壺
//���ߣ���ӪӪ��
public class Sum {

	public static void main(String[] args) {
		// ��for��������1~100֮�������ĺ�
		int sum = 0;
		for (int i = 1; i < 100; i++) {

			if (i % 2 != 0) {
				sum = sum + i;

			}
		}
		System.out.println(sum);
	}
}
