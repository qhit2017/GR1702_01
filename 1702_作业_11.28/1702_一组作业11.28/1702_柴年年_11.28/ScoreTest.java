package com.qhit.score;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����4:29:36
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
			System.out.println("������Ҫִ�е�ָ��,�����س���");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = iu.getSum(a);
				System.out.println("�ܷ���:" + sum);
				break;
			case "average":
				int average = iu.getAverage(a);
				System.out.println("ƽ������:" + average);
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
		System.out.println("�ݰ�");

	}
}
