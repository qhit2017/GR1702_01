package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	void help(){
		System.out.println("ͨѶ��Ϣ����");
		System.out.println("1 ¼����Ϣ");
		System.out.println("2 ��ʾ������Ϣ");
		System.out.println("3 ��������");
		System.out.println("4 �Ա����");
		System.out.println("5 �绰����");
		System.out.println("6 �˳�ϵͳ");
	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// ����
		String s = sc.next();
		// ���
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("���������Ϣ��ʽ����,�밴name,sex,1548962����");
		} else {
			// ����ʵ��
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// ��ӵ�
			arrayList.add(contacts);
			// ���
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}*/
	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getName();
			if (name.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			} 
		}
		if(!isinfo){
			System.out.println("����ҵĶ��󲻴���");
		}
	}

	public void findBySex(ArrayList<Contacts> arrayList, String sex) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getSex();
			if (sex.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			}
		}
		if(!isinfo){
			System.out.println("����ҵĶ��󲻴���");
		}
	}

	public void findBylsum(ArrayList<Contacts> arrayList, String num) {
		boolean isinfo = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String m = contacts.getTelnum();
			if (num.equals(m)) {
				System.out.println(contacts.toString());
				isinfo = true;
			} 
		}
		if(!isinfo){
			System.out.println("����ҵĶ��󲻴���");
		}
	}
}
