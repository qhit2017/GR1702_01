package com;

public class Three {
	public static void main(String[] args) {
		 //��д�������λ��Ϊ6���ܱ�3��������
	
		int i;
		int j = 0;
		System.out.println("��λ��Ϊ6���ܱ�3��������Ϊ��");
		for (i = 100; i < 1000; i++) {
			if (i % 3 == 0&&i%10==6) {
				System.out.print(i+"��");
				j++;
			}
		}
		System.out.println();
		System.out.println("��λ��Ϊ6���ܱ�3������������"+j+"��");
	}
	
}
