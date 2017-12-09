package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScore implements IArray{

	public void help(){
		System.out.println("学生成绩管理系统");
		System.out.println("按1录入学生成绩信息");
		System.out.println("按2查看所有学生成绩信息");
		System.out.println("按3查看各科学生成绩最高分");
		System.out.println("按4退出系统");
	}
	public void helpMax(){
		System.out.println("最高分查询");
		System.out.println("按1查询总分最高分");
		System.out.println("按2查询数学最高分");
		System.out.println("按3查询语文最高分");
		System.out.println("按4查询英语最高分");
		System.out.println("按5退出最高分查询");
	}
	//录入学生成绩信息
	@Override
	public void addStudent(ArrayList<Student> arrs, Scanner as) {
		String a = as.next();
		String[] se = a.split(",");
		if(se.length!=5){
			System.out.println("输入错误，请按【xxx,0000,00.0,00.0,00.0】格式输入");
		}else{
			Student student = new Student(se[0], se[1], Double.parseDouble(se[2]),Double.parseDouble(se[3]),Double.parseDouble(se[4]));
			arrs.add(student);
			System.out.println(student.toString());
		}
			
		
	}
	//遍历所有信息
	@Override
	public void infoStudent(ArrayList<Student> arrs) {
		for (int i = 0; i < arrs.size(); i++) {
			System.out.println(arrs.get(i).toString());
		}
		
	}
	//计算最高分
	@Override
	public void getMax(ArrayList<Student> arrs, String subject) {
		double Max = 0;
		if(subject.equals("总分")){
			Max = arrs.get(0).getTotal();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getTotal()>Max){
					Max =arrs.get(i).getTotal();
				}
				
			} 
		}
		if(subject.equals("数学")){
			Max = arrs.get(0).getMathscores();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getMathscores()>Max){
					Max =arrs.get(i).getMathscores();
				}
				
			}
		}
		if(subject.equals("语文")){
			Max = arrs.get(0).getChinesescores();
			for (int i = 0; i < arrs.size(); i++) {
				if(arrs.get(i).getChinesescores()>Max){
					Max =arrs.get(i).getChinesescores();
				}
				
			}
		}
		if(subject.equals("英语")){
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
