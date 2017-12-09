package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayLiStExaminee arrayLiStExaminee = new ArrayLiStExaminee();
		
		ArrayList<Examinee> arrayList = new ArrayList<Examinee>();
		
		arrayLiStExaminee.help();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isQuit = true;
		while (isQuit) {
			
			System.out.println("请输入命令并按回车键！");
			String s = sc.next();
			switch (s) {
			case "1":
				System.out.println("请输入考生信息");
				arrayLiStExaminee.addInformation(arrayList, sc);
				break;
			case "2":
				arrayLiStExaminee.infoEntering(arrayList);
				break;
			case "3":
				arrayLiStExaminee.help3();
				boolean isExit = true;
				while(isExit){
					System.out.println("请输入命令并按回车键！");
				String c = sc.next();
				switch (c) {
				case "1":
					arrayLiStExaminee.findGradeMax(arrayList, "总成绩");
					break;
				case "2":
					arrayLiStExaminee.findGradeMax(arrayList, "数学");
					break;
				case "3":
					arrayLiStExaminee.findGradeMax(arrayList, "语文");
					break;
				case "4":
					arrayLiStExaminee.findGradeMax(arrayList, "英语");
					break;
				case "5":
					
					isExit = false;
					
					break;

				default:
					
					System.out.println("您输入的命令有误请重新输入！");
					
					break;
				}
				}
				System.out.println("已退出子菜单！");
				break;
			case "4":
				
				isQuit = false;
				
				break;

			default:
				
				System.out.println("您输入的命令有误请重新输入！");
				
				break;
			}
		}
		System.out.println("已退出程序！");
		
	}

}
