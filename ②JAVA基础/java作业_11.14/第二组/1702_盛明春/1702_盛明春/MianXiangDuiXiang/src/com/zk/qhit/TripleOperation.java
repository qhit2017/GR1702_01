package com.zk.qhit;

import java.util.Scanner;

//ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ
//60-89��֮�����B��ʾ
//60�����µ���C��ʾ
public class TripleOperation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧϰ�ɼ�");
		int score = s.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 60 && score <= 89) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		s.close();
	}
}
