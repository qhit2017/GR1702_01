package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

/**制作者：陈亮亮
 *制作时间：2017年12月4日下午5:21:09
 *邮箱：2507147605@qq.com
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts>arrayList = new ArrayList<Contacts>();
		Contactsser contactsser =new Contactsser();
		Scanner  sc=new Scanner(System.in);
		contactsser.help();
		
		boolean isQuit =true;
		while (isQuit) {
			System.out.println("请输入你的指令");
			String key = sc .next();
			switch (key) {
			case "1":
				contactsser.add(arrayList, sc);
				break;
			case "2":
				contactsser.info(arrayList );
				break;
			case "3":
				
				String category = sc.next();
				contactsser.findName(arrayList, category);
				break;
				case "4":
				String sex = sc.next();
				contactsser.findsex(arrayList,sex);
				break;
				case "5":
					
					String number= sc.next();
					contactsser.findNumber(arrayList,number);
					
				break;
				case "6":
					 isQuit =false;
				break;
			default:
				System.out.println("你的输入无效");
				break;
			}
		}
		System.out.println("拜拜");
		
	}

}
