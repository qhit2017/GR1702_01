package com.qk;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Scanner;

/**
 * 制作者：陈亮亮 制作时间：2017年12月4日下午3:15:57 邮箱：2507147605@qq.com
 */

public class Contactsser implements IContacts {
	public void help() {
		System.out.println("-----通讯录帮助信息-----");
		System.out.println("-----[1]录入通讯录信息-----");
		System.out.println("-----[2]查看所有信息--------");
		System.out.println("-----[3]按名字查找通讯录信息---");
		System.out.println("-----[4]按性别查找通讯录信息---");
		System.out.println("-----[5]按号码查找通讯录信息---");
		System.out.println("-----[6]退出通讯录信息系统---");
	}

	@Override
	public void add(ArrayList<Contacts> arrayList, Scanner sc) {
		String next = sc.next();
		String[] a = next.split(",");
		if (a.length != 3) {
			System.out.println("你输入的格式有误 ");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void findName(ArrayList<Contacts> arrayList, String category) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (category.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("对象不存在");
		}
	}

	@Override
	public void findsex(ArrayList<Contacts> arrayList, String sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getSex();
			if (sex.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("对象不存在");
		}
	}

	@Override
	public void findNumber(ArrayList<Contacts> arrayList, String Num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getPhonenumber();
			if (Num.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("对象不存在");
		}
	}

}
