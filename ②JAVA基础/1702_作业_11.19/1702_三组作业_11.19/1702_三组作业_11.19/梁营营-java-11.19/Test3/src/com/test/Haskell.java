package com.test;

//��ҵʮ��
//���ߣ���ӪӪ��
public class Haskell {
	public static void main(String[] args) {
		// ����˷��ھ�����ʹ��whiteѭ��ʵ�֣���
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
