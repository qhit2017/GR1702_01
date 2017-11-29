package com.kyh;

public class Test10 {

	public static void main(String[] args) {

		int year = 1900;

		while (year < 2017) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year);

			}
			year++;
		}

	}
}
