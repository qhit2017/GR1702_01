package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:34:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		ScoreImplment scoreImplment =new ScoreImplment();
		int[] a = {12,23,15,16,85,8,7,9,45,56};
		Scanner sc = new Scanner(System.in);	
		boolean isquit =true;
		String s;
scoreImplment.help();
		
		while (isquit) {
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
			case "Max":
				
				int Max= scoreImplment.getMax(a);
				System.out.println("���ֵ�ǣ�"+Max);
				break;
				
			case "Min":
				
				int Min= scoreImplment.getMin(a);
				System.out.println("��Сֵ�ǣ�"+Min);
				break;
			case"Not60":
				int Not60 =scoreImplment.getMin(a);
				System.out.println("������������"+Not60);
				break;
			case "isquit":
				isquit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("�ݰ�");
	}

	}

