package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLiStExaminee implements IEntering {

	@Override
	public void help() {
		System.out.println("----------高考评分系统帮助----------");
		System.out.println("【1】录入考生的高考信息请输入1");
		System.out.println("【2】显示所有考生信息请输入2");
		System.out.println("【3】查询最高分请输入3");
		System.out.println("【4】退出程序请输入4");
	}
	@Override
	public void help3() {
		System.out.println("----------子菜单----------");
		System.out.println("【1】打印总分最高分请输入1");
		System.out.println("【2】打印数学最高分请输入2");
		System.out.println("【3】打印语文最高分请输入3");
		System.out.println("【4】打印英语最高分请输入4");
		System.out.println("【5】退出请输入5");
		
	}
	

	@Override
	public void addInformation(ArrayList<Examinee> arrayList, Scanner sc) {
		String a =sc.next();
		String[] arrs = a.split(",");
		if (arrs.length!=5) {
			
			System.out.println("您输入格式有误,请重新输入，格式如下:");
			System.out.println("小米,001,100,100,100");
		} else {
			Examinee q = new Examinee(arrs[0],arrs[1],Double.parseDouble(arrs[2]), Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]));
			arrayList.add(q);
			System.out.println(q.toString());

		}
	}

	@Override
	public void infoEntering(ArrayList<Examinee> arrayList) {
		for (Examinee examinee : arrayList) {
			System.out.println(examinee.toString());
		}

	}

	@Override
	public void findGradeMax(ArrayList<Examinee> arrayList,
			String Grade) {
		double Max = 0;
		if (Grade.equals("总成绩")) {
	
		Max=arrayList.get(0).getTotal();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(0).getTotal()>Max) {
				Max = arrayList.get(0).getTotal();
				
			}
		}
		System.out.println(Max);
		}
		if (Grade.equals("语文")) {
			
			Max = arrayList.get(0).getLanguageGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguageGrade()>Max) {
					Max = arrayList.get(i).getLanguageGrade();
					
				}
			}
			System.out.println(Max);
			}
		if (Grade.equals("数学")) {
			
			Max = arrayList.get(0).getMathematicsGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematicsGrade()>Max) {
					Max = arrayList.get(i).getMathematicsGrade();
					
				}
			}
			System.out.println(Max);
			}
		if (Grade.equals("英语")) {
			
			Max = arrayList.get(0).getEnglishGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishGrade()>Max) {
					Max = arrayList.get(i).getEnglishGrade();
					
				}
			}
			System.out.println(Max);
			}
		
		
	}

	


	

}
