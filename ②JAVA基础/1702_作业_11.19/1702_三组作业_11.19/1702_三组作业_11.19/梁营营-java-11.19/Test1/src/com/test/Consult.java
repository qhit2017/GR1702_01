package com.test;

//��ҵ�壻
//���ߣ���ӪӪ��
public class Consult {
	public static void main(String[] args) {
		// ��1000���ڼ��ܱ�5���������ܱ�3��������������������ӡ��������ʹ��do whileѭ����
		int i = 1;
		do {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;

		} while (i <= 1000);
	}
}
