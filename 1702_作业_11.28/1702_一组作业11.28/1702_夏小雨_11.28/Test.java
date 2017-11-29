package com.xxy;

import java.util.Scanner;

public class Test {


public static void main(String[] args) {
	int[] a ={11,22,33,12,32,45,56,45,66,44,};
	
	Scanner sc = new Scanner(System.in);
	ScoreIm  scoreIm = new ScoreIm();
	
	boolean isQuit = true;
	String s;
	scoreIm.help();
	
	while (isQuit){
		System.out.println("请输入你要执行的命令然后按回车键");
		s=sc.next();
	switch (s) {
	case "sum":
		int sum = scoreIm.getSum(a);
		System.out.println("总分是"+sum);
		break;
	case "Average":
		int average = scoreIm.getAverage(a);
		System.out.println("平均分是："+average);
		break;

	case "Max":
		int Max = scoreIm.getMax(a);
		System.out.println("最高分是："+Max);
		break;
		
	case "Min":
		int Min = scoreIm.getMin(a);
		System.out.println("最低分是："+Min);
		break;
		
	case "Not":
		int Not = scoreIm.getNot(a);
		System.out.println("不及格的人数为："+Not);
		break;
		
	case "Info":
		
		scoreIm.info(a);

		break;
		
	case "Sort":
		
		scoreIm.sort(a);

		break;
		
	case "Quit":
		isQuit = false;
		break;
		
	default:
		break;
	}
	}
	System.out.println("欢迎使用！");
}
}
