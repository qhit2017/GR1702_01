package com.AddressBook;

import java.util.ArrayList;

import java.util.Scanner;

public class Contatcs implements IContatc {
	public Contatcs(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	void helpinfo() {
		System.out.println("~~~~~ͨѶ����ϵͳ~~~~~");
		System.out.println("��1��¼��ͨѶ¼��Ϣ");
		System.out.println("��2���鿴������Ϣ");
		System.out.println("��3�������ֲ���ͨѶ��Ϣ");
		System.out.println("��4�����Ա����ͨѶ��Ϣ");
		System.out.println("��5�����������ͨѶ��Ϣ");
		System.out.println("��6���˳�ͨѶ��Ϣϵͳ");

	}

	@Override
	public void addContatc(ArrayList<Contatc> arrayList, Scanner sc) {
		
		String s = sc.next();

		String[] a = s.split(",");

		Contatc contatc = new Contatc(a[0], a[1], a[2]);

		arrayList.add(contatc);

		System.out.println(contatc.toString());

	}

	

		

		/*
		 * for (Contatc contatc : arrayList) {
		 * System.out.println(contatc.toString()); } Iterator<Contatc> iterator
		 * = arrayList.iterator(); while (iterator.hasNext()) { Contatc contatc
		 * = (Contatc) iterator.next(); System.out.println(contatc.toString());
		 * }
		 */
	

	@Override
	public void findByName(ArrayList<Contatc> arrayList,String name) {

		for (int i = 0; i < arrayList.size(); i++) {
			Contatc contatc = arrayList.get(i);
			String name1 = contatc.getName();

			if (name1.equals(name)) {
				System.out.println(contatc.toString());
			}

		}

	}

	@Override
	public void findBySex(ArrayList<Contatc> arrayList,String sex) {

		for (int i = 0; i < arrayList.size(); i++) {
			Contatc contatc = arrayList.get(i);
			String sex1 = contatc.getSex();

			if (sex1.equals(sex)) {
				System.out.println(contatc.toString());
			}

		}

	}

	@Override
	public void findByNum(ArrayList<Contatc> arrayList,String num) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contatc contatc = arrayList.get(i);
			String num1 = contatc.getTelNum();

			if (num1.equals(num)) {
				System.out.println(contatc.toString());
			}

		}

	}

	@Override
	public void infoContatc(ArrayList<Contatc> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contatc contatc = arrayList.get(i);
			System.out.println(contatc.toString());

		}
		
	}

	

}
