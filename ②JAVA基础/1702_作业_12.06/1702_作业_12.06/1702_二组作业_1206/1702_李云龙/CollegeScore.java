package zk.college.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CollegeScore implements ICollege {
	public void hoip() {
		System.out.println("---高考评分系统");
		System.out.println("1.录入考生信息");
		System.out.println("2.显示所有考生信息");
		System.out.println("3.进入子菜单");
		System.out.println("4.退出");
	}

	public void d() {
		System.out.println("---子菜单---");
		System.out.println("1.打印总分最高分");
		System.out.println("2.打印数学最高分");
		System.out.println("3.打印语文最高分");
		System.out.println("4.打印英语最高分");
		System.out.println("5.退出系统");

	}

	@Override
	public void addCollege(ArrayList<College> arrayList, Scanner sc) {
		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 6) {
			System.out.println("");
		} else {
			College c = new College(s[0], s[1], Double.parseDouble(s[2]),
					Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			arrayList.add(c);
			System.out.println(c.toString());
		}

	}

	@Override
	public void infoCollege(ArrayList<College> arrayList) {
		for (College college : arrayList) {
			System.out.println(college.toString());
		}

	}

	@Override
	public void getMax(ArrayList<College> arrayList, String s) {
		double Max = 0;
		if (s.equals("总分")) {
			Max = arrayList.get(0).getPoints();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getPoints() > Max) {
					Max = arrayList.get(i).getPoints();
				}
			}

		}
		if (s.equals("数学")) {
			Max = arrayList.get(0).getMathematics();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematics() > Max) {
					Max = arrayList.get(i).getMathematics();
				}
			}

		}
		if (s.equals("语文")) {
			Max = arrayList.get(0).getLanguage();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguage() > Max) {
					Max = arrayList.get(i).getLanguage();
				}
			}
		}
		if (s.equals("英语")) {
			Max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > Max) {
					Max = arrayList.get(i).getEnglish();
				}
			}

		}
		System.out.println(Max);
		return;
	}
}
