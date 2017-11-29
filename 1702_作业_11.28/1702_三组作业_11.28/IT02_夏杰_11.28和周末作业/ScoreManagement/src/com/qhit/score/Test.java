package com.qhit.score;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		Scoreimplement scoreimplement = new Scoreimplement();
		
 		Scanner sc = new Scanner(System.in);
 		for (int i = 0; i < a.length; i++) {
 			System.out.println("请输入第"+(i+1)+"个数：");
			a[i] = sc.nextInt();
		}
		String s;
		boolean isquit = true ;
		scoreimplement.getHelp(a);
		System.out.println("请输入指令，并按回车键执行");
		
		while(isquit) {
			s = sc.next();
			
			switch (s) {
			case "sum":
				
				System.out.println("成绩之和为："+scoreimplement.getSum(a));
				break;
			case "average":
				
				System.out.println("成绩平均数为："+scoreimplement.getAverage(a));
				break;
			case "max":
				
				System.out.println("成绩最大值为："+scoreimplement.getMax(a));
				break;
			case "min":
				
				System.out.println("成绩最小值为："+scoreimplement.getMin(a));
				break;
			case "sort":
				
				scoreimplement.sort(a);
				break;
			case "info":
				
				scoreimplement.getInfo(a);
				break;
			case "not60":
				
				System.out.println("不及格人数为："+scoreimplement.getOut60(a));
				break;
			case "quit":
				
				isquit = false;
				break;

				

			default:
				break;
			}
			
			}
		System.out.println("拜拜~~");

	}

}
