package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IEntering {
	
	//帮助
	void help();
	void help3();
	
	//录入信息
	void addInformation(ArrayList<Examinee>arrayList,Scanner sc);
	
	//查询所有考生信息
	void infoEntering(ArrayList<Examinee>arrayList);
	
	//查询成绩最高分
	void findGradeMax(ArrayList<Examinee>arrayList,String Grade);
	
	

}
