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
 			System.out.println("�������"+(i+1)+"������");
			a[i] = sc.nextInt();
		}
		String s;
		boolean isquit = true ;
		scoreimplement.getHelp(a);
		System.out.println("������ָ������س���ִ��");
		
		while(isquit) {
			s = sc.next();
			
			switch (s) {
			case "sum":
				
				System.out.println("�ɼ�֮��Ϊ��"+scoreimplement.getSum(a));
				break;
			case "average":
				
				System.out.println("�ɼ�ƽ����Ϊ��"+scoreimplement.getAverage(a));
				break;
			case "max":
				
				System.out.println("�ɼ����ֵΪ��"+scoreimplement.getMax(a));
				break;
			case "min":
				
				System.out.println("�ɼ���СֵΪ��"+scoreimplement.getMin(a));
				break;
			case "sort":
				
				scoreimplement.sort(a);
				break;
			case "info":
				
				scoreimplement.getInfo(a);
				break;
			case "not60":
				
				System.out.println("����������Ϊ��"+scoreimplement.getOut60(a));
				break;
			case "quit":
				
				isquit = false;
				break;

				

			default:
				break;
			}
			
			}
		System.out.println("�ݰ�~~");

	}

}
