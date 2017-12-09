 package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArray {
	//录入信息
	void addStudent(ArrayList<Student> arrs,Scanner as);
	//显示所有信息
	void infoStudent(ArrayList<Student> arrs);
	//每科的最大值
	void getMax(ArrayList<Student> arrs,String subject);
}