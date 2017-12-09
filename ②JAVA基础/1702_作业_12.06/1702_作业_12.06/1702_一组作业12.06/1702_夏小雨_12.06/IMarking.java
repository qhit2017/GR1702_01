package com.xxy;

import java.util.ArrayList;
import java.util.Scanner;



public interface IMarking {

	// 录入考生信息
	void addMarkingSystem(ArrayList<MarkingSystem> arrayList, Scanner sc);

	//查询考生信息
	void infoMarkingSystem(ArrayList<MarkingSystem> arrayList);
	
	void findByName(ArrayList<MarkingSystem> arrayList, String name);
	
	void findByNum(ArrayList<MarkingSystem> arrayList, String name);
	void findByLanguage(ArrayList<MarkingSystem> arrayList, String name);
	void findByMathematics(ArrayList<MarkingSystem> arrayList, String name);
	void findByEnglish(ArrayList<MarkingSystem> arrayList, String name);
}
