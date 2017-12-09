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
			System.out.println("输入你要执行的指令");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("输入你要录入的成绩");
				achServer.addAchievement(arrayList, sc);
				break;
			case 2:
				achServer.infoAchievement(arrayList);
				break;
			case 3:
				achServer.help1();
				System.out.println("请输入要查询的指令");
				boolean isQit = true;
				while (isQit) {
				int key1 = sc.nextInt();
				switch (key1) {
				case 1:
					achServer.findAchievement(arrayList, "总分");
					break;
				case 2:
					achServer.findAchievement(arrayList, "语文");
					break;
				case 3:
					achServer.findAchievement(arrayList, "数学");
					break;
				case 4:
					achServer.findAchievement(arrayList, "英语");
					break;
				case 5:
					isQit = false;
					break;
				default:
					break;
					}
				System.out.println("退出");
				}
				break;
			case 4:
				isQuite = false;
				break;
			default:
				break;
			}
		}
		System.out.println("再见!");
	}
}
