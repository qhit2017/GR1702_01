package com.lyl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:������271406@163.com
 * @date ����ʱ�䣺2017��12��4�� ����3:16:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class ContactsService implements Icontacts {
	
	
	
	
	 void helpinfo(){
		 
		 System.out.println("--ͨѶ¼����ϵͳ--");
		 System.out.println("1  ���ͨѶ¼");
		 System.out.println("2  ������ʾ����ͨѶ¼");
		 System.out.println("3  ͨ������������ϵ��");
		 System.out.println("4  ͨ���Ա������ϵ��");
		 System.out.println("5  ͨ���绰���������ϵ��");
		 System.out.println("6  �˳�");
	 }

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������������밴���¸�ʽ���룺����, �Ա�, �绰����");

		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// ��ͨѭ��
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());

			// ��ǿѭ��
			/*for (Contacts contactss : arrayList) {
				System.out.println(arrayList.toString());
			}
*/
		}

	}

	public void findname(ArrayList<Contacts> arrayList, String name) {
		boolean isQuit = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getName();
			if (name .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit = true;
			} 
			
		}
		if (!isQuit) {
			System.out.println("��Ҫ�ҵ���Ϣ������");
		}
		
		
	}

	public void findsex(ArrayList<Contacts> arrayList, String sex) {
		boolean isQuit = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getSet();
			if (sex .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit =true;
			} 
			
		}
		if (!isQuit) {
			System.out.println("��Ҫ�ҵ���Ϣ������");
		}
		
	
	}

	public void findnum(ArrayList<Contacts> arrayList, String num) {
		boolean isQuit =false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name2 = contacts.getNum();
		
			if (num .equals(name2)) {
				System.out.println(contacts.toString());
				isQuit = true;
			} 

			
		}
		if (!isQuit) {
			System.out.println("��Ҫ�ҵ���Ϣ������");
		}
		
		
	}

	
}
