package com.qjit;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaokaoservice implements Igaokao {

	void helpInfo() {
		System.out.println("�߿�����ϵͳ");
		System.out.println("��1¼��ѧ���ɼ���Ϣ");
		System.out.println("��2�鿴����ѧ���ɼ���Ϣ");
		System.out.println("��3�鿴����ѧ���ɼ���߷�");
		System.out.println("��4�˳�ϵͳ");
	}

	void helpMax() {
		System.out.println("��߷ֲ�ѯ");
		System.out.println("��1��ѯ�ܷ���߷�");
		System.out.println("��2��ѯ��ѧ��߷�");
		System.out.println("��3��ѯ������߷�");
		System.out.println("��4��ѯӢ����߷�");
		System.out.println("��5�˳���߷ֲ�ѯ");
	}

	@Override
	public void addGaokao(ArrayList<Gaokao> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 5) {
			System.out.println("����ĸ�ʽ����");
		} else {
			Gaokao gaokao = new Gaokao(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(gaokao);

			System.out.println(gaokao.toString());

		}

	}

	@Override
	public void infoGaokao(ArrayList<Gaokao> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Gaokao gaokao = arrayList.get(i);
			System.out.println(gaokao.toString());
		}

	}

	@Override
	public void getMax(ArrayList<Gaokao> arrayList, String subjiect) {
		double Max = 0;

		if (subjiect.equals("�ܷ�")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal() > Max) {
					Max = arrayList.get(i).getTotal();
				}

			}
		}
		if (subjiect.equals("��ѧ")) {
			Max = arrayList.get(0).getMathematics();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematics() > Max) {
					Max = arrayList.get(i).getMathematics();
				}

			}
		}
		if (subjiect.equals("����")) {
			Max = arrayList.get(0).getLanguage();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguage() > Max) {
					Max = arrayList.get(i).getLanguage();
				}

			}
		}
		if (subjiect.equals("Ӣ��")) {
			Max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > Max) {
					Max = arrayList.get(i).getEnglish();
				}

			}
		}
		System.out.println(Max);

	}

}
