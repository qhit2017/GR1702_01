package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public abstract  class GradeService implements IGrade {

	@Override
	public void getHelp() {
		// TODO Auto-generated method stub
		System.out.println("----高考评分系统----");
		System.out.println("1、录入考试信息信息");
		System.out.println("2、显示所有考生信息");
		System.out.println("3、查询考生成绩");
		System.out.println("4、退出系统");
		

	}

	@Override
	public void addMessage(ArrayList<Grade> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] arrs = s.split(",");
		if (arrs.length!=5) {
			System.out.println("输入格式有误！");
			System.out.println("请按以下格式输入信息：");
			System.out.println("小明,01,35,69,88");
		} else {
			Grade grade = new Grade();
			grade.setName(arrs[0]);
			grade.setId(arrs[1]);
			grade.setEnglishPoints(Double.parseDouble(arrs[2]));
			grade.setMathPoints(Double.parseDouble(arrs[3]));
			grade.setChinesePoints( Double.parseDouble(arrs[4]));
			grade.getTotalPoints();
			arrayList.add(grade);
			this.infoPoint(arrayList);
		}

	}

	public double getMax(ArrayList<Grade>arrayList,String subject,Scanner sc){
		
		double max = 0;
		if (subject.equals("英语")) {
			max = arrayList.get(0).getEnglishPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishPoints()>max) {
					max=arrayList.get(i).getEnglishPoints();
				}
			
			}
			System.out.println("英语最高分是："+max);
		}
		
		if (subject.equals("数学")) {
			max = arrayList.get(0).getMathPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathPoints()>max) {
					max=arrayList.get(i).getMathPoints();
				}
			
			}
			System.out.println("数学最高分是："+max);
		}
		
		if (subject.equals("语文")) {
			max = arrayList.get(0).getChinesePoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinesePoints()>max) {
					max=arrayList.get(i).getChinesePoints();
				}
			
			}
			System.out.println("语文最高分是："+max);
		}
		
		if (subject.equals("最高分")) {
			max = arrayList.get(0).getTotalPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalPoints()>max) {
					max=arrayList.get(i).getTotalPoints();
				}
			
			}
			System.out.println("总分最高分是："+max);
		}
		return max;
	}

	public void infoPoint(ArrayList<Grade> arrayList){
		for (Grade grade : arrayList) {
			System.out.println(grade.toString());
			
		}
	}
}
