/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��4�� ����3:13:48 
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
		System.out.println("\t-----ͨѶ¼������Ϣ-----\n");
		System.out.println("\t[1]¼��ͨѶ¼��Ϣ������Add");
		System.out.println("\t[2]����ͨѶ¼��Ϣ������Info");
		System.out.println("\t[3]����ͨѶ¼����������Nane");
		System.out.println("\t[4]����ͨѶ¼�Ա�������Sex");
		System.out.println("\t[5]����ͨѶ¼����������Number");
		System.out.println("\t[6]�˳�ͨѶ¼��Ϣ������Exit");

	}

	@Override
	public void Add(ArrayList<Contacts> arrayList, Scanner sc) {

		String next = sc.next();

		String[] a = next.split(",");

		if (a.length != 3) {

			System.out.println("---������ĸ�ʽ����!������!---");
			System.out.println("��ʽΪ��������,�Ա�,�ֻ����룩");

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
		System.out.println("\t---������ϣ�---");

	}

	@Override
	public void FindName(ArrayList<Contacts> arrayList, String category) {
		boolean Find = false;

		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();

			if (name.equals(name)) {
				System.out.println(contacts.toString());
				System.out.println("\t---������ϣ�---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---���������Ϣ������---");
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
				System.out.println("\t---������ϣ�---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---���������Ϣ������---");
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
				System.out.println("\t---������ϣ�---");
				Find = true;
			}
		}
		if (!Find) {
			System.out.println("\t---���������Ϣ������---");
		}

	}

}
