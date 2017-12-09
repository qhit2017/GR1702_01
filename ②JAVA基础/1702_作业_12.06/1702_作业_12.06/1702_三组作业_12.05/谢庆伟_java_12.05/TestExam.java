package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午9:18:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestExam {

	public static void main(String[] args) {
		ArrayList<ExamScore> exam=new ArrayList<ExamScore>();
		GradeSer grade=new GradeSer();
		Scanner sc=new Scanner(System.in);
		boolean is=true;
		while (is) {
			System.out.println("请输入指令：（输入【0】查看帮助）");
			String key=sc.next();
			switch (key) {
			case "0":
				grade.help();
				break;
			case "1":
				grade.addexam(exam, sc);
				break;
			case "2":
				grade.info(exam);
				break;
			case "3":
				grade.findmax(exam, sc);
				break;
			case "4":
				is=false;
				System.out.println("感谢您的使用，再见！");
				break;
			default:
				System.out.println("指令无效，请重新输入");
				break;
			}
		}

	}

}
