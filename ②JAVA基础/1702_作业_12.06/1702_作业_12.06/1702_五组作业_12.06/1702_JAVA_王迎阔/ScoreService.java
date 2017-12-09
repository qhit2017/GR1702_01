package com.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore{
	
	void helpSubInfo(){
		System.out.println("-----子菜单-----");
		System.out.println("[1]  总成绩最高分，请输入1;");
		System.out.println("[2]  数学最高分，请输入2;");
		System.out.println("[3]  语文最高分，请输入3;");
		System.out.println("[4]  英语最高分，请输入4;");
		System.out.println("[5]  返回主菜单, 请输入5;");
	}
	@Override
	public void help() {
		System.out.println("-----高考评分系统-----");
		System.out.println("[1]录入考生信息，请输入1;");
		System.out.println("[2]查询考生信息，请输入2;");
		System.out.println("[3]进入最高分数查询的子菜单，请输入3;");
		System.out.println("[4]退出查询系统，请输入4;");
		
		
	}

	@Override
	public void addExaminee(ArrayList<student> arrayList, Scanner sc) {
		// 从键盘录入：
				String s = sc.next();
				// 拆分字符串
				String[] a = s.split(",");

				int leanth = a.length;

				if (leanth != 5) {
					System.out.println("您输入的信息有误，请重新输入,格式如下");
					System.out.println("老李，001，120，99，65");
				} else {

					// 实例化student类
					student student = new student();
					// 为考生添加信息
					student.setName(a[0]);
					student.setId(a[1]);
					student.setLanguageScore(Double.parseDouble(a[2]));
					student.setMathematicsScore(Double.parseDouble(a[3]));
					student.setEnglishScore(Double.parseDouble(a[4]));
					// 增加考生信息
					arrayList.add(student);
					//输入录入信息
					//infoStudent(arrayList);
					System.out.println(student.toString());
				}
	}

	@Override
	public void Information(ArrayList<student> arrayList) {
		student student;
		for (int i = 0; i < arrayList.size(); i++) {
			student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}
	}

	@Override
	public double getMax(ArrayList<student> arrayList, String subject) {
		double max = max(arrayList, subject);
		return max;
	}
		private double max(ArrayList<student> arrayList, String subject) {
			double max = 0;
			if (subject.equals("总成绩")) {
				max = arrayList.get(0).getTotalScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getTotalScore() > max) {
						max = arrayList.get(i).getTotalScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("语文")) {
				max = arrayList.get(0).getLanguageScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getLanguageScore() > max) {
						max = arrayList.get(i).getLanguageScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("数学")) {
				max = arrayList.get(0).getMathematicsScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMathematicsScore() > max) {
						max = arrayList.get(i).getMathematicsScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("英语")) {
				max = arrayList.get(0).getEnglishScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglishScore() > max) {
						max = arrayList.get(i).getEnglishScore();
					}
				}System.out.println(max);
			}
			return max;
	}

	
}
