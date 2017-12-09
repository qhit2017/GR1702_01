package com.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore{
	
	void helpSubInfo(){
		System.out.println("-----�Ӳ˵�-----");
		System.out.println("[1]  �ܳɼ���߷֣�������1;");
		System.out.println("[2]  ��ѧ��߷֣�������2;");
		System.out.println("[3]  ������߷֣�������3;");
		System.out.println("[4]  Ӣ����߷֣�������4;");
		System.out.println("[5]  �������˵�, ������5;");
	}
	@Override
	public void help() {
		System.out.println("-----�߿�����ϵͳ-----");
		System.out.println("[1]¼�뿼����Ϣ��������1;");
		System.out.println("[2]��ѯ������Ϣ��������2;");
		System.out.println("[3]������߷�����ѯ���Ӳ˵���������3;");
		System.out.println("[4]�˳���ѯϵͳ��������4;");
		
		
	}

	@Override
	public void addExaminee(ArrayList<student> arrayList, Scanner sc) {
		// �Ӽ���¼�룺
				String s = sc.next();
				// ����ַ���
				String[] a = s.split(",");

				int leanth = a.length;

				if (leanth != 5) {
					System.out.println("���������Ϣ��������������,��ʽ����");
					System.out.println("���001��120��99��65");
				} else {

					// ʵ����student��
					student student = new student();
					// Ϊ���������Ϣ
					student.setName(a[0]);
					student.setId(a[1]);
					student.setLanguageScore(Double.parseDouble(a[2]));
					student.setMathematicsScore(Double.parseDouble(a[3]));
					student.setEnglishScore(Double.parseDouble(a[4]));
					// ���ӿ�����Ϣ
					arrayList.add(student);
					//����¼����Ϣ
					//infoStudent(arrayList);
					System.out.println(student.toString());
				}
	}

	@Override
	public void Information(ArrayList<student> arrayList) {
		student student;
		for (int i = 0; i < arrayList.size(); i++) {
			student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}
	}

	@Override
	public double getMax(ArrayList<student> arrayList, String subject) {
		double max = max(arrayList, subject);
		return max;
	}
		private double max(ArrayList<student> arrayList, String subject) {
			double max = 0;
			if (subject.equals("�ܳɼ�")) {
				max = arrayList.get(0).getTotalScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getTotalScore() > max) {
						max = arrayList.get(i).getTotalScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("����")) {
				max = arrayList.get(0).getLanguageScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getLanguageScore() > max) {
						max = arrayList.get(i).getLanguageScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("��ѧ")) {
				max = arrayList.get(0).getMathematicsScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMathematicsScore() > max) {
						max = arrayList.get(i).getMathematicsScore();
					}
				}System.out.println(max);
			}
			if (subject.equals("Ӣ��")) {
				max = arrayList.get(0).getEnglishScore();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglishScore() > max) {
						max = arrayList.get(i).getEnglishScore();
					}
				}System.out.println(max);
			}
			return max;
	}

	
}
