package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月4日 下午5:37:37 
 * @version 1.0 
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Contacts>arrayList = new ArrayList<Contacts>();
		ContactsSerivce cSerivce = new ContactsSerivce();
		
		Scanner sc = new Scanner(System.in);
		cSerivce.helpInfo();
		int key = 0;
		
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				cSerivce.addContacts(arrayList, sc);
				break;
				
			case 2:
				cSerivce.infoContacts(arrayList);
				break;

			case 3:
				String name = sc.next();
				cSerivce.findByName(arrayList, name);
				break;

			case 4:
				String sex = sc.next();
				cSerivce.findBySex(arrayList, sex);
				break;

			case 5:
				String num = sc.next();
				cSerivce.findByNum(arrayList, num);
				break;
				
			case 6:
				isQuit = false;
				break;
				
			default:
				System.out.println("你输入的命令无效！");
				break;
			}
		}
		System.out.println("退出系统");
	}
}
