package com.test;

//��ҵ�ˣ�
//���ߣ���ӪӪ��
public class Consult {
	public static void main(String[] args) {
		// ���λ��Ϊ6���ܱ�3������3λ�������ж��٣�
		int number = 0;
		for (int a = 100; a <= 999; a++) {
			if (a % 3 == 10 || a % 10 == 6) {
				System.out.println("��λ��Ϊ6���ܱ�3������3λ���У�" + a);
				number++;
			}
		}
		System.out.println("���У�" + number++ + "��");

	}
}
