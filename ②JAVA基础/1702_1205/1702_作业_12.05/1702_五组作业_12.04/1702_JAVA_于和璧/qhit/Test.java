package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		
		ContactsService a1 = new ContactsService();
		
		Scanner sc = new Scanner(System.in);
		
		a1.help();
		
		boolean isQuit = true;
		
		while (isQuit) {
			
			System.out.println("请输入命令并按回车键！");
			
			String key = sc.next();
			
			switch (key) {
			case "add":
				
				System.out.println("请输入您要录入的信息！");
				
				a1.addContacts(arrayList, sc);
				
				break;
			case "info":
				
				a1.info(arrayList);
				
				break;
			/*case "findname":
				
				System.out.println("请输入您要查找的姓名！");
				
				String name = sc.next();
				
				a1.findByname(arrayList, name);
				
				break;
			case "findsex":
				
				System.out.println("请输入您要查找的性别！");
				
				String sex = sc.next();
				
				a1.findBysex(arrayList, sex);
				
				break;
			case "findnumber":
				
				System.out.println("请输入您要查找的电话号码！");
				
				String num = sc.next();
				
				a1.findBynumber(arrayList, num);
				
				break;
				*/
			case "findname":
				
				System.out.println("请输入您要查找的姓名！");
				a1.findBynamesexnumber(arrayList, "姓名", sc);
				break;
			case "findsex":
				
				System.out.println("请输入您要查找的性别！");
				
				a1.findBynamesexnumber(arrayList, "性别", sc);
				
				break;
			case "findnumber":
				
				System.out.println("请输入您要查找的电话号码！");
				
				a1.findBynamesexnumber(arrayList, "电话号码", sc);
				
				break;
			case "Quit":
				
				isQuit = false;
				
				break;

			default:
				System.out.println("对不起！您输入的命令有误！请重新上输入！");
				break;
			}
		}
	

		System.out.println("已退出程序！");
	}

}
