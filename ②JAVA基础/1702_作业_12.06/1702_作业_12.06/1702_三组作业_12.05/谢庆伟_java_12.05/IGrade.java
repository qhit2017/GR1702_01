package com.examgrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午7:19:25 
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
