package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����3:15:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ContactsSer implements IContacts {

	public void help(){
		System.out.println("��1������µ���ϵ��");
		System.out.println("��2���鿴��ǰ��ϵ���б�");
		System.out.println("��3����ѯָ����ϵ��");
		System.out.println("��9���˳�");
	}
	@Override
	public void addcon(ArrayList<Contacts> arraylist, Scanner sc) {
		boolean issame=true;
		boolean issames=true;
		String names=null;
		while (issame) {
			issames=true;
			System.out.println("�������µ���ϵ��������");
			names = sc.next();
			for (Contacts contacts : arraylist) {
				if (contacts.getName().equalsIgnoreCase(names)) {
					System.out.println("�������Ѵ��ڣ�����������");
					issames = false;
					break;
				}
			}
			if (issames) {
				issame = false;
			}
		}
		
		System.out.println("���������ϵ���Ա�");
		String sexs=sc.next();
		
		issame=true;
		String nums=null;
		while (issame) {
			issames=true;
			System.out.println("���������ϵ�˺��룺");
			nums = sc.next();
			for (Contacts contacts : arraylist) {
				if (contacts.getTelnum().equalsIgnoreCase(nums)) {
					System.out.println("����ϵ�˺����Ѵ��ڣ�����������");
					issames = false;
					break;
				}
			}
			if (issames) {
				issame = false;
			}
		}
		
		Contacts con=new Contacts(names, sexs, nums);
		arraylist.add(con);
		System.out.println("�ɹ����������ϵ�ˣ�");
		System.out.println(con.toString());
		
	}
	
	@Override
	public void info(ArrayList<Contacts> arraaylist) {
		boolean isnull=true;
		for (Contacts contacts : arraaylist) {
			System.out.println(contacts.toString());
			isnull=false;
		}
		if(isnull){
			System.out.println("��ǰ��ϵ���б�Ϊ�գ�������ӣ�");
		}

	}

	@Override
	public void findby(ArrayList<Contacts> arraylist, Scanner sc) {
		System.out.println("����������ѯ���������Ա��绰����");
		String kind=sc.next();
		System.out.println("��ѯ������£�");
		boolean isnull=true;
		for (Contacts contacts : arraylist) {
			if(contacts.getName().equals(kind)||contacts.getSex().equals(kind)||contacts.getTelnum().equals(kind)){
				System.out.println(contacts.toString());
				isnull=false;
			}
		}
		if(isnull){
			System.out.println("��ѯΪ�գ�");
		}

	}

	

}
