package com.test;

import java.util.Scanner;

//��ʦ�����Ҳ��ᣬ������Ĵ���

public class Test002 {

	static String decimalToHex(int x) {
		String hex = " ";
		while (x != 0) {
			int hexValue = x % 16;
			hex = decimalToChar(hexValue) + hex;
			x = x / 16;
		}
		return hex;
	}

	static char decimalToChar(int p) {
		if (p >= 0 && p <= 9) {
			return (char) (p + '0');
		} else {
			return (char) (p - 10 + 'A');
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����10~99֮���һ��ʮ����������:");
		int x = sc.nextInt();
		System.out.println(decimalToHex(x));

	}

}
