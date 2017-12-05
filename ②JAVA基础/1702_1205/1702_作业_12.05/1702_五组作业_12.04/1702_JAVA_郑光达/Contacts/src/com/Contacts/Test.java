/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午3:39:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		CommunicationPractice communicationPractice = new CommunicationPractice();

		communicationPractice.getHelp();
		String key;
		boolean isQure = true;
		while (isQure) {
			System.out.println("\n请输入您的指令：");
			key = sc.next();
			switch (key) {
			case "Add":
				System.out.println("\t---请输入您要添加的信息---");
				System.out.println("\t格式为:");
				System.out.println("\t(名字,性别,手机号码)");
				communicationPractice.Add(arrayList, sc);
				break;
				
			case "Info":
				communicationPractice.Info(arrayList);
				break;

			case "Name":
				System.out.println("\n请输入您要查找的姓名:");
				String category = sc.next();
				communicationPractice.FindName(arrayList, category);
				break;
				
			case "Sex":
				System.out.println("\n请输入您要查找的性别:");
				String sex = sc.next();
				communicationPractice.FindSex(arrayList, sex);
				break;
				
			case "Number":
				System.out.println("\n请输入您要查找的手机号码:");
				String phone = sc.next();
				communicationPractice.FindNumber(arrayList, phone);
				break;
				
			case "Exit":
				isQure = false;
				break;

			default:
				System.out.println("\n\t---您输入的指令有误---");
				break;
			}

		}
		System.out.println("\n\t---退出系统---");
	}

}
