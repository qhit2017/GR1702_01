package com.lyl.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRealize implements IInformation {

	@Override
	public void helpinfo() {
		System.out.println("---考生信息管理系统---");
		System.out.println("添加考生信息请输入： 1");
		System.out.println("遍历考生信息请输入： 2");
		System.out.println("进入子菜单请输入：    3");
		
		System.out.println("退出系统请输入：      4");	
	}
	void subHelp(){
		System.out.println("1分最高打印总分");
		System.out.println("2打印数学最高分");
		System.out.println("3打印语文最高分");
		System.out.println("4打印英语最高分");
		System.out.println("5退出");
	}

	//添加考生信息
	@Override
	public void addInformation(ArrayList<Student> arrayList, Scanner sc) {
		String a = sc.next();
	    String[] w = a.split(",");
	    Student student = new Student();
	    int length=w.length;
		if (w.length !=5) {
			System.out.println("你输入的考生信息有误，请按下列格式输入");
			System.out.println("考生姓名,编号,语文成绩,数学成绩,英语成绩,总分");
			} else {
			student.setName(w[0]);
			student.setSerialnumber(w[1]);
			student.setChinesescore(Double.parseDouble(w[2]));
			student.setMathscore(Double.parseDouble(w[3]));
			student.setEnglishscore(Double.parseDouble(w[4]));
			arrayList.add(student);
		}student.toString();
	
		}
     //遍历考生信息
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
     //获取考生总分最高分，单科最高分
	@Override
	public double  getMax(ArrayList<Student> arrayList, String subject) {
		double max =0 ;

		if (subject.equals("总分")) {
			
		
		max=arrayList.get(0).getSum();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getSum()>max) {
				max=arrayList.get(i).getSum();
				
			}
		}
		}if (subject.equals("数学")) {
			
		
		max=arrayList.get(0).getMathscore();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getMathscore ()>max) {
				max=arrayList.get(i).getMathscore();
				
			}
		}
		}if (subject.equals("语文")) {
			
		
		max=arrayList.get(0).getChinesescore();
		for (int i = 0; i <arrayList.size(); i++) {
			
			if (arrayList.get(i).getChinesescore()>max) {
				max=arrayList.get(i).getChinesescore();
				
			}
		}
		}if (subject.equals("英语")) {
			
		
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


