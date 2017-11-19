package com.qhit;

import java.util.Scanner;

public class Compare {
	
	public static void main(String[] args) {
		//从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数a:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数b:");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数c:");
		int c = sc.nextInt();
		System.out.println("请输入第四个整数d:");
		int d = sc.nextInt();
		int e =0;
		if(a>b){
			e=a;
			a=b;
			b=e;
		}
		if(a>c){
			e=a;
			a=c;
			c=e;
		}
		if(a>d){
			e=a;
			a=d;
			d=e;
		}
		if(b>c){
			e=b;
			b=c;
			c=e;
		}
		if(b>d){
			e=b;
			b=d;
			d=e;
		}
		if(c>d){
			e=c;
			c=d;
			d=e;
		}
		
		
		System.out.println("从大到小依次排列："+"\n"+d+"\t"+c+"\t"+b+"\t"+a);
		
		sc.close();
		}
		
	}


