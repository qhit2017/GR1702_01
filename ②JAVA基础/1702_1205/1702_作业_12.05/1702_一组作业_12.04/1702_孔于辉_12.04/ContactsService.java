package com.contats;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {

	void helpinfo() {
		System.out.println("~~~~~~~~通讯录信息管理系统~~~~~~~~~");
		System.out.println("【1】增加通讯录信息请输入1");
		System.out.println("【2】显示所有通讯录信息请输入2");
		System.out.println("【3】按姓名搜索请输入3");
		System.out.println("【4】按性别搜索请输入4");
		System.out.println("【5】按电话搜索请输入5");
		System.out.println("【6】退出请输入6");
	}

	@Override
	public void addContatacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String a = sc.next();

		String[] ar = a.split(",");

		if (ar.length == 3) {
			Contacts contacts = new Contacts(ar[0], ar[1], ar[2]);

			arrayList.add(contacts);
			System.out.println(contacts.toString());

		} else {

			System.out.println("您所输入的格式不正确，请按以下格式输入“张三,男,123345685”");
		}

	}

	@Override
	public void infoContatacts(ArrayList<Contacts> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());

		}

		/*
		 * for (Contacts contacts : arrayList) {
		 * System.out.println(arrayList.toString()); }
		 */

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getName();
			if (name.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
		}
		}
		if (!is) {
			System.out.println("您所要查找的对象不存在！！！");
		}

	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String sex) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getSex();
			if (sex.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
			}
			
		}
		if (!is) {
			System.out.println("您所要查找的对象不存在！！！");
		}
	}

	@Override
	public void findByTeinum(ArrayList<Contacts> arrayList, String teinum) {

		boolean is = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String add = contacts.getTeiNum();
			if (teinum.equals(add)) {
				System.out.println(contacts.toString());
				is = true;
			}
			
		}
		 if (!is) {
				System.out.println("您所要查找的对象不存在！！！");
			}
	}

}
