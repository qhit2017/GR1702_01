package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressService implements IAddress {
	public void helpinfo() {
		System.out.println("******ͨѶ¼����ϵͳ******");
		System.out.println("��1��������һ����ϵ����Ϣ");
		System.out.println("��2����ʾ������ϵ����Ϣ");
		System.out.println("��3��ͨ������������ϵ��");
		System.out.println("��4��ͨ���Ա������ϵ��");
		System.out.println("��5��ͨ���绰������ϵ��");
		System.out.println("��6���˳�");
	}

	@Override
	public void addAddress(ArrayList<Address> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		Address address = new Address(a[0], a[1], a[2]);
		arrayList.add(address);
		System.out.println(address.toString());
	}

	@Override
	public void infoAddress(ArrayList<Address> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Address address = arrayList.get(i);
			System.out.println(address.toString());
		}
	}

	@Override
	public void findname(ArrayList<Address> arrayList, String name) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Address address = arrayList.get(i);
			String name1 = address.getName();
			if (name.equals(name1)) {
				System.out.println(address.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("������");
		}
	}

	@Override
	public void findsex(ArrayList<Address> arrayList, String sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Address address = arrayList.get(i);
			String sex1 = address.getSex();
			if (sex.equals(sex1)) {
				System.out.println(address.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("������");
		}
	}

	@Override
	public void findNum(ArrayList<Address> arrayList, String Num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Address address = arrayList.get(i);
			String num = address.getNum();
			if (Num.equals(num)) {
				System.out.println(address.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("������");
		}
	}
}
