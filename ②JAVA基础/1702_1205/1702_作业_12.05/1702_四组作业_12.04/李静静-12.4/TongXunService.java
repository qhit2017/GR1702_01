package lijingjing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TongXunService implements ITongXun {

	void helpInfo() {
		System.out.println("----ͨѶ¼ϵͳ----");
		System.out.println("1	¼��ͨѶ¼��Ϣ");
		System.out.println("2	��ʾ����ͨѶ¼��Ϣ");
		System.out.println("3	��������");
		System.out.println("4	�Ա�����");
		System.out.println("5	�绰����");
		System.out.println("6�˳�����");
	}

	@Override
	public void addTongXun(ArrayList<TongXun> arrayList, Scanner sc) {
		String s = sc.next();
		// ���
		String[] a = s.split(",");
		// �ж�
		if (a.length != 3) {
			System.out.println("���������Ϣ����");
		} else {

			TongXun tongXun = new TongXun(a[0], a[1], a[2]);
			arrayList.add(tongXun);
			System.out.println(tongXun.toString());
		}

	}

	@Override
	public void InFoTongXun(ArrayList<TongXun> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			System.out.println(tongXun.toString());
		}
		System.out.println("�������");
		/*
		 * for (TongXun tongXun : arrayList) {
		 * System.out.println(tongXun.toString()); } Iterator<TongXun> iterator
		 * = arrayList.iterator();
		 * 
		 * while (iterator.hasNext()) { TongXun tongXun = (TongXun)
		 * iterator.next(); System.out.println(tongXun.toString()); }
		 */

	}

	@Override
	public void findbyname(ArrayList<TongXun> arrayList, String name, Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getName();
			if (name.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}
		if (!isFind) {
			System.out.println("������");
		}
	}

	@Override
	public void findbyxingbie(ArrayList<TongXun> arrayList, String xingbie,
			Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getXingbie();
			if (xingbie.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}if (!isFind) {
			System.out.println("������");
		}
		

	}

	@Override
	public void findbydianhua(ArrayList<TongXun> arrayList, String dianhua,
			Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getDianhua();
			if (dianhua.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}
		if (!isFind) {
			System.out.println("������");
		}
	}
}
