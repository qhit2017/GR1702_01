 package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArray {
	//¼����Ϣ
	void addStudent(ArrayList<Student> arrs,Scanner as);
	//��ʾ������Ϣ
	void infoStudent(ArrayList<Student> arrs);
	//ÿ�Ƶ����ֵ
	void getMax(ArrayList<Student> arrs,String subject);
}