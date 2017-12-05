package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月4日 下午3:17:56 
 * @version 1.0 
 * @function
 */
public class ContactsSerivce implements IContacts {
	
	void helpinfo() {
		System.out.println("---通讯录信息管理系统---");
		System.out.println("【1】增加通讯录信息请输入1");
		System.out.println("【2】显示所有通讯录信息请输入2");
		System.out.println("【3】按姓名搜索请输入3");
		System.out.println("【4】按性别搜索请输入4");
		System.out.println("【5】按电话搜索请输入5");
		System.out.println("【6】退出请输入6");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		
		String[] a = s.split(",");
		
		Contacts contacts = new Contacts(a[0],a[1],a[2]);
		
		arrayList.add(contacts);
		
		System.out.println(contacts.toString());
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
		Contacts contacts = arrayList.get(i);
		System.out.println(contacts.toString());
		}

	}

	public void findByName(ArrayList<Contacts> arrayList,String name) {
		boolean isfindByName = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isfindByName = true;
			}
		}
		if (!isfindByName) {
			System.out.println("你要查询的不存在！");
		}
	}
	
	public void findBySex(ArrayList<Contacts> arrayList,String sex) {
		boolean isfindBySex = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isfindBySex = true;
			}
		}
		if (isfindBySex) {
			System.out.println("你要查找的对象不存在！");
		}
	}
	
	public void findByNum(ArrayList<Contacts> arrayList,String num) {
		boolean isfindByNum = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelnum();
			if (num.equals(string)) {
				System.out.println(contacts.toString());
				isfindByNum = true;
			}
		}
		if (isfindByNum) {
			System.out.println("你要查找的对象不存在！");
		}
	}

	public void helpInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByname(ArrayList<Contacts> arrayList, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findBysex(ArrayList<Contacts> arrayList, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findBynum(ArrayList<Contacts> arrayList, String num) {
		// TODO Auto-generated method stub
		
	}
}
