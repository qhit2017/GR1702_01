package com;


public interface Five {
	public static void main(String[] args) {

		int a = 1;

		do {
			if (a % 3 == 0 || a % 5 == 0)
				System.out.println("1000�����ܱ�5���������ܱ�3�������ǣ�" + a);
			a++;
		} while (a < 1000);
	}

}
