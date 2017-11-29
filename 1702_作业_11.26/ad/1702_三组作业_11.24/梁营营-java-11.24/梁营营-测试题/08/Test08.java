package com.test;

public class Test08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			if (i % 10 == 6 && (i % 3 == 0)) {
				System.out.println(i);
			}
		}

	}

}
