package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContartsSrevice implements IContarts {
void helpinfo(){
	System.out.println("1	¼��ͨѶ¼��Ϣ");
	System.out.println("2	��ʾ����ͨѶ¼��Ϣ");
	System.out.println("3	��������");
	System.out.println("4	�Ա�����");
	System.out.println("5	�绰����");
	System.out.println("6	�˳�����");
 
}
	 
	@Override
	public void addContarts(ArrayList<Contarts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("����������,eg:���������Ա𣬺��룩   ");
		} else {
			Contarts contarts = new Contarts(a[0], a[1], a[2]);
			arrayList.add(contarts);
			System.out.println(contarts.toString());
		}

	}

	@Override
	public void infoContarts(ArrayList<Contarts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			System.out.println(contarts.toString());
		}
		/*
		 * ��ǿforѭ�� ``// for (Contarts contarts : arrayList) {
		 * System.out.println(contarts.toString()); }
		 */
		// ����
		/*
		 * Iterator<Contarts> iterator = arrayList.iterator(); while
		 * (iterator.hasNext()) { Contarts contarts = (Contarts)
		 * iterator.next(); System.out.println(contarts.toString()); }
		 */

	}

	@Override
	public void findByName(ArrayList<Contarts> arrayList, String name) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getName();
			if (name.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;}}
		if(isfind){
		System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
	}
	}
	@Override
	public void findBySex(ArrayList<Contarts> arrayList, String sex) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getSex();
			if (sex.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;
		}}
		if(isfind){
			System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
		}

	}

	@Override
	public void findByNum(ArrayList<Contarts> arrayList, String num) {
		boolean isfind=true;
		for (int i = 0; i < arrayList.size(); i++) {
			Contarts contarts = arrayList.get(i);
			String string = contarts.getTelnum();
			if (num.equals(string)) {
				System.out.println(contarts.toString());
				isfind=false;
			}}if(isfind){
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
		

	}
}

// @Override
// public void findByNameSexNum(ArrayList<Contarts> arrayList, String category)
// {

