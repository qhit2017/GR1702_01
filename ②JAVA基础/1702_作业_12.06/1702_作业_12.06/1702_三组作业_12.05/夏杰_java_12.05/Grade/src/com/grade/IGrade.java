package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public interface IGrade {
	
	void getHelp();
	
	void addMessage(ArrayList<Grade>arrayList ,Scanner sc);
	
	double getMax(ArrayList<Grade>arrayList,Scanner subject,String sc);
	

}
