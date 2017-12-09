package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����7:25:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class GradeSer implements IGrade {
	public double temp;
	public void help(){
		System.out.println("��1������µĳɼ���Ϣ");
		System.out.println("��2����ʾ��ǰ���гɼ���Ϣ");
		System.out.println("��3����ѯ��߳ɼ�");
		System.out.println("��4���˳�");
	}
	public void sechelp(){
		System.out.println("��1����ӡ�ܷ���߷�\n" 
				+ "��2����ӡ������߷�\n" 
				+ "��3����ӡ��ѧ��߷�\n"
				+ "��4����ӡӢ����߷�\n" 
				+ "��5���˳�");
	}
	@Override
	public void addexam(ArrayList<ExamScore> arraylist,Scanner sc) {
		System.out.println("�������µĿ���������");
		String a=sc.next();
		System.out.println("������ÿ�����ţ�");
		String b=sc.next();
		System.out.println("������ÿ������ĳɼ���");
		double c=sc.nextDouble();
		System.out.println("������ÿ�����ѧ�ɼ���");
		double d=sc.nextDouble();
		System.out.println("������ÿ���Ӣ��ɼ���");
		double e=sc.nextDouble();
		double f=c+d+e;
		ExamScore exam=new ExamScore(a, b, c, d, e, f);
		arraylist.add(exam);
		System.out.println("�ɹ����������Ϣ��");
		System.out.println(exam.toString());
	}

	@Override
	public void info(ArrayList<ExamScore> arraylist) {
		boolean isnull=true;
		for (ExamScore examScore : arraylist) {
			System.out.println(examScore.toString());
			isnull=false;
		}
		if(isnull){
			System.out.println("��ǰ�б�Ϊ�գ�������ӣ�");
		}
	}

	@Override
	public void findmax(ArrayList<ExamScore> arraylist,Scanner sc) {
		System.out.println("---���ѽ����Ӳ˵�---");
		boolean exit=true;
		this.sechelp();
		while(exit){
			System.out.println("������ָ������롾0���鿴������");
			String keys=sc.next();
			switch (keys) {
			case "0":
				this.sechelp();
				break;
			case "1":
				this.findsum(arraylist);
				break;
			case "2":
				this.findchina(arraylist);
				break;
			case "3":
				this.findmath(arraylist);
				break;
			case "4":
				this.findenglish(arraylist);
				break;
			case "5":
				exit=false;
				System.out.println("�ѷ������˵�");
				break;
			default:
				System.out.println("ָ����Ч������������");
				break;
			}
		}

	}

	@Override
	public void findsum(ArrayList<ExamScore> arraylist) {
		double max=0;
		for (ExamScore examScore : arraylist) {
			double ex=examScore.getsum();
			if(max<ex){
				temp=max;
				max=ex;
				ex=max;
			}
		}
		System.out.println("�ܳɼ���߷���"+max);
	}

	@Override
	public void findchina(ArrayList<ExamScore> arraylist) {
		double max=0;
		for (ExamScore examScore : arraylist) {
			double ex=examScore.getChina();
			if(max<ex){
				temp=max;
				max=ex;
				ex=max;
			}
		}
		System.out.println("���ĳɼ���߷���"+max);

	}

	@Override
	public void findmath(ArrayList<ExamScore> arraylist) {
		double max=0;
		for (ExamScore examScore : arraylist) {
			double ex=examScore.getMath();
			if(max<ex){
				temp=max;
				max=ex;
				ex=max;
			}
		}
		System.out.println("��ѧ�ɼ���߷���"+max);

	}

	@Override
	public void findenglish(ArrayList<ExamScore> arraylist) {
		double max=0;
		for (ExamScore examScore : arraylist) {
			double ex=examScore.getEnglish();
			if(max<ex){
				temp=max;
				max=ex;
				ex=max;
			}
		}
		System.out.println("Ӣ��ɼ���߷���"+max);

	}

}
