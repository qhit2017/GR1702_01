package com;


public interface Five {
	public static void main(String[] args) {

		int a = 1;

		do {
			if (a % 3 == 0 || a % 5 == 0)
				System.out.println("1000以内能被5整除，又能被3整除的是：" + a);
			a++;
		} while (a < 1000);
	}

}
