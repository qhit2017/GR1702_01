package com.wxxx;

import java.util.ArrayList;
import java.util.Scanner;

/*�����ˣ�����
 *����2017��12��6��ʱ������6:52:24
 *����:2408368509@qq.com
 */

public class ContactsService implements IContacts {

	void help() {
		System.out.println("----�̵�ϵͳ������Ϣ----");
		System.out.println("������ָ����");
		System.out.println("1   ������Ʒ");
		System.out.println("2  �鿴������Ʒ");
		System.out.println("3   ����");
		System.out.println("4   ����");
		System.out.println("5   �˳�");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String n = sc.next();
		String[] s = n.split(",");
		if (s.length == 4) {
			Contacts c = new Contacts();
			c.setName(s[0]);
			c.setPrice(Double.parseDouble(s[1]));
			c.setId(s[2]);
			c.setNumber(Integer.parseInt(s[3]));

			arrayList.add(c);
			System.out.println(c);
		} else {
			System.out.println("������ĸ�ʽ����");
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}

	@Override
	public void stock(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��������Ʒ���");
		String n = sc.next();
		boolean isOk = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getId())) {
				System.out.println("������Ҫ����������");
				int j = sc.nextInt();
				int k = arrayList.get(i).getNumber();
				k += j;
				arrayList.get(i).setNumber(k);
				System.out.println(arrayList.get(i));
				isOk = true;
			}
		}
		if (!isOk) {
			System.out.println("��Ҫ������Ʒ������");
		}
	}

	@Override
	public void market(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("��������Ʒ���");
		String n = sc.next();
		boolean isOk = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getId())) {
				System.out.println("������Ҫ���۵�����");
				int j = sc.nextInt();
				if (j <= arrayList.get(i).getNumber()) {
					int k = arrayList.get(i).getNumber();
					k = k - j;
					arrayList.get(i).setNumber(k);
					System.out.println(arrayList.get(i));
					isOk = true;
				} else {
					System.out.println("���ﲻ�㣬����ʧ��");
				}

			}
		}
		if (isOk) {
			System.out.println("��Ҫ���۵���Ʒ������");
		}
	}

}
