package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLiStExaminee implements IEntering {

	@Override
	public void help() {
		System.out.println("----------�߿�����ϵͳ����----------");
		System.out.println("��1��¼�뿼���ĸ߿���Ϣ������1");
		System.out.println("��2����ʾ���п�����Ϣ������2");
		System.out.println("��3����ѯ��߷�������3");
		System.out.println("��4���˳�����������4");
	}
	@Override
	public void help3() {
		System.out.println("----------�Ӳ˵�----------");
		System.out.println("��1����ӡ�ܷ���߷�������1");
		System.out.println("��2����ӡ��ѧ��߷�������2");
		System.out.println("��3����ӡ������߷�������3");
		System.out.println("��4����ӡӢ����߷�������4");
		System.out.println("��5���˳�������5");
		
	}
	

	@Override
	public void addInformation(ArrayList<Examinee> arrayList, Scanner sc) {
		String a =sc.next();
		String[] arrs = a.split(",");
		if (arrs.length!=5) {
			
			System.out.println("�������ʽ����,���������룬��ʽ����:");
			System.out.println("С��,001,100,100,100");
		} else {
			Examinee q = new Examinee(arrs[0],arrs[1],Double.parseDouble(arrs[2]), Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]));
			arrayList.add(q);
			System.out.println(q.toString());

		}
	}

	@Override
	public void infoEntering(ArrayList<Examinee> arrayList) {
		for (Examinee examinee : arrayList) {
			System.out.println(examinee.toString());
		}

	}

	@Override
	public void findGradeMax(ArrayList<Examinee> arrayList,
			String Grade) {
		double Max = 0;
		if (Grade.equals("�ܳɼ�")) {
	
		Max=arrayList.get(0).getTotal();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(0).getTotal()>Max) {
				Max = arrayList.get(0).getTotal();
				
			}
		}
		System.out.println(Max);
		}
		if (Grade.equals("����")) {
			
			Max = arrayList.get(0).getLanguageGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguageGrade()>Max) {
					Max = arrayList.get(i).getLanguageGrade();
					
				}
			}
			System.out.println(Max);
			}
		if (Grade.equals("��ѧ")) {
			
			Max = arrayList.get(0).getMathematicsGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematicsGrade()>Max) {
					Max = arrayList.get(i).getMathematicsGrade();
					
				}
			}
			System.out.println(Max);
			}
		if (Grade.equals("Ӣ��")) {
			
			Max = arrayList.get(0).getEnglishGrade();
			
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishGrade()>Max) {
					Max = arrayList.get(i).getEnglishGrade();
					
				}
			}
			System.out.println(Max);
			}
		
		
	}

	


	

}
