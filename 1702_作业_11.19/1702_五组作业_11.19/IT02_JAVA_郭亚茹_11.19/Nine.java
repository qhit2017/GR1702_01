package guo;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// ͨ��һ������̨����һ������N(N������10000)�������7�ı�������7�����֡�
		Scanner sc = new Scanner(System.in);

		for (int a = 7; a < 10000; a++) {

			if (a % 7 == 0) {

				System.out.println(a);
			}
		}

	}
}