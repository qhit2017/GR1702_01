package com.zk.qhit;

import java.util.Scanner;

//学习成绩>=90分的同学用A表示
//60-89分之间的用B表示
//60分以下的用C表示
public class TripleOperation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学习成绩");
		int score = s.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 60 && score <= 89) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		s.close();
	}
}
