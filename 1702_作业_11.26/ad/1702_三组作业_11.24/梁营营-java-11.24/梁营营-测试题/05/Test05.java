package com.test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("��������ֵ��");
		int x = sc.nextInt();
		System.out.println("������������ǣ�"+x);
		int y = sc.nextInt();
		System.out.println("������������ǣ�"+y);
		int z = sc.nextInt();
		System.out.println("������������ǣ�"+z);
		int h=0;
		if (x>y) {
			h=x;
			x=y;
			y=h;
		}
		if (x>z) {
			h=x;
			x=z;
			z=h;
		}
		if (y>z) {
			h=y;
			y=z;
			z=h;
		}
		System.out.println(x+"<"+y+"<"+z);
	}

}
