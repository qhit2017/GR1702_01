package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsImplements implements IContacts {

	void help(){
		System.out.println("----ͨѶ¼���������Ϣ----");
		System.out.println("����������");
		System.out.println("1  ������ϵ��");
		System.out.println("2  ��ʾ������ϵ��");
		System.out.println("3  ͨ������������ϵ��");
		System.out.println("4  ͨ���Ա������ϵ��");
		System.out.println("5  ͨ�����������ϵ�� ");
		System.out.println("6  �˳�");
	}
	
	
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		
		String[] a = s.split(",");
		
		if (a.length !=3) {
			System.out.println("���Ȳ��ԣ�����������");
		} else {
			Contacts contacts=new Contacts(a[0], a[1], a[2]);
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
	public void findByNameSexNum(ArrayList<Contacts> arrayList, String category,Scanner sc) {
		// TODO Auto-generated method stub
		
		String string = sc.next();
		if (category.equals("����")) {
			
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String name = contacts.getName();
				if (string.equals(name)) {
					System.out.println(contacts.toString());
					isname=true;
					}
				
				if(!isname){
					System.out.println("����������ϵ�˲�����");
				}
		}
	}
		if (category.equals("�Ա�")) {
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String sex = contacts.getSex();
				if (string.equals(sex)) {
					System.out.println(contacts.toString());
					isname=true;
				}				
				if(!isname){
					System.out.println("����������ϵ�˲�����");
				}
			}
		}
		if (category.equals("����")) {
			for (Contacts contacts : arrayList) {
				boolean isname=false;
				String num = contacts.getTelnum();
				if (string.equals(num)) {
					System.out.println(contacts.toString());
					isname=true;
				}
				if(!isname){
					System.out.println("����������ϵ�˲�����");
				}
			}
		}
	}
}
