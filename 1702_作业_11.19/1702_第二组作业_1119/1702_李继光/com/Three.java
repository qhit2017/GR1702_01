package com;

public class Three {
	public static void main(String[] args) {
		 //编写程序，求个位数为6且能被3整除的数
	
		int i;
		int j = 0;
		System.out.println("个位数为6且能被3整除的数为：");
		for (i = 100; i < 1000; i++) {
			if (i % 3 == 0&&i%10==6) {
				System.out.print(i+"、");
				j++;
			}
		}
		System.out.println();
		System.out.println("个位数为6且能被3整除的数共有"+j+"个");
	}
	
}
