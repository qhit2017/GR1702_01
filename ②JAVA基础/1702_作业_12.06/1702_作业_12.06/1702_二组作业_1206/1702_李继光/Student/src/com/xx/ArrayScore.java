package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScore implements IArray{

	public void help(){
		System.out.println("ѧ���ɼ�����ϵͳ");
		System.out.println("��1¼��ѧ���ɼ���Ϣ");
		System.out.println("��2�鿴����ѧ���ɼ���Ϣ");
		System.out.println("��3�鿴����ѧ���ɼ���߷�");
		System.out.println("��4�˳�ϵͳ");
	}
	public void helpMax(){
		System.out.println("��߷ֲ�ѯ");
		System.out.println("��1��ѯ�ܷ���߷�");
		System.out.println("��2��ѯ��ѧ��߷�");
		System.out.println("��3��ѯ������߷�");
		System.out.println("��4��ѯӢ����߷�");
		System.out.println("��5�˳���߷ֲ�ѯ");
	}
	//¼��ѧ���ɼ���Ϣ
	@Override
	public void addStudent(ArrayList<Student> arrs, Scanner as) {
		String a = as.next();
		String[] se = a.split(",");
		if(se.length!=5){
			System.out.println("��������밴��xxx,0000,00.0,00.0,00.0����ʽ����");
		}else{
			Student student = new Student(se[0], se[1], Double.parseDouble(se[2]),Double.parseDouble(se[3]),Double.parseDouble(se[4]));
			arrs.add(student);
			System.out.println(student.toString());
		}
			
		
	}
	//����������Ϣ
	@Override
	public void infoStudent(ArrayList<Student> arrs) {
		for (int i = 0; i < arrs.size(); i++) {
			System.out.println(arrs.get(i).toString());
		}
		
	}
	//������߷�
	@Override
	public void getMax(ArrayList<Student> arrs, String subject) {
		double Max = 0;
		if(subject.equals("�ܷ�")){
			Max = arrs.get(0).getTotal();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getTotal()>Max){
					Max =arrs.get(i).getTotal();
				}
				
			} 
		}
		if(subject.equals("��ѧ")){
			Max = arrs.get(0).getMathscores();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getMathscores()>Max){
					Max =arrs.get(i).getMathscores();
				}
				
			}
		}
		if(subject.equals("����")){
			Max = arrs.get(0).getChinesescores();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getChinesescores()>Max){
					Max =arrs.get(i).getChinesescores();
				}
				
			}
		}
		if(subject.equals("Ӣ��")){
			Max = arrs.get(0).getEnglishscores();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getEnglishscores()>Max){
					Max =arrs.get(i).getEnglishscores();
				}
				
			}
		}
		System.out.println(Max);
		
	}

}
