package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����9:18:32 
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
			System.out.println("������ָ������롾0���鿴������");
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
				System.out.println("��л����ʹ�ã��ټ���");
				break;
			default:
				System.out.println("ָ����Ч������������");
				break;
			}
		}

	}

}
