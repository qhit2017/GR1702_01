package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��4�� ����3:17:56 
 * @version 1.0 
 * @function
 */
public class ContactsSerivce implements IContacts {
	
	void helpinfo() {
		System.out.println("---ͨѶ¼��Ϣ����ϵͳ---");
		System.out.println("��1������ͨѶ¼��Ϣ������1");
		System.out.println("��2����ʾ����ͨѶ¼��Ϣ������2");
		System.out.println("��3������������������3");
		System.out.println("��4�����Ա�����������4");
		System.out.println("��5�����绰����������5");
		System.out.println("��6���˳�������6");
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
			System.out.println("��Ҫ��ѯ�Ĳ����ڣ�");
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
			System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
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
			System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
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
