package Guo;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 成绩>=90分用A表示，60-89用B表示，60以下用c表示。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的分数：");
		int score = sc.nextInt();
		System.out.println("你输入的分数是：" + score);
		if (score >= 90) {
			System.out.println("A");
		}
		if (score >= 60 && score < 89) {
			System.out.println("B");
		}
		if (score < 60) {
			System.out.println("c");
		}
	}
}