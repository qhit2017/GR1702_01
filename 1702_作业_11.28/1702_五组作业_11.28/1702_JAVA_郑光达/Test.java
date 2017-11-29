/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月27日 下午4:26:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.score;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		double[] a = new double[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextDouble();
		}

		ScorePractice scorePractice = new ScorePractice();
		scorePractice.help();
		boolean isQure = true;

		while (isQure) {
			System.out.println("请输入您需要的指令，并按回车键。");

			String b = sc.next();
			switch (b) {
			case "Sum":
				double sum = scorePractice.getSum(a);
				System.out.println("总和为" + sum);
				break;
			case "Mean":
				double mean = scorePractice.getMean(a);
				System.out.println("平均分为" + mean);
				break;
			case "Max":
				double max = scorePractice.getMax(a);
				System.out.println("最大值为" + max);
				break;
			case "Min":
				double min = scorePractice.getMin(a);
				System.out.println("最小值为" + min);
				break;
			case "Not":
				int not = scorePractice.Not60(a);
				System.out.println("不及格人数为" + not);
				break;
			case "Sort":
				scorePractice.sort(a);
				break;
			case "Qure":
				isQure = false;
				break;
			default:
				break;
			}

		}
		System.out.println("拜拜");

	}

}
