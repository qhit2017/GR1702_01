package com.xx;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scorell s = new Scorell();
		s.A();
		int[] a = new int[10];
		Scanner as = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"���ɼ�");
			a[i] = as.nextInt();
		}
		s.help();
		boolean isQuit = true;
		String s1;
		while(isQuit){
		s1 = as.next();
		switch (s1) {
		case "Average"://ƽ��ֵ
			System.out.println("���гɼ���ƽ��ֵ�ǣ�"+s.getAverage(a));
			break;
		case "Sum"://�ܷ�
			System.out.println("�ܷ�Ϊ��"+s.getSum(a));
			break;
		case "Info"://�鿴���гɼ�
			System.out.println("�����Ǳ��β��Եĳɼ���");
			s.info(a);
			break;
		case "Sort"://�����гɼ��������ӡ
			System.out.println("�����гɼ����������У�");
			s.sort(a);
			break;
		case "Quit"://�˳�
			isQuit = false;
			break;
		case "Max"://�����ֵ
			System.out.println("���β��Ե���߳ɼ��ǣ�"+s.getMax(a));
			break;
		case "Min"://����Сֵ
			System.out.println("���β��Ե���ͳɼ��ǣ�"+s.getMin(a));
			break;
		case "Not60"://�����в�����ĳɼ�
			System.out.println("���β��Բ�������У�"+s.getNot60(a)+"��");
			break;
		default:
			break;
		}
	}
		System.out.println("��л����ʹ�ã��ټ���");
		as.close();
}
}