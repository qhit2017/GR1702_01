package com.it01;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityServe implements ICommodity1 {

	@Override
	public void helpInfo() {
			System.out.println("~~~~~������ϵͳ~~~~~");
			System.out.println("��1������һ����Ʒ");
			System.out.println("��2������");
			System.out.println("��3������");
			System.out.println("��4���鿴���");
			System.out.println("��5���˳�");
	}

	@Override
	public void addCommodity1(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("���������Ϣ����");
		} else {
			Commodity commodity = new Commodity(a[0], a[1],
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity1(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isHas = false;
		if (a.length!=2) {
			System.out.println("���������Ϣ���������޷�����");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber = commodity.getNumber()+Long.parseLong(a[1]);
					commodity.setNumber(newNumber);
					System.out.println(commodity.toString());
					isHas = true;
				}		
			}
			if(!isHas){
				System.out.println("����ʧ��");
			}
		}
	}

	@Override
	public void sellCommodity1(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isHas = false;
		if (a.length!=2) {
			System.out.println("���������Ϣ���������޷�����");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber = commodity.getNumber() - Long.parseLong(a[1]);
						commodity.setNumber(newNumber);
						System.out.println(commodity.toString());
						isHas = true;
					}
				}		
			}
			if(!isHas){
				System.out.println("����ʧ��");
			}
		}
	}

	@Override
	public void infoCommodity1(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
