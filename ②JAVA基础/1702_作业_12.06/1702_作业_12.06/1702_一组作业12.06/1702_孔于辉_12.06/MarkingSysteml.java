package com.kyh;

import java.util.ArrayList;
import java.util.Scanner;

public class MarkingSysteml implements Imarking{
	
	void help(){
		System.out.println("~~~~~~~~~~高考评分系统~~~~~~~~");
		System.out.println("【1】录入考生的高考信息");
		System.out.println("【2】显示所有考生信息");
		System.out.println("【3】查询最高分");
		System.out.println("【4】退出功能");
	}
	
	void inhelp(){
		System.out.println("[1]打印总分最高分");
		System.out.println("[2]打印数学最高分");
		System.out.println("[3]打印语文最高分");
		System.out.println("[4]打印英语最高分");
		System.out.println("[5]退出");
	}
	
	@Override
	public void addArrayList(ArrayList<MarkingSystem> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length==5) {
			MarkingSystem markingSystem = new MarkingSystem(a[0], a[1], Double.parseDouble(a[2]), Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(markingSystem);
			
			System.out.println(arrayList.toString());
		} else {
		System.out.println("您所输入的信息格式不正确！！！");

		}
		
		
	}

	@Override
	public void infoArrayList(ArrayList<MarkingSystem> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		
	}

	@Override
	public void findMaxArrayList(ArrayList<MarkingSystem> arrayList,
			String subject) {
		double Max;
		if (subject.equals("总分")) {
			 Max = arrayList.get(0).getTotalPoints();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalPoints()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("最高总分为："+Max);
		}
		
		if (subject.equals("数学")) {
			 Max = arrayList.get(0).getMathScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("数学最高分为："+Max);
		}
	
		if (subject.equals("语文")) {
			 Max = arrayList.get(0).getChineseScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChineseScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("语文最高分为："+Max);
		}
		if (subject.equals("英语")) {
			 Max = arrayList.get(0).getEnglishScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("英语最高分为："+Max);
		}
	}

	

}
