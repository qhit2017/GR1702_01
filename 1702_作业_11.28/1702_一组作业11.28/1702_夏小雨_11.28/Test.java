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
		System.out.println("��������Ҫִ�е�����Ȼ�󰴻س���");
		s=sc.next();
	switch (s) {
	case "sum":
		int sum = scoreIm.getSum(a);
		System.out.println("�ܷ���"+sum);
		break;
	case "Average":
		int average = scoreIm.getAverage(a);
		System.out.println("ƽ�����ǣ�"+average);
		break;

	case "Max":
		int Max = scoreIm.getMax(a);
		System.out.println("��߷��ǣ�"+Max);
		break;
		
	case "Min":
		int Min = scoreIm.getMin(a);
		System.out.println("��ͷ��ǣ�"+Min);
		break;
		
	case "Not":
		int Not = scoreIm.getNot(a);
		System.out.println("�����������Ϊ��"+Not);
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
	System.out.println("��ӭʹ�ã�");
}
}
