package com.zk.qhit;

public class Exact {
	public static void main(String[] args) {
		/**
		 * ��1000��Ϊ�����ܱ�5���������ܱ�3����
		 * ����������
		 */
		int a = 1;
		do{if(a % 5 == 0 && a % 3 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 1000);

	}
}
