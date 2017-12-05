/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午3:13:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CommunicationPractice implements IAddressBook {

	public void getHelp() {
		System.out.println("\t-----通讯录帮助信息-----\n");
		System.out.println("\t[1]录入通讯录信息请输入Add");
		System.out.println("\t[2]遍历通讯录信息请输入Info");
		System.out.println("\t[3]查找通讯录名字请输入Nane");
		System.out.println("\t[4]遍历通讯录性别请输入Sex");
		System.out.println("\t[5]遍历通讯录号码请输入Number");
		System.out.println("\t[6]退出通讯录信息请输入Exit");

	}

	@Override
	public void Add(ArrayList<Contacts> arrayList, Scanner sc) {

		String next = sc.next();

		String[] a = next.split(",");

		if (a.length != 3) {

			System.out.println("---您输入的格式有误!请重输!---");
			System.out.println("格式为：（名字,性别,手机号码）");

		} else {

			Contacts contacts = new Contacts(a[0], a[1], a[2]);

			arrayList.add(contacts);

			System.out.println(contacts.toString());

		}

	}

	@Override
	public void Info(ArrayList<Contacts> arrayList) {

		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());

		}
		System.out.println("\t---加载完毕！---");

	}

	@Override
	public void FindName(ArrayList<Contacts> arrayList, String category) {
		boolean Find = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();

			if (name.equals(name)) {
				System.out.println(contacts.toString());
				System.out.println("\t---加载完毕！---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---您输入的信息不存在---");
		}
	}

	@Override
	public void FindSex(ArrayList<Contacts> arrayList, String sex) {
		boolean Find = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getSex();

			if (sex.equals(name)) {
				System.out.println(contacts.toString());
				System.out.println("\t---加载完毕！---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---您输入的信息不存在---");
		}

	}

	@Override
	public void FindNumber(ArrayList<Contacts> arrayList, String phone) {
		boolean Find = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getPhoneNumber();

			if (phone.equals(name)) {
				System.out.println(contacts.toString());
				System.out.println("\t---加载完毕！---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---您输入的信息不存在---");
		}

	}

}
