package com.kyh;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int a = 1; a < 10000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				count++;

			}

		}
		System.out.println("10000���ڸ�λ��Ϊ6�����ܱ�3����������" + count + "��");
	}

}
