package com.chen;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong271406@163.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:13:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		int[] a = {58,68,79,89,22,99,65,36,95,77};
		Scanner sc = new Scanner(System.in);
		Score scoreImplment = new ScoreImplment();
		boolean isQuit = true;
		String s;
		scoreImplment.help();
		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ������س���");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = scoreImplment.getSum(a);
				System.out.println("�ܷ���"+sum);
				break;
			
			case "Average":
				
				int average = scoreImplment.getAverage(a);
				System.out.println("��ƽ������"+average);
				break;
				
			case "Info":
				
				scoreImplment.info(a);

				break;
			
			case "Sort":
				
				scoreImplment.sort(a);

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
