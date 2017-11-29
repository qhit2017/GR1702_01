package com.zk.qhit;

import java.util.Scanner;

public class Jiuti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë1~10000Êı×Ö");
		int N = sc.nextInt();
		if(N<=10000){
		for (int i = 1; i < N; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i % 100 == 7 || i / 10 % 10 == 7) {
				System.out.println(i);
			}
			}
		}
		sc.close();
	}
}
