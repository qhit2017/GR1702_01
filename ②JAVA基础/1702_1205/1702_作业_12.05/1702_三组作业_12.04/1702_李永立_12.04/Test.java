package com.lyl;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月4日 下午5:16:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		
		ContactsService service = new ContactsService();
		Scanner sc = new Scanner(System.in);
		service.helpinfo();
		
		boolean isquest = true;
		int key=0;
		while (isquest) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入 姓名 ， 性别， 电话号码");
				service.addContacts(arrayList, sc);
				break;
			case 2:
				
				service.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("请输入你要查找联系人的姓名：");
				String name2 = sc.next();
				service.findname(arrayList, name2);
				break;
			case 4:
				System.out.println("请输入你要查找联系人的性别：");
				String sex = sc.next();
				service.findsex(arrayList, sex);
				break;
			case 5:
			System.out.println("请输入你要查找联系人的电话：");
				String num= sc.next();
				service.findnum(arrayList, num);
				break;
			case 6:
				isquest = false;
				break;
              default:
            	  System.out.println("您输入的指令无效!");
				break;
			}
		}
		System.out.println("感谢你的使用，再见！");
		
	}

}
