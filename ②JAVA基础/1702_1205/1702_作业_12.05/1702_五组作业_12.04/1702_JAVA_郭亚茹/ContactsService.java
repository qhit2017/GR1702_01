package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContactsBook {
	void help(){
		System.out.println("---ͨѶ¼����ϵͳ---");
		System.out.println("1 ¼��ͨ����Ϣ������add");
		System.out.println("2 ��ʾͨ��¼��Ϣ������info");
		System.out.println("3 ��������������name");
		System.out.println("4 �Ա�����������sex");
		System.out.println("5 �绰����������tell");
		System.out.println("6 �˳�ϵͳ������exit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arraylist, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������ĸ�ʽ����,���������룡");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arraylist.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			System.out.println(contacts.toString());
		}
	}

	/*��ǿforѭ��
	 * for (Contacts contacts : arraylist) {
	 * System.out.println(contacts.toString());
	 * 
	 * }
	 * ������
	 * Iterator<Contacts> iterator = arraylist.iterator(); while
	 * (iterator.hasNext()) { Contacts contacts = (Contacts) iterator.next();
	 * System.out.println(contacts.toString());
	 */

	@Override
	public void findByname(ArrayList<Contacts> arraylist,String name) {
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isFind=true;
			}
		}if (!isFind) {
			System.out.println("����ҵĶ����ڣ�");
		}	
	}
				
	public void findBysex(ArrayList<Contacts> arraylist,String sex){
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			
			Contacts contacts = arraylist.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind=true;	
			}
		}if (!isFind) {
			System.out.println("����ҵĶ����ڣ�");
		}	
	}
	public void findBytell(ArrayList<Contacts> arraylist,String tell) {
		boolean isFind=false;
		for (int i = 0; i < arraylist.size(); i++) {
			Contacts contacts = arraylist.get(i);
			String string = contacts.getTell();
			if (tell.equals(string)) {
				System.out.println(contacts.toString());	
				isFind=true;
		}
	}if (!isFind) {
		System.out.println("����ҵĶ����ڣ�");
				System.out.println("����ҵĶ����ڣ�");
		}	
    }
}

