package com.Contacts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContacts {
	void p(){
		System.out.println("---ͨѶ¼---");
		System.out.println("1 �����ֻ�ͨѶ¼");
		System.out.println("2 ��ѯȫ������");
		System.out.println("3 ��������");
		System.out.println("4 �ձ����");
		System.out.println("5 �������");
		System.out.println("6 �˳�");
	}

	public void addcontacts(ArrayList<Contacts> arryArrayList, Scanner sc) {
		String a = sc.next();
		String s = sc.next();
		if (s.length() != 3) {
			System.out.println("������ĸ�ʽ����ȷ");
		} else {
			Contacts c = new Contacts();
			arryArrayList.add(c);
			System.out.println(c.toString());
		}

	}

	public void infocontacts(ArrayList<Contacts> arryArrayList, Scanner sc) {
		//��ͨforѭ��
		for (Contacts contacts : arryArrayList) {
			System.out.println(contacts.toString());
		}
		//��ǿforѭ��
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			System.out.println(contacts.toString());

		}
		//������ ���α꿨�ߣ�ֻ�������������ĵط���
		Iterator<Contacts> iterator = arryArrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
	}

	public void findBynum(ArrayList<Contacts> arryArrayList,String num) {
		boolean q = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(num)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
				q = true;
			}
		}
		if (!q) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
		}
	public void findBysex(ArrayList<Contacts> arryArrayList,String sex) {
		boolean d = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(sex)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
				d = true;
			}
		}
		if (!d) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}
			
		}
	public void findByName(ArrayList<Contacts> arryArrayList,String name) {
		boolean u = false;
		for (int i = 0; i < arryArrayList.size(); i++) {
			Contacts contacts = arryArrayList.get(i);
			String string = contacts.getName();
			if (string.equals(name)) {
				System.out.println(contacts.toString());
			} else {
				System.out.println("��Ҫ���ҵĶ��󲻴���");
				u = true;
			}
		}
		System.out.println("��Ҫ���ҵĶ��󲻴���");
			
		}

	@Override
	public void findBySex(ArrayList<Contacts> arryArrayList, String sex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByNum(ArrayList<Contacts> arryArrayList, String num) {
		// TODO Auto-generated method stub
		
	}
			}
			


	


