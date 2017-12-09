package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public abstract  class GradeService implements IGrade {

	@Override
	public void getHelp() {
		// TODO Auto-generated method stub
		System.out.println("----�߿�����ϵͳ----");
		System.out.println("1��¼�뿼����Ϣ��Ϣ");
		System.out.println("2����ʾ���п�����Ϣ");
		System.out.println("3����ѯ�����ɼ�");
		System.out.println("4���˳�ϵͳ");
		

	}

	@Override
	public void addMessage(ArrayList<Grade> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] arrs = s.split(",");
		if (arrs.length!=5) {
			System.out.println("�����ʽ����");
			System.out.println("�밴���¸�ʽ������Ϣ��");
			System.out.println("С��,01,35,69,88");
		} else {
			Grade grade = new Grade();
			grade.setName(arrs[0]);
			grade.setId(arrs[1]);
			grade.setEnglishPoints(Double.parseDouble(arrs[2]));
			grade.setMathPoints(Double.parseDouble(arrs[3]));
			grade.setChinesePoints( Double.parseDouble(arrs[4]));
			grade.getTotalPoints();
			arrayList.add(grade);
			this.infoPoint(arrayList);
		}

	}

	public double getMax(ArrayList<Grade>arrayList,String subject,Scanner sc){
		
		double max = 0;
		if (subject.equals("Ӣ��")) {
			max = arrayList.get(0).getEnglishPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishPoints()>max) {
					max=arrayList.get(i).getEnglishPoints();
				}
			
			}
			System.out.println("Ӣ����߷��ǣ�"+max);
		}
		
		if (subject.equals("��ѧ")) {
			max = arrayList.get(0).getMathPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathPoints()>max) {
					max=arrayList.get(i).getMathPoints();
				}
			
			}
			System.out.println("��ѧ��߷��ǣ�"+max);
		}
		
		if (subject.equals("����")) {
			max = arrayList.get(0).getChinesePoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinesePoints()>max) {
					max=arrayList.get(i).getChinesePoints();
				}
			
			}
			System.out.println("������߷��ǣ�"+max);
		}
		
		if (subject.equals("��߷�")) {
			max = arrayList.get(0).getTotalPoints();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalPoints()>max) {
					max=arrayList.get(i).getTotalPoints();
				}
			
			}
			System.out.println("�ܷ���߷��ǣ�"+max);
		}
		return max;
	}

	public void infoPoint(ArrayList<Grade> arrayList){
		for (Grade grade : arrayList) {
			System.out.println(grade.toString());
			
		}
	}
}
