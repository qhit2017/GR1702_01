package com.achievement;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Achievement> arrayList = new ArrayList<Achievement>();
		AchievementServer achServer = new AchievementServer();
		achServer.help();
		boolean isQuite = true;
		int key;
		while (isQuite) {
			System.out.println("������Ҫִ�е�ָ��");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("������Ҫ¼��ĳɼ�");
				achServer.addAchievement(arrayList, sc);
				break;
			case 2:
				achServer.infoAchievement(arrayList);
				break;
			case 3:
				achServer.help1();
				System.out.println("������Ҫ��ѯ��ָ��");
				boolean isQit = true;
				while (isQit) {
				int key1 = sc.nextInt();
				switch (key1) {
				case 1:
					achServer.findAchievement(arrayList, "�ܷ�");
					break;
				case 2:
					achServer.findAchievement(arrayList, "����");
					break;
				case 3:
					achServer.findAchievement(arrayList, "��ѧ");
					break;
				case 4:
					achServer.findAchievement(arrayList, "Ӣ��");
					break;
				case 5:
					isQit = false;
					break;
				default:
					break;
					}
				System.out.println("�˳�");
				}
				break;
			case 4:
				isQuite = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�ټ�!");
	}
}
