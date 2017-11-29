package com.test;

public class Test07 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 1000) {
			if ((i % 5 == 0) && (i % 10 != 0)) {
				System.out.println(i);

			}
			i++;
		}
	}

}
