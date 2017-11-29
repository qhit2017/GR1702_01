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
		System.out.println("10000以内个位数为6且完能被3整除的数有" + count + "个");
	}

}
