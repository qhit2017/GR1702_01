package com.kyh;

import java.util.ArrayList;
import java.util.Scanner;

public class MarkingSysteml implements Imarking{
	
	void help(){
		System.out.println("~~~~~~~~~~�߿�����ϵͳ~~~~~~~~");
		System.out.println("��1��¼�뿼���ĸ߿���Ϣ");
		System.out.println("��2����ʾ���п�����Ϣ");
		System.out.println("��3����ѯ��߷�");
		System.out.println("��4���˳�����");
	}
	
	void inhelp(){
		System.out.println("[1]��ӡ�ܷ���߷�");
		System.out.println("[2]��ӡ��ѧ��߷�");
		System.out.println("[3]��ӡ������߷�");
		System.out.println("[4]��ӡӢ����߷�");
		System.out.println("[5]�˳�");
	}
	
	@Override
	public void addArrayList(ArrayList<MarkingSystem> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length==5) {
			MarkingSystem markingSystem = new MarkingSystem(a[0], a[1], Double.parseDouble(a[2]), Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(markingSystem);
			
			System.out.println(arrayList.toString());
		} else {
		System.out.println("�����������Ϣ��ʽ����ȷ������");

		}
		
		
	}

	@Override
	public void infoArrayList(ArrayList<MarkingSystem> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		
	}

	@Override
	public void findMaxArrayList(ArrayList<MarkingSystem> arrayList,
			String subject) {
		double Max;
		if (subject.equals("�ܷ�")) {
			 Max = arrayList.get(0).getTotalPoints();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalPoints()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("����ܷ�Ϊ��"+Max);
		}
		
		if (subject.equals("��ѧ")) {
			 Max = arrayList.get(0).getMathScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("��ѧ��߷�Ϊ��"+Max);
		}
	
		if (subject.equals("����")) {
			 Max = arrayList.get(0).getChineseScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChineseScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("������߷�Ϊ��"+Max);
		}
		if (subject.equals("Ӣ��")) {
			 Max = arrayList.get(0).getEnglishScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore()>Max) {
					Max=arrayList.get(i).getTotalPoints();
				}
			}
			System.out.println("Ӣ����߷�Ϊ��"+Max);
		}
	}

	

}
