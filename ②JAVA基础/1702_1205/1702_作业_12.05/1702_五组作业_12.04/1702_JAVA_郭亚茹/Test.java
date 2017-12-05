package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		contactsService.help();
		String key;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.next();
			switch (key) {
			case "add":
				System.out.println("请输入您要添加的信息！");
				contactsService.addContacts(arrayList, sc);
				break;
			case "info":
				contactsService.infoContacts(arrayList);
				break;
			case "name":
				System.out.println("请输入您要查找的姓名！");
				String name = sc.next();
				contactsService.findByname(arrayList, name);
				break;
			case "sex":
				System.out.println("请输入您要查找的性别！");
				String sex = sc.next();
				contactsService.findBysex(arrayList, sex);
				break;
			case "tell":
				System.out.println("请输入您要查找的电话号码！");
				String tell = sc.next();
				contactsService.findBytell(arrayList, tell);
				break;
			case "exit":
				isQuit = false;
				break;
			    default:
				break;
			}

		}
		System.out.println("谢谢！已退出程序!");
	}

}
