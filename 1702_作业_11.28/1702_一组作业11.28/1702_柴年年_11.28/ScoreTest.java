package com.qhit.score;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月27日 下午4:29:36
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ScoreTest {

	public static void main(String[] args) {
		int[] a = { 65, 89, 57, 56, 98, 45, 23, 69, 87, 96 };
		Scanner sc = new Scanner(System.in);
		Scoremanagement iu = new Scoremanagement();
		iu.help();
		boolean isQuit = true;
		String s;
		while (isQuit) {
			System.out.println("输入你要执行的指令,并按回车键");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = iu.getSum(a);
				System.out.println("总分是:" + sum);
				break;
			case "average":
				int average = iu.getAverage(a);
				System.out.println("平均分是:" + average);
				break;
			case "sort":

				iu.sort(a);

				break;
			case "max":

				iu.getMax(a);

				break;
			case "min":

				iu.getMin(a);

				break;
			case "not":

				iu.getNot60(a);

				break;
			case "info":

				iu.info(a);

				break;
			case "Quit":

				isQuit = false;

				break;
			default:
				break;
			}
		}
		System.out.println("拜拜");

	}
}
