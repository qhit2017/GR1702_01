package com.kyh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<MarkingSystem> arrayList = new ArrayList<MarkingSystem>();
		Scanner sc = new Scanner(System.in);
		MarkingSysteml markingSystem = new MarkingSysteml();
		markingSystem.help();

		boolean condition = true;
		while (condition) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入学生成绩,格式如下：");
				System.out.println("张三,001,（语文成绩）,（数学成绩）,（英语成绩），");
				markingSystem.addArrayList(arrayList, sc);
				break;

			case 2:
				markingSystem.infoArrayList(arrayList);
				break;

			case 3:
				markingSystem.inhelp();
				boolean a = true;
				while (a) {

					int key1 = sc.nextInt();
					switch (key1) {

					case 1:

						markingSystem.findMaxArrayList(arrayList, "总分");
						break;

					case 2:

						markingSystem.findMaxArrayList(arrayList, "数学");
						break;

					case 3:

						markingSystem.findMaxArrayList(arrayList, "英语");
						break;

					case 4:

						markingSystem.findMaxArrayList(arrayList, "语文");
						break;

					case 5:
						a = false;

						break;

					default:
						break;
					}
				}
				markingSystem.help();
				break;
			case 4:
				condition = false;
				break;

			default:
				break;
			}
		}
		System.out.println("再见，谢谢使用！！！");
	}

}
