package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午3:15:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ContactsSer implements IContacts {

	public void help(){
		System.out.println("【1】添加新的联系人");
		System.out.println("【2】查看当前联系人列表");
		System.out.println("【3】查询指定联系人");
		System.out.println("【9】退出");
	}
	@Override
	public void addcon(ArrayList<Contacts> arraylist, Scanner sc) {
		boolean issame=true;
		boolean issames=true;
		String names=null;
		while (issame) {
			issames=true;
			System.out.println("请输入新的联系人姓名：");
			names = sc.next();
			for (Contacts contacts : arraylist) {
				if (contacts.getName().equalsIgnoreCase(names)) {
					System.out.println("该姓名已存在，请重新输入");
					issames = false;
					break;
				}
			}
			if (issames) {
				issame = false;
			}
		}
		
		System.out.println("请输入该联系人性别：");
		String sexs=sc.next();
		
		issame=true;
		String nums=null;
		while (issame) {
			issames=true;
			System.out.println("请输入该联系人号码：");
			nums = sc.next();
			for (Contacts contacts : arraylist) {
				if (contacts.getTelnum().equalsIgnoreCase(nums)) {
					System.out.println("该联系人号码已存在，请重新输入");
					issames = false;
					break;
				}
			}
			if (issames) {
				issame = false;
			}
		}
		
		Contacts con=new Contacts(names, sexs, nums);
		arraylist.add(con);
		System.out.println("成功添加以下联系人：");
		System.out.println(con.toString());
		
	}
	
	@Override
	public void info(ArrayList<Contacts> arraaylist) {
		boolean isnull=true;
		for (Contacts contacts : arraaylist) {
			System.out.println(contacts.toString());
			isnull=false;
		}
		if(isnull){
			System.out.println("当前联系人列表为空，请先添加！");
		}

	}

	@Override
	public void findby(ArrayList<Contacts> arraylist, Scanner sc) {
		System.out.println("请输入欲查询的姓名或性别或电话号码");
		String kind=sc.next();
		System.out.println("查询结果如下：");
		boolean isnull=true;
		for (Contacts contacts : arraylist) {
			if(contacts.getName().equals(kind)||contacts.getSex().equals(kind)||contacts.getTelnum().equals(kind)){
				System.out.println(contacts.toString());
				isnull=false;
			}
		}
		if(isnull){
			System.out.println("查询为空！");
		}

	}

	

}
