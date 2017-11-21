package com;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i ;
		if(a>b){
			i=a;
			a=b;
			b=i;
		}
		if(a>c){
			i=a;
			a=c;
			c=i;
		}
		if(b>c){
			i=b;
			b=c;
			c=i;
		}
		System.out.println(a+"、"+b+"、"+c);
	sc.close();
	}
}
