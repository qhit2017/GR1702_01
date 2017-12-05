package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午2:40:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestContacts {

	public static void main(String[] args) {
		ArrayList<Contacts> arr=new ArrayList<Contacts>();
		ContactsSer con=new ContactsSer();
		Scanner sc=new Scanner(System.in);
		System.out.println("----------通讯录系统----------");
		boolean is=true;
		while (is) {
			System.out.println("请输入指令：（输入【0】查看帮助）");
			String key=sc.next();
			switch (key) {
			case "0":
				con.help();
				break;
			case "1":
				con.addcon(arr, sc);
				break;
			case "2":
				con.info(arr);
				break;
			case "3":
				con.findby(arr, sc);
				break;
			case "9":
				is=false;
				System.out.println("感谢您的使用，再见！");
				break;
			default:
				System.out.println("指令无效，请重新输入！");
				break;
			}
		}

	}

}
