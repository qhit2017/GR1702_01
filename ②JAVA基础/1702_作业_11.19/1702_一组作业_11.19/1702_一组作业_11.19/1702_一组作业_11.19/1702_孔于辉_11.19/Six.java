package com;


public class Six {
	public static void main(String[] args) {
		int sum = 0;

		for (int a = 1; a <= 10; a++) {

			sum += a;
			if (sum > 20) {

				System.out.println("1至10之间累加值大于20时输出的数是：" + sum);
				break;
			}

		}

	}

}
