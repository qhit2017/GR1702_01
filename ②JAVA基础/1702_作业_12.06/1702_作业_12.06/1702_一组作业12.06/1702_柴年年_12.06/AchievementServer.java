package com.achievement;

import java.util.ArrayList;
import java.util.Scanner;

public class AchievementServer implements IAchievement{

	void help(){
		System.out.println("1	¼�뿼���ĸ߿���Ϣ");
		System.out.println("2	��ʾ���п�����Ϣ");
		System.out.println("3	��ѯ��߷�, ����: �ܷ���߷� �� ������߷�");
		System.out.println("4	�˳�����");
	}
	void help1(){
		System.out.println("1	��ӡ�ܷ���߷�");
		System.out.println("2	��ӡ��ѧ��߷�");
		System.out.println("3	��ӡ������߷�");
		System.out.println("4	��ӡӢ����߷�");
		System.out.println("5	�˳�");

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
			if (pion.equals("�ܷ�")) {
				 Max = arrayList.get(0).getTotalscore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getTotalscore()>Max) {
						Max=arrayList.get(i).getTotalscore();
					}
				}
				System.out.println(Max);
			}
			
			if (pion.equals("����")) {
				 Max = arrayList.get(0).getLanguage();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getLanguage()>Max) {
						Max=arrayList.get(i).getLanguage();
					}
				}
				System.out.println(Max);
			}
		
			if (pion.equals("��ѧ")) {
				 Max = arrayList.get(0).getMathematics();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMathematics()>Max) {
						Max=arrayList.get(i).getMathematics();
					}
				}
				System.out.println(Max);
			}
			if (pion.equals("Ӣ��")) {
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

