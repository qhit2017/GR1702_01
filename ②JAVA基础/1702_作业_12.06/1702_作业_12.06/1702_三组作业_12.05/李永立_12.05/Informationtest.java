package com.lyl.qhit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Informationtest {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		StudentRealize studentRealize = new StudentRealize();

		studentRealize.helpinfo();

		boolean isQust = true;
		boolean subisQust=false;

		int key;
		while (isQust) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入考生的信息，按下面格式：");
				System.out.println("考生姓名,编号,语文成绩,数学成绩, 英语成绩,总分");
				studentRealize.addInformation(arrayList, sc);
				studentRealize.infoInformation(arrayList);
				break;
			case 2:
				studentRealize.infoInformation(arrayList);
				

				break;
			case 3:
				studentRealize.subHelp();
				  subisQust = true;
				while (subisQust) {
					key = sc.nextInt();
					switch (key) {
					
					case 1:
					studentRealize.getMax(arrayList, "总分");
						

						break;
					case 2:
						studentRealize.getMax(arrayList, "语文");
						break;

					case 3:
						studentRealize.getMax(arrayList, "数学");

						break;

					case 4:
						studentRealize.getMax(arrayList, "英语");
						break;

					case 5:
						 subisQust= false;
						System.out.println("退出子菜单");
						break;
					default:
						break;
					}

				}

				break;

			case 4:
				isQust = false;
				break;
			default:
				System.out.println("你输入的指令无效！");
				break;
			}
			
		}
		System.out.println("感谢你的使用，再见！");
	}
}
