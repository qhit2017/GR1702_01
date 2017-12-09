/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��6�� ����7:24:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test03;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityPractice implements ICommodity {

	void menu() {
		System.out.println("---����ϵͳ��������---");
		System.out.println("[1]������Ʒ������1");
		System.out.println("[2]����������2");
		System.out.println("[3]����������3");
		System.out.println("[4]�ο����������4");
		System.out.println("[5]�˳�ϵͳ������5");
	}

	@Override
	public void add(ArrayList<Property> arrayList, Scanner sc) {
		String a = sc.next();

		String[] split = a.split(",");

		if (split.length != 4) {
			System.out.println("������ĸ�ʽ����ȷ,�����䣡");
			System.out.println("��ʽΪ��");
			System.out.println("�����,����,�۸�,������");
		} else {
			Property property = new Property();
			property.setId(split[0]);
			property.setName(split[1]);
			property.setPrice(Double.parseDouble(split[2]));
			property.setNumber((int) Double.parseDouble(split[3]));

			arrayList.add(property);

			System.out.println(property.toString());
		}

	}

	@Override
	public void stock(ArrayList<Property> arrayList, Scanner sc) {

		System.out.println("�����������ţ�");
		String a = sc.next();
		String b = arrayList.get(0).getId();

		for (int i = 0; i < arrayList.size(); i++) {
			if (a.equals(b)) {
				System.out.println("�������������");
				int b1 = sc.nextInt();
				int sum = 0;
				int a2 = arrayList.get(0).getNumber();
				sum = a2 + b1;
				arrayList.get(i).setNumber(sum);

				System.out.println("����������:" + sum);
				System.out.println(arrayList.get(i).toString());

			} else {
				System.out.println("����ʧ��,û�и���Ʒ");
			}
		}
	}

	@Override
	public void market(ArrayList<Property> arrayList, Scanner sc) {
		System.out.println("���������۱�ţ�");
		String a = sc.next();
		String b = arrayList.get(0).getId();

		for (int i = 0; i < arrayList.size(); i++) {
			if (a.equals(b)) {
				System.out.println("��������������");
				int b1 = sc.nextInt();
				int sum = 0;
				int a2 = arrayList.get(0).getNumber();
				if (a2 >= b1) {
					sum = a2 - b1;
					arrayList.get(i).setNumber(sum);

					System.out.println("���ۺ�����:" + sum);
					System.out.println(arrayList.get(i).toString());
				} else {
					System.out.println("����ʧ��,�������������㣡");
				}

			} else {
				System.out.println("����ʧ��,û�и���Ʒ");
			}
		}

	}

	@Override
	public void info(ArrayList<Property> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.toString());
		}
		System.out.println("\n������ϣ�\n");

	}

}
