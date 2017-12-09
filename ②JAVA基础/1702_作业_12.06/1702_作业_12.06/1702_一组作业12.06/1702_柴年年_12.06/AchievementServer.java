package com.achievement;

import java.util.ArrayList;
import java.util.Scanner;

public class AchievementServer implements IAchievement{

	void help(){
		System.out.println("1	录入考生的高考信息");
		System.out.println("2	显示所有考生信息");
		System.out.println("3	查询最高分, 包括: 总分最高分 和 单科最高分");
		System.out.println("4	退出功能");
	}
	void help1(){
		System.out.println("1	打印总分最高分");
		System.out.println("2	打印数学最高分");
		System.out.println("3	打印语文最高分");
		System.out.println("4	打印英语最高分");
		System.out.println("5	退出");

	}
	@Override
	public void addAchievement(ArrayList<Achievement> arrayList, Scanner sc) {
		String s = sc.next();
		String[] arr = s.split(",");
		Achievement achievement = new Achievement();
		achievement.setName(arr[0]);
		achievement.setNumber(arr[1]);
		achievement.setLanguage(Double.parseDouble(arr[2]));
		achievement.setMathematics(Double.parseDouble(arr[3]));
		achievement.setEnglish(Double.parseDouble(arr[4]));
		arrayList.add(achievement);
		infoAchievement(arrayList);
		
	}

	public void infoAchievement(ArrayList<Achievement> arrayList){
		for (Achievement achievement : arrayList) {
			System.out.println(achievement.toString());
		}
	}
	
	public void findAchievement(ArrayList<Achievement> arrayList,String pion){

			double Max;
			if (pion.equals("总分")) {
				 Max = arrayList.get(0).getTotalscore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getTotalscore()>Max) {
						Max=arrayList.get(i).getTotalscore();
					}
				}
				System.out.println(Max);
			}
			
			if (pion.equals("语文")) {
				 Max = arrayList.get(0).getLanguage();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getLanguage()>Max) {
						Max=arrayList.get(i).getLanguage();
					}
				}
				System.out.println(Max);
			}
		
			if (pion.equals("数学")) {
				 Max = arrayList.get(0).getMathematics();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMathematics()>Max) {
						Max=arrayList.get(i).getMathematics();
					}
				}
				System.out.println(Max);
			}
			if (pion.equals("英语")) {
				 Max = arrayList.get(0).getEnglish();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglish()>Max) {
						Max=arrayList.get(i).getEnglish();
					}
				}
				System.out.println(Max);
			}
		}		
	}

