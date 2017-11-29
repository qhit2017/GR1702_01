package com.zk.qhit;

import java.util.Scanner;

//作者：梁营营；
public class Test {

	public static void main(String[] args) {
		System.out.println("作业三：");
		System.out.println("\n");
		// 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		// 程序分析：(a>b)?a:b这是条件运算符的基本例子。
		Scanner sc = new Scanner(System.in);
		char A = 'A';
		char B = 'B';
		char C = 'C';
		System.out.println("请输入学习成绩：");
		int i = sc.nextInt();
		if (i >= 90) {
			System.out.println(A);
		} else {
			if ((i >= 60) && (i <= 89)) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		}
	}

}
