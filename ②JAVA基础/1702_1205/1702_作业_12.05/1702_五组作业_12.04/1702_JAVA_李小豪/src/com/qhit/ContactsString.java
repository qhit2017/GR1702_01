package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsString implements IContactsBook {
            void Info(){
            	System.out.println("-----ͨѶ¼����-----");
            	System.out.println("��1�����ͨѶ¼��Ϣ");
            	System.out.println("��2���鿴�������ͨѶ¼��Ϣ");
            	System.out.println("��3����������");
            	System.out.println("��4���Ա����");
            	System.out.println("��5���绰�������");
            	System.out.println("��6���˳�ϵͳ������Quit");
            }
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		//���������ֵ
	String s = sc.next();
	    //���:��������ܵ��ַ�����ֳ��ַ�����
	String[] a = s.split(",");
	if(a.length !=3){
		System.out.println("������ĸ�ʽ����,����������,�밴Jackie,man,12547896���ָ�ʽ����");
	}else{
		Contacts contacts=new Contacts(a[0],a[1],a[2]);
		arrayList.add(contacts);
		System.out.println(contacts.toString());
	}
	   //ͨ���������Ϣ����һ��Contacts��ʵ����Ϣ
	Contacts contacts=new Contacts(a[0],a[1],a[2]);
	   //��ӵ�arrayList����
	arrayList.add(contacts);
	  //��ӡ�ո���ӵ�����ͨѶ¼��Ϣ
	System.out.println(contacts.toString());

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			 Contacts contacts = arrayList.get(i);
			 System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
			boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String String = contacts.getName();
			if(name.equals(String)){
				System.out.println(contacts.toString());
			isFind=true;
				
			}
		}
              if(!isFind){
            	  System.out.println("��Ҫ���ҵĶ��󲻴���");
              }
	}
	 public void findBysex(ArrayList<Contacts> arrayList, String sex) {
		boolean isFind=false;
	for (int i = 0; i < arrayList.size(); i++) {
		Contacts contacts = arrayList.get(i);
		String String = contacts.getSex();
		if(sex.equals(String)){
			System.out.println(contacts.toString());
		isFind=true;
			
		}
	}
          if(!isFind){
        	  System.out.println("��Ҫ���ҵĶ��󲻴���");
          }
}
	 public void findBynum(ArrayList<Contacts> arrayList, String num) {
			boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String String = contacts.getName();
			if(num.equals(String)){
				System.out.println(contacts.toString());
			isFind=true;
				
			}
		}
           if(!isFind){
         	  System.out.println("��Ҫ���ҵĶ��󲻴���");
           }
	}
	@Override
	public void findByName(ArrayList<Contacts> arrayList, Scanner sc,
			String Name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findBySex(ArrayList<Contacts> arrayList, Scanner sc, String Sex) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByNum(ArrayList<Contacts> arrayList, Scanner sc, String Num) {
		// TODO Auto-generated method stub
		
	}

}
