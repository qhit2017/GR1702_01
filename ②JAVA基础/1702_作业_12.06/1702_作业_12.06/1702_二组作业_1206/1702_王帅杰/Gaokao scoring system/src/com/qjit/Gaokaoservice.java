package com.qjit;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaokaoservice implements Igaokao {

	void helpInfo() {
		System.out.println("高考管理系统");
		System.out.println("按1录入学生成绩信息");
		System.out.println("按2查看所有学生成绩信息");
		System.out.println("按3查看各科学生成绩最高分");
		System.out.println("按4退出系统");
	}

	void helpMax() {
		System.out.println("最高分查询");
		System.out.println("按1查询总分最高分");
		System.out.println("按2查询数学最高分");
		System.out.println("按3查询语文最高分");
		System.out.println("按4查询英语最高分");
		System.out.println("按5退出最高分查询");
	}

	@Override
	public void addGaokao(ArrayList<Gaokao> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 5) {
			System.out.println("输入的格式不对");
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

		if (subjiect.equals("总分")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal() > Max) {
					Max = arrayList.get(i).getTotal();
				}

			}
		}
		if (subjiect.equals("数学")) {
			Max = arrayList.get(0).getMathematics();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematics() > Max) {
					Max = arrayList.get(i).getMathematics();
				}

			}
		}
		if (subjiect.equals("语文")) {
			Max = arrayList.get(0).getLanguage();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguage() > Max) {
					Max = arrayList.get(i).getLanguage();
				}

			}
		}
		if (subjiect.equals("英语")) {
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
