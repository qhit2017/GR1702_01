package com.lyl.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRealize implements IInformation {

	@Override
	public void helpinfo() {
		System.out.println("---������Ϣ����ϵͳ---");
		System.out.println("��ӿ�����Ϣ�����룺 1");
		System.out.println("����������Ϣ�����룺 2");
		System.out.println("�����Ӳ˵������룺    3");
		
		System.out.println("�˳�ϵͳ�����룺      4");	
	}
	void subHelp(){
		System.out.println("1����ߴ�ӡ�ܷ�");
		System.out.println("2��ӡ��ѧ��߷�");
		System.out.println("3��ӡ������߷�");
		System.out.println("4��ӡӢ����߷�");
		System.out.println("5�˳�");
	}

	//��ӿ�����Ϣ
	@Override
	public void addInformation(ArrayList<Student> arrayList, Scanner sc) {
		String a = sc.next();
	    String[] w = a.split(",");
	    Student student = new Student();
	    int length=w.length;
		if (w.length !=5) {
			System.out.println("������Ŀ�����Ϣ�����밴���и�ʽ����");
			System.out.println("��������,���,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܷ�");
			} else {
			student.setName(w[0]);
			student.setSerialnumber(w[1]);
			student.setChinesescore(Double.parseDouble(w[2]));
			student.setMathscore(Double.parseDouble(w[3]));
			student.setEnglishscore(Double.parseDouble(w[4]));
			arrayList.add(student);
		}student.toString();
	
		}
     //����������Ϣ
	@Override
	public void infoInformation(ArrayList<Student> arrayList) {
	for (int i = 0; i <arrayList.size(); i++) {
		Student student = arrayList.get(i);
		String string = student.toString();
		System.out.println(string);
		
	}

	}

	@Override
	public void findInformation(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub

	}
     //��ȡ�����ܷ���߷֣�������߷�
	@Override
	public double  getMax(ArrayList<Student> arrayList, String subject) {
		double max =0 ;

		if (subject.equals("�ܷ�")) {
			
		
		max=arrayList.get(0).getSum();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getSum()>max) {
				max=arrayList.get(i).getSum();
				
			}
		}
		}if (subject.equals("��ѧ")) {
			
		
		max=arrayList.get(0).getMathscore();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getMathscore ()>max) {
				max=arrayList.get(i).getMathscore();
				
			}
		}
		}if (subject.equals("����")) {
			
		
		max=arrayList.get(0).getChinesescore();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getChinesescore()>max) {
				max=arrayList.get(i).getChinesescore();
				
			}
		}
		}if (subject.equals("Ӣ��")) {
			
		
		max=arrayList.get(0).getEnglishscore();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getEnglishscore()>max) {
				max=arrayList.get(i).getEnglishscore();
				
			}
		}
		}
		 System.out.println(max);
			return max;
		
		}
	   
	}


