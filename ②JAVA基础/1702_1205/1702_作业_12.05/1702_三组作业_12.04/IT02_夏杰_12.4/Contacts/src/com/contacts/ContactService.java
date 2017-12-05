package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService implements IContacts {
	
	void helpInfo(){
		System.out.println("ͨѶ¼����ϵͳ");
		System.out.println("1.���ͨѶ¼��Ա");
		System.out.println("2.�鿴����ͨѶ¼��Ա��Ϣ");
		System.out.println("3.�����ֲ��Ҷ�����Ϣ");
		System.out.println("4.���Ա���Ҷ�����Ϣ");
		System.out.println("5.���绰������Ҷ�����Ϣ");
		System.out.println("6.�˳�");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		
		String[] a = s.split(",");
		
		if (a.length != 3) {
			System.out.println("�����ʽ�����밴��С��,��,110���ĸ�ʽ����:");
		}else{
			Contacts contacts = new Contacts();
			
			contacts.setName(a[0]);
			contacts.setSex(a[1]);
			contacts.setTelNum(a[2]);
			
			arrayList.add(contacts);
			
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByNameSexTelNum(ArrayList<Contacts> arrayList,
			String category,Scanner sc) {
		
		String string = sc.next();
		if (category.equals("����")) {
			boolean x=false;
			for (int i = 0; i < arrayList.size(); i++) {
				Contacts a = arrayList.get(i);
				String name = a.getName();
				if (name.equals(string)) {
					x=true;
					System.out.println(a.toString());
					
				} 
			}
			if(!x){
				System.out.println("������Ķ��󲻴��ڣ�");
			}
		}
		if (category.equals("�Ա�")) {
			boolean v=false;
			for (int i = 0; i < arrayList.size(); i++) {
				Contacts a = arrayList.get(i);
				String Sex = a.getSex();
				if (Sex.equals(string)) {
					v=true;
					System.out.println(a.toString());
				} 
					

				}
				
				
			if (!v) {
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
			
			}
		
		if (category.equals("�绰����")) {
			boolean o = false;
			for (int i = 0; i < arrayList.size(); i++) {
				
				Contacts a = arrayList.get(i);
				String telNum = a.getTelNum();
				if (telNum.equals(string)) {
					o=true;
					System.out.println(a.toString());
				}
					

				}
			if (!o) {
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
			}
		}

	}


