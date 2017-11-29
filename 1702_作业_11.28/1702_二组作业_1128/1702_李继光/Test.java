package com.xx;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scorell s = new Scorell();
		s.A();
		int[] a = new int[10];
		Scanner as = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个成绩");
			a[i] = as.nextInt();
		}
		s.help();
		boolean isQuit = true;
		String s1;
		while(isQuit){
		s1 = as.next();
		switch (s1) {
		case "Average"://平均值
			System.out.println("所有成绩的平均值是："+s.getAverage(a));
			break;
		case "Sum"://总分
			System.out.println("总分为："+s.getSum(a));
			break;
		case "Info"://查看所有成绩
			System.out.println("以下是本次测试的成绩：");
			s.info(a);
			break;
		case "Sort"://将所有成绩按升序打印
			System.out.println("将所有成绩按升序排列：");
			s.sort(a);
			break;
		case "Quit"://退出
			isQuit = false;
			break;
		case "Max"://求最大值
			System.out.println("本次测试的最高成绩是："+s.getMax(a));
			break;
		case "Min"://求最小值
			System.out.println("本次测试的最低成绩是："+s.getMin(a));
			break;
		case "Not60"://求所有不及格的成绩
			System.out.println("本次测试不及格的有："+s.getNot60(a)+"个");
			break;
		default:
			break;
		}
	}
		System.out.println("感谢您的使用，再见！");
		as.close();
}
}