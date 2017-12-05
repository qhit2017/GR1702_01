package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午4:24:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContactsBook {

	void helpinfo() {
		System.out.println("----通讯录管理系统----");
		System.out.println("--1--录入通讯录");
		System.out.println("--2--显示通讯录信息");
		System.out.println("--3--姓名搜索");
		System.out.println("--4--性别搜索");
		System.out.println("--5--电话搜索");
		System.out.println("--6--退出通讯录");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String s = sc.next();
		// 拆分
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("您输入的信息格式错误，请您重新输入，格式如李小号，男，15896325478这样的");
		} else {
			// 实体类的构造
			Contacts contacts = new Contacts(a[0], a[1], a[2]);

			// 添加arrayList里面
			arrayList.add(contacts);

			// 打印刚刚添加的这条通讯录信息
			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*
		 * //增强for for (Contacts contacts : arrayList) {
		 * System.out.println(contacts.toString()); } //迭代器 Interator<Contacts>
		 * arrayListiterator(); while (iterator.hasNext()) { Contacts contacts =
		 * (Contacts) iterator.next(); System.out.println(contacts.toString());
		 * }
		 */

	}

	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getName();
			if (name.equals(name2)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("您要查找的对象不存在");
			}

		}
		
	

	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name3 = contacts.getSex();
			if (Sex.equals(name3)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("您要查找的对象不存在");

			}

		}
		
	

	public void findBytelNum(ArrayList<Contacts> arrayList, String telNum) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name4 = contacts.getTelNum();
			if (telNum.equals(name4)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			}
			if (!isFind) {
				System.out.println("您要查找的对象不存在");

			}

		}
		
	}

