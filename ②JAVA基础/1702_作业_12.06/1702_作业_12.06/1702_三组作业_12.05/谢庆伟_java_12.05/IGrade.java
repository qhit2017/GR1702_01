package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����7:19:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IGrade {

	void addexam(ArrayList<ExamScore> arraylist,Scanner sc);
	void info(ArrayList<ExamScore> arraylist);
	void findmax(ArrayList<ExamScore> arraylist,Scanner sc);
	void findsum(ArrayList<ExamScore> arraylist);
	void findchina(ArrayList<ExamScore> arraylist);
	void findmath(ArrayList<ExamScore> arraylist);
	void findenglish(ArrayList<ExamScore> arraylist);
}
