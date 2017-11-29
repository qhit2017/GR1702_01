/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��27�� ����4:26:54 
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
			System.out.println("�������" + (i + 1) + "����");
			a[i] = sc.nextDouble();
		}

		ScorePractice scorePractice = new ScorePractice();
		scorePractice.help();
		boolean isQure = true;

		while (isQure) {
			System.out.println("����������Ҫ��ָ������س�����");

			String b = sc.next();
			switch (b) {
			case "Sum":
				double sum = scorePractice.getSum(a);
				System.out.println("�ܺ�Ϊ" + sum);
				break;
			case "Mean":
				double mean = scorePractice.getMean(a);
				System.out.println("ƽ����Ϊ" + mean);
				break;
			case "Max":
				double max = scorePractice.getMax(a);
				System.out.println("���ֵΪ" + max);
				break;
			case "Min":
				double min = scorePractice.getMin(a);
				System.out.println("��СֵΪ" + min);
				break;
			case "Not":
				int not = scorePractice.Not60(a);
				System.out.println("����������Ϊ" + not);
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
		System.out.println("�ݰ�");

	}

}
