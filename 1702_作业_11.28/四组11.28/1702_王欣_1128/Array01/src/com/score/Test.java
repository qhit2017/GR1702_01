package com.score;

import java.util.Scanner;
/*制作人：王欣
 *制作时间：2017年11月27日下午4:26:49
 *邮箱：2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		int[] a={24,77,87,96,79,56,64,93,41,74};
		Scanner sc = new Scanner(System.in);
		ScoreImplement scoreImplement=new ScoreImplement();
		scoreImplement.help();
		boolean is=true;
		while(is){
			is=true;
			String x=sc.next();
		switch (x) {
		case "Sum":
			int p=scoreImplement.getSum(a);
			System.out.println(p);
			break;
		case "Average":
			int q=scoreImplement.getAverage(a);
			System.out.println(q);
			break;
		case "Info":
			scoreImplement.info(a);
			break;
		case "Not":
			int w=scoreImplement.getNot60(a);
			System.out.println(w);
			break;
		case "Max":
			int e=scoreImplement.getMax(a);
			System.out.println(e);
			break;
		case "Min":
			int r=scoreImplement.getMin(a);
			System.out.println(r);
			break;
		case "Sort":
			scoreImplement.sort(a);
			break;
		case "Quit":
			is=false;
			break;
		default:
			break;
		}
		}
		
		System.out.println("拜拜");
	}
	

}
