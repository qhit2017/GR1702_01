package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午7:25:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class GradeSer implements IGrade {
	public double temp;
	public void help(){
		System.out.println("【1】添加新的成绩信息");
		System.out.println("【2】显示当前所有成绩信息");
		System.out.println("【3】查询最高成绩");
		System.out.println("【4】退出");
	}
	public void sechelp(){
		System.out.println("【1】打印总分最高分\n" 
				+ "【2】打印语文最高分\n" 
				+ "【3】打印数学最高分\n"
				+ "【4】打印英语最高分\n" 
				+ "【5】退出");
	}
	@Override
	public void addexam(ArrayList<ExamScore> arraylist,Scanner sc) {
		System.out.println("请输入新的考生姓名：");
		String a=sc.next();
		System.out.println("请输入该考生编号：");
		String b=sc.next();
		System.out.println("请输入该考生语文成绩：");
		double c=sc.nextDouble();
		System.out.println("请输入该考生数学成绩：");
		double d=sc.nextDouble();
		System.out.println("请输入该考生英语成绩：");
		double e=sc.nextDouble();
		double f=c+d+e;
		ExamScore exam=new ExamScore(a, b, c, d, e, f);
		arraylist.add(exam);
		System.out.println("成功添加以下信息：");
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
			System.out.println("当前列表为空，请先添加！");
		}
	}

	@Override
	public void findmax(ArrayList<ExamScore> arraylist,Scanner sc) {
		System.out.println("---您已进入子菜单---");
		boolean exit=true;
		this.sechelp();
		while(exit){
			System.out.println("请输入指令：（输入【0】查看帮助）");
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
				System.out.println("已返回主菜单");
				break;
			default:
				System.out.println("指令无效，请重新输入");
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
		System.out.println("总成绩最高分是"+max);
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
		System.out.println("语文成绩最高分是"+max);

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
		System.out.println("数学成绩最高分是"+max);

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
		System.out.println("英语成绩最高分是"+max);

	}

}
