package com.qhit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	
	void help(){
		System.out.println("----------ͨѶ¼����----------");
		System.out.println("��1�����ͨӍ���Ϣ������add");
		System.out.println("��2���鿴��ݔ�������ͨѶ¼��Ϣ������info");
		System.out.println("��3�����������Ҷ�Ӧ��ͨѶ¼��Ϣ������findname");
		System.out.println("��4�����Ա���Ҷ�Ӧ��ͨѶ¼��Ϣ������findsex");
		System.out.println("��5�����绰������Ҷ�Ӧ��ͨѶ¼��Ϣ������findnumber");
		System.out.println("��6���˳�ϵͳ������Quit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		
		String s = sc.next();
		//���
		String[] arrs = s.split(",");
		
		
		if (arrs.length!=3) {
			System.out.println("������ĸ�ʽ����ȷ�����������룬��ʽΪ������,�Ա�,�绰��");
		} else {
			Contacts c = new Contacts(arrs[0], arrs[1], arrs[2]);
			
			arrayList.add(c);
			
			System.out.println(arrayList.toString());
			

		}
		

	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		//��ͨѭ��
		/*for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			System.out.println(contacts.toString());
			
		}*/
		
		//��ǿforѭ��
		for (Contacts contacts : arrayList) {
			
			System.out.println(contacts.toString());
		}
		
		//������
		/*Iterator<Contacts>iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			
			Contacts contacts = (Contacts) iterator.next();
			
			System.out.println(contacts.toString());
		}*/
		}

	

	@Override
	public void findBynamesexnumber(ArrayList<Contacts> arrayList,String category,Scanner sc) {
			String next = sc.next();
			if (category.equals("����")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String name = arrayList.get(i).getName();
					if (name.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("��Ҫ���Ҷ��󲻴��ڣ�");
				}
			
	}
			if (category.equals("�Ա�")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String sex = arrayList.get(i).getSex();
					if (sex.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("��Ҫ���Ҷ��󲻴��ڣ�");
				}
			
	}
			if (category.equals("�绰����")) {
				boolean isFind = false;
				for (int i = 0; i <arrayList.size(); i++) {
					String number = arrayList.get(i).getnumber();
					if (number.equals(next)) {
						System.out.println(arrayList.get(i).toString());
						isFind = true;
					} 
				
			}
				if (!isFind) {
					System.out.println("��Ҫ���Ҷ��󲻴��ڣ�");
				}
			
	}

	/*public void findByname(ArrayList<Contacts> arrayList,String name){
		
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getName();
			
			if (name.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
				
			} 
			
			if (!isfind) {
				
				System.out.println("�����ҵĶ��󲻴���!");
			}
			
		}
	}
	public void findBysex(ArrayList<Contacts> arrayList,String sex){
		
		boolean isfind = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getSex();
			
			if (sex.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
			} 
			if (!isfind) {
				
				System.out.println("�����ҵĶ��󲻴���!");
			}
			
		}
	}
	public void findBynumber(ArrayList<Contacts> arrayList,String num){
		
		boolean isfind = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			Contacts contacts = arrayList.get(i);
			
			String string = contacts.getnumber();
			
			if (num.equals(string)) {
				
				System.out.println(contacts.toString());
				
				isfind = true;
				
			} 
			if (!isfind) {
				
				System.out.println("�����ҵĶ��󲻴���!");
			}
			
		}*/
	}
}
